import java.util.Scanner;

public class BubbleSort {
    public static void main(String[] args) {
        Scanner tcl = new Scanner(System.in);
        int aux = 0;
        int vetor[] = new int[5];
        // Recebendo os dados do usuário
        for (int i = 0; i < vetor.length; i++) {
            vetor[i] = tcl.nextInt();
        }
        // Fazendo a ordenação em ordem crescente
        for (int i = 0; i <= vetor.length-1; i++) {
            for (int j = 0; j <= vetor.length-2; j++) {
                if (vetor[j] > vetor[j+1]) {
                    aux = vetor[j];
                    vetor[j] = vetor[j+1];
                    vetor[j+1] = aux;
                }
            }
        }
        // Mostrando os dados
        for (int i = 0; i < vetor.length; i++) {
            System.out.print(vetor[i]+ " \t");
        }
    }

}
