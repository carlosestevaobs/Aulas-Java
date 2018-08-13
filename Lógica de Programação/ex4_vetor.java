import java.util.Scanner;

public class ex4_vetor {

    public static void main(String[] args) {
        Scanner tcl = new Scanner(System.in);
        System.out.println("Digite o tamanho do vetor");
        int tamanho = tcl.nextInt();        
        int vetor[] = new int[tamanho];
        // recebendo os valores no vetor
        for (int i = 0; i < tamanho; i++) {
            System.out.println("Digite o número " + (i + 1));
            vetor[i] = tcl.nextInt();
        }
        // colocar 0 se o número for par e 1 se ímpar
        for (int i = 0; i < tamanho; i++) {
            if (vetor[i] % 2 == 0) {
                vetor[i] = 0;
            } else {
                vetor[i] = 1;
            }
        }
        
        // escrevendo os valores do vetor
        for (int i = 0; i < tamanho; i++) {
            System.out.print(vetor[i] + " ");
        }
        
        
    }
}
