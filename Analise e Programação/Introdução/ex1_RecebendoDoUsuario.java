// Importar classe para receber dados
import java.util.Scanner;
// Criação da classe
public class ex1_RecebendoDoUsuario {
    // Criação do método principal
    public static void main (String [] args) {
        // criação do objeto para receber dados
        Scanner tcl = new Scanner(System.in);
        // mensagem para o usuário
        System.out.println("Digite dois valores");
        // recebendo o dado digitado
        int num1 = tcl.nextInt();
        int num2 = tcl.nextInt();
        // mostrando a soma dos valores digitados
        System.out.println("A Soma é "+(num1+num2));
        
        
    }
}
