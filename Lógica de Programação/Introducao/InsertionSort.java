import java.util.Scanner;

public class InsertionSort {

    public static void main(String[] args) {
        Scanner tcl = new Scanner(System.in);
        int vetor[] = new int[5];       
        System.out.println("Digite os valores do vetor");
        
        for (int i = 0; i < vetor.length; i++) {
            vetor[i] = tcl.nextInt();
        }

        for (int i = 0; i < vetor.length; i++) {
            int a = vetor[i];
            for (int j = i - 1; j >= 0 && vetor[j] > a; j--) {
                vetor[j + 1] = vetor[j];
                vetor[j] = a;
            }
        }
        for (int i = 0; i < vetor.length; i++) {
            System.out.print(" " + vetor[i]);
        }
    }

}
