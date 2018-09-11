import java.util.Arrays;
import java.util.Random;

/**
 *
 * @author Carlos Estevao
 */
public class QuickSort {
    public static void main(String[] args) {
         Random numero = new Random();
        int vetor[] = new int[10];
      
        for (int i = 0; i < vetor.length; i++) {
            vetor[i] = numero.nextInt(101);
        }
        // Escrevendo os dados do vetor desordenado
        System.out.println(Arrays.toString(vetor));
        quicksort(vetor, 0, vetor.length-1);
        System.out.println(Arrays.toString(vetor));
    }

    private static void quicksort(int[] vetor, int esq, int dir) {
       if (esq < dir) {
           int j = particiona(vetor, esq, dir);
           quicksort(vetor, esq, j-1);
           quicksort(vetor, j+1, dir);           
       }
    }

    private static int particiona(int[] vetor, int esq, int dir) {
        int i = esq; 
        int j = dir;
        
        while (i < j) {
            while (i < dir && vetor[i] <= vetor[esq]) i++;
            while (j > esq && vetor[j] >= vetor[esq]) j--;
            if (i < j) {
                trocar(vetor, i, j);
                i++;
                j++;
            }
        }
        trocar(vetor, esq, j);
        return j;    
    }

     private static void trocar(int[] vetor, int i, int j) {
       int aux = vetor[i];
       vetor[i] = vetor[j];
       vetor[j] = aux;
        
    }

  

   

  
    
}
