
import java.util.Arrays;
import java.util.Random;

/**
 *
 * @author Carlos Estevao
 */
public class MergeSort {

    public static void main(String[] args) {
        Random numero = new Random();
        int vetor[] = new int[10];
        int vetorAux[] = new int[vetor.length];

        for (int i = 0; i < vetor.length; i++) {
            vetor[i] = numero.nextInt(101);
        }
        // Escrevendo os dados do vetor desordenado
        System.out.println(Arrays.toString(vetor));

        System.out.println("");
        int p = 0;
        int r = vetor.length - 1;

        MergeSort(vetor, vetorAux, p, r);
        System.out.println(Arrays.toString(vetor));
    }

    private static void MergeSort(int[] vetor, int[] vetorAux, int p, int r) {
        if (p < r) {
            int q = (p + r) / 2;
            MergeSort(vetor, vetorAux, p, q);
            MergeSort(vetor, vetorAux, q + 1, r);
            Merge(vetor, vetorAux, p, q, r);
        }
    }

    private static void Merge(int[] vetor, int[] vetorAux, int p, int q, int r) {
        for (int i = p; i <= r; i++) {
            vetorAux[i] = vetor[i];
        }

        int k = p;
        int l = q + 1;

        for (int i = p; i <= r; i++) {
            if (k > q) {
                vetor[i] = vetorAux[l++];
            } else if (l > r) {
                vetor[i] = vetorAux[k++];
            } else if (vetorAux[k] < vetorAux[l]) {
                vetor[i] = vetorAux[k++];
            } else {
                vetor[i] = vetorAux[l++];
            }
        }
    }
}
