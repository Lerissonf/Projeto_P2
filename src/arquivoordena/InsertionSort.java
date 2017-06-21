package arquivoordena;

public class InsertionSort implements InterOrdenacao { 
	 
	public static int[] sort (int[] vetor){
	
	 for (int i = 0; i < vetor.length; i++) {
         int atual = vetor[i];
         int j = i - 1;
         while (j >= 0 && vetor[j] >= atual) {
             vetor[j + 1] = vetor[j];
             j--;
         	}
         vetor[j + 1] = atual;;
     	}
	 return vetor;
	}
}
	
