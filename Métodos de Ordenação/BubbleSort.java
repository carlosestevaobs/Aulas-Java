import java.util.Scanner;

public class BubbleSort {
    public static void main(String[] args) {
        Scanner tcl = new Scanner(System.in);
        int aux = 0;
        int vetor[] = new int[10];
        // Recebendo os dados do usuário
        for (int i = 0; i < vetor.length; i++) {
            vetor[i] = tcl.nextInt();
        }
        // Fazendo a ordenação em ordem crescente
        for (int i = 0; i < vetor.length; i++) {
            for (int j = 0; j < vetor.length; j++) {
                if (vetor[i] < vetor[j]) {
                    aux = vetor[i];
                    vetor[i] = vetor[j];
                    vetor[j] = aux;
                }
            }
        }
        // Mostrando os dados
        for (int i = 0; i < vetor.length; i++) {
            System.out.println(vetor[i]);
        }
    }

}
