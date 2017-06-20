package arquivoordena;
import java.util.Scanner;
import java.io.IOException;

public class ProgramaPrincipal {

    public static void main(String[] args) throws IOException {

        Arquivo arquivo = new Arquivo();
        Ordenacao ordenar = new Ordenacao();
        int[] arrayDesordenado = new int[65000];
        int[] arrayOrdenado = new int[65000];
        Scanner ler = new Scanner(System.in);

        System.out.printf("Informe o caminho de arquivo texto:\n");
        String caminho_entrada = ler.nextLine();
        arrayDesordenado = arquivo.lerArquivo(caminho_entrada);
        
        //arrayOrdenado = ordenar.insertionSort(arrayDesordenado);
        //arrayOrdenado = ordenar.selectionSort(arrayDesordenado);
        //arrayOrdenado = ordenar.bubbleSort(arrayDesordenado);
        arrayOrdenado = ordenar.mergeSort(arrayDesordenado);
        arrayOrdenado = ordenar.quickSort(arrayDesordenado);
        arrayOrdenado = ordenar.heapSort(arrayDesordenado);
        System.out.printf("Informe o caminho de saida texto:\n");
        String caminho_saida = ler.nextLine();
       
        arquivo.gravarArquivo(caminho_saida, arrayOrdenado);
    }
}
