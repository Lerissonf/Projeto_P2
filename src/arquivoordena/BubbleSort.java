package arquivoordena;

public class BubbleSort implements InterOrdenacao {
	
	  public static int[] sort(int vetor[]) {
	        for (int i = vetor.length; i >= 1; i--) {
	            for (int j = 1; j < i; j++) {
	                if (vetor[j - 1] > vetor[j]) {
	                    int aux = vetor[j];
	                    vetor[j] = vetor[j - 1];
	                    vetor[j - 1] = aux;
	                }
	            }
	        }
	        return vetor;
	    }

}
