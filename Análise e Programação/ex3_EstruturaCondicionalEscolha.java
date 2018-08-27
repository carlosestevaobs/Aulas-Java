import java.util.Scanner;
public class ex3_EstruturaCondicionalEscolha {
    public static void main(String[] args) {
        Scanner tcl = new Scanner(System.in);
        int valor = tcl.nextInt();
        switch (valor) {
            case 1:
                System.out.println("Domingo");
                break;
            case 2:
                System.out.println("Segunda");
                break;
            case 3:
                System.out.println("Terça");
                break;
            case 4:
                System.out.println("Quarta");
                break;
            case 5:
                System.out.println("Quinta");
                break;
            case 6:
                System.out.println("Sexta");
                break;
            case 7:
                System.out.println("Sábado");
                break;
            default:
                System.out.println("O valor não existe para um dia da semana");                
        }
    }
}
