package ClasseString;

import java.util.Scanner;

public class ex1 {
    public static void main(String[] args) {
        String palavra = "computador";
        char palavraAux[] = new char[palavra.length()];
        String palavraResp = null;

        Scanner tcl = new Scanner(System.in);

        for (int i = 0; i < palavra.length(); i++) {
            palavraAux[i] = 'X';
        }

        while (true) {
            System.out.println("Digite a letra ");
            char letra = tcl.nextLine().charAt(0);

            for (int i = 0; i < palavra.length(); i++) {
                if (palavra.charAt(i) == letra) {
                    palavraAux[i] = letra;
                }
            }

            for (int i = 0; i < palavra.length(); i++) {
                System.out.print(palavraAux[i]);
            }

            System.out.println("");
            palavraResp = "";
            for (int i = 0; i < palavra.length(); i++) {
                palavraResp = palavraResp + palavraAux[i];
            }
            
            if (palavra.equals(palavraResp)) {
                System.out.println("Parabéns! Você encontrou a palavra correta");
                break;
            }
        }
    }
}
