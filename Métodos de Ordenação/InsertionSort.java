
/**
 *
 * @author Carlos Estevao
 *
 * Algoritmos baseados no livro Algoritmos - Teoria e Prática - Cormen et al
 * Complexidade no pior caso = O(n^2)
 */

import java.util.Arrays;
import java.util.Random;

public class InsertionSort {

    public static void main(String[] args) {
        Random numero = new Random();
        int vetor[] = new int[10];
        for (int i = 0; i < vetor.length; i++) {
            vetor[i] = numero.nextInt(101);
        }
        // Escrevendo os dados do vetor desordenado
        System.out.println(Arrays.toString(vetor));

        System.out.println("");
        int chave, i;
        // Insertion Sort
        for (int j = 1; j < vetor.length; j++) {
            chave = vetor[j];
            //Inserir vetor[i] na sequência ordenada vetor[1.. i - 1]
            i = j - 1;
            while (i >= 0 && vetor[i] >= chave) {
                vetor[i + 1] = vetor[i];
                i = i - 1;
            }
            vetor[i + 1] = chave;
        }
        // Escrevendo os dados do vetor ordenado
        System.out.println(Arrays.toString(vetor));
    }
}
