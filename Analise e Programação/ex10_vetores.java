import java.util.Scanner;
public class ex10_vetores {
    public static void main(String[] args) {
       Scanner tcl = new Scanner(System.in);
        System.out.println("Digite a quantidade de valores que deseja inserir");
        int tamanho = tcl.nextInt();
        int vetor[] = new int[tamanho];
        System.out.println("Digite os "+tamanho+" valores");
        for (int i = 0; i < tamanho; i++) {
            vetor[i] = tcl.nextInt();
        }
    }
}
