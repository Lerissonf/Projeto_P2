package arquivoordena;

import excecoes.ArrayEmptyException;

public class Ordenacao {

    public int[] insertionSort(int[] vetor) {
        long tempoinicial = System.currentTimeMillis();
        vetor = InsertionSort.sort(vetor);
        long tempofinal = System.currentTimeMillis();
        long tempototal = tempofinal - tempoinicial;
        System.out.println("Tempo de Processamento de InsertionSort: " + tempototal + "ms");
        return vetor;
    }

    public int[] selectionSort(int[] vetor) {
        long tempoinicial = System.currentTimeMillis();
        vetor = SelectionSort.sort(vetor);
        long tempofinal = System.currentTimeMillis();
        long tempototal = tempofinal - tempoinicial;
        System.out.println("Tempo de Processamento de SelectionSort: " + tempototal + "ms");
        return vetor;
    }

    public int[] bubbleSort(int vetor[]) {
        long tempoinicial = System.currentTimeMillis();
        vetor = BubbleSort.sort(vetor);
        long tempofinal = System.currentTimeMillis();
        long tempototal = tempofinal - tempoinicial;
        System.out.println("Tempo de Processamento de BubbleSort: " + tempototal + "ms");
        return vetor;
    }

    public int[] mergeSort(int[] array) {
        long tempoinicial = System.currentTimeMillis();
        array = MergeSort.sort(array);
        long tempofinal = System.currentTimeMillis();
        long tempototal = tempofinal - tempoinicial;
        System.out.println("Tempo de Processamento de MergeSort: " + tempototal + "ms");
        return array;
    }
    
    public int[] quickSort(int[] array) {
        long tempoinicial = System.currentTimeMillis();
        array = QuickSort.sort(array, 0, (array.length - 1));
        long tempofinal = System.currentTimeMillis();
        long tempototal = tempofinal - tempoinicial;
        System.out.println("Tempo de Processamento de QuickSort: " + tempototal + "ms");
        return array;
    }
    
    public int[] heapSort(int[] array) throws ArrayEmptyException {
        long tempoinicial = System.currentTimeMillis();
        if (array == null){
            throw new ArrayEmptyException( "O array não pode estar vazio");
        }
        array = HeapSort.sort(array);
        long tempofinal = System.currentTimeMillis();
        long tempototal = tempofinal - tempoinicial;
        System.out.println("Tempo de Processamento de HeapSort: " + tempototal + "ms");
        return array;
    }
    
    public void imprimirVetor(int[] array) {
        for (int counter = 0; counter < (array.length - 1); counter++) {
            //System.out.println(array[counter]);
        }
    }
}
