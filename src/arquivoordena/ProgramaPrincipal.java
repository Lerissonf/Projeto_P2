package arquivoordena;
import java.util.Scanner;

import excecoes.ArrayEmptyException;
import excecoes.EntradaVazioException;
import excecoes.IllegalArgumentException;
import excecoes.MyFileNotFoundException;

import java.io.IOException;
public class ProgramaPrincipal {

    public static void main(String[] args) throws IOException, EntradaVazioException, IllegalArgumentException, MyFileNotFoundException, ArrayEmptyException {

        Arquivo arquivo = new Arquivo();
        Ordenacao ordenar = new Ordenacao();
        //int[] arrayDesordenado = new int[255];
        //int[] arrayOrdenado = new int[255];
        //Scanner ler = new Scanner(System.in);
        
       
        @SuppressWarnings("resource")
		Scanner ler = new Scanner(System.in);
        System.out.printf("Informe o caminho de saida do arquivo texto:\n");
		String caminho = ler.nextLine();
        try{
        	if (caminho.isEmpty()){
                throw new EntradaVazioException("");
            }
		
        }
        catch(EntradaVazioException ex1){
        	System.out.println("O caminho não pode estar vazio" + ex1);
        	System.out.println("Informe o caminho de saida do arquivo texto:\n");
    		caminho = ler.nextLine();
        }
        finally{
	        boolean boleano = true;
	        while(boleano) 
	        {
	        	
	        	System.out.print( "informe os valores a serem ordenados um por vez ou 909909 para parar de adicionar: 1" );
	            String caminho_entrada_saida = ler.nextLine(); 
	            
	            try{
	            	if(caminho_entrada_saida.isEmpty()){
	            		throw new IllegalArgumentException("");
	            	  }
	            	}
	            	
	            catch(IllegalArgumentException ex2){
	            	
	            	System.out.println("Você não pode encerrar sem digitar algo! " + ex2);
	            	System.out.print( "informe os valores a serem ordenados um por vez ou 909909 para parar de adicionar: 2" );
		            caminho_entrada_saida = ler.nextLine(); 	
	            }
	            finally
	            {
	            
		            int conv = Integer.parseInt(caminho_entrada_saida);
		            try{
		                if (conv == 909909 & InterfaceEntradaTamanho.entrada.size() == 0){
		                    throw new ArrayEmptyException("");
		                }
		            }
		            catch(ArrayEmptyException ex){
		                System.out.println("O array não pode estar vazio " + ex);
		                System.out.print( "informe os valores a serem ordenados um por vez ou 909909 para parar de adicionar: " );
		                caminho_entrada_saida = ler.nextLine();
		            }
		            finally{
		                
		            
		                conv = Integer.parseInt(caminho_entrada_saida);
		                
		                if (conv == 909909)
		                {
		                    boleano = false;
		                }
		                else
		                {
		                    InterfaceEntradaTamanho.entrada.add(conv);
		                }       
		            
		                
		                
			            /*if (conv == 909909)
			            {
			                boleano = false;
			            }
			            else
			            {
			                InterfaceEntradaTamanho.entrada.add(conv);
			            }    */        
		        
		            }
		       	}  
		    }
	    
	    }
	     int[] arrayDesordenado = new int[ InterfaceEntradaTamanho.entrada.size()];
				        int[] arrayOrdenado = new int[InterfaceEntradaTamanho.entrada.size()];
				        for (int counter = 0; counter < (arrayDesordenado.length); counter++) 
				        {
				        arrayDesordenado[counter] = InterfaceEntradaTamanho.entrada.get(counter);
				        }
				       
				        
				        arrayOrdenado = ordenar.insertionSort(arrayDesordenado);
				        arrayOrdenado = ordenar.selectionSort(arrayDesordenado);
				        arrayOrdenado = ordenar.bubbleSort(arrayDesordenado);
				        arrayOrdenado = ordenar.mergeSort(arrayDesordenado);
				        arrayOrdenado = ordenar.quickSort(arrayDesordenado);
				        //try {
							arrayOrdenado = ordenar.heapSort(arrayDesordenado);
						//} catch (ArrayEmptyException e) {
							//e.printStackTrace();
						//	System.out.print( "o array nao pode estar vazio!: " );
						//}
				        
				
				       
				        	arquivo.gravarArquivo(caminho, arrayOrdenado);
    }
}
  
