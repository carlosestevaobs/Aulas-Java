import java.util.Scanner;
public class ex2_EstruturaCondicional {

    public static void main(String[] args) {
        Scanner tcl = new Scanner(System.in);
        System.out.println("Digite os valores");
        int num1 = tcl.nextInt();
        int num2 = tcl.nextInt();
        // estrutura condicional se (if)
        if (num1 > num2) {
            System.out.println("O primeiro valor é o maior");
        } else if (num1 < num2){
            System.out.println("O segundo valor é o maior");
        } else {
            System.out.println("Os valores são iguais");
        }
    }
}
