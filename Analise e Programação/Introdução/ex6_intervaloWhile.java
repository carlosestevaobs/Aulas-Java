import java.util.Scanner;

public class ex6_intervaloWhile {
    public static void main(String[] args) {
        Scanner tcl = new Scanner(System.in);
        System.out.println("Digite dois valores");
        int num1 = tcl.nextInt();
        int num2 = tcl.nextInt();        
        if (num1 > num2) {
            while (num1 >= num2) {
                System.out.println(num1);
                num1--;
            }
        } else if (num1 < num2) {
            while (num1 <= num2) {
                System.out.println(num1);
                num1++;
            }
        } else {
            System.out.println("Não existe intervalo pois os números são iguais");
        }
    }
}
