import java.util.Scanner;

public class ex5_vetorMaiorMenor {
    public static void main(String[] args) {
        Scanner tcl = new Scanner(System.in);
        System.out.println("Digite o tamanho do vetor");
        int tamanho = tcl.nextInt();
        int vetor[] = new int[tamanho];
        
        // recebendo os dados do usuário
        for (int i = 0; i < vetor.length; i++) {
            vetor[i] = tcl.nextInt();
        }
        int menor = 100000;        
        for (int i = 0; i < vetor.length; i++) {
            if (menor > vetor[i]) {
                menor = vetor[i];
            } 
        }
        int maior = 0;
         for (int i = 0; i < vetor.length; i++) {
            if (maior < vetor[i]) {
                maior = vetor[i];
            } 
        }
        System.out.println("Menor: "+ menor);
        System.out.println("Maior: "+ maior);
       
    }
}
