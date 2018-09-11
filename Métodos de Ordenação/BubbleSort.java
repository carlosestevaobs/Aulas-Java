
/**
 *
 * @author Carlos Estevao
 *
 * Algoritmos baseados no livro Algoritmos - Teoria e Prática - Cormen et al
 * Complexidade no pior caso = O(n^2)
 */
import java.util.Arrays;
import java.util.Random;

public class BubbleSort {

    public static void main(String[] args) {
        Random numero = new Random();
        int vetor[] = new int[10];
        for (int i = 0; i < vetor.length; i++) {
            vetor[i] = numero.nextInt(101);
        }
        // Escrevendo os dados do vetor desordenado
        System.out.println(Arrays.toString(vetor));

        System.out.println("");
        int aux;
        // Bubble sort
        for (int i = 0; i < vetor.length; i++) {
            for (int j = vetor.length - 1; j >= i + 1; j--) {
                if (vetor[j] < vetor[j - 1]) {
                    aux = vetor[j];
                    vetor[j] = vetor[j - 1];
                    vetor[j - 1] = aux;
                }
            }
        }

        // Escrevendo os dados do vetor ordenado
        System.out.println(Arrays.toString(vetor));
    }
}
