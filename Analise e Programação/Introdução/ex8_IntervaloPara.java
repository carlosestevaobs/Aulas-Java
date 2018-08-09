import java.util.Scanner;
public class ex8_IntervaloPara {
    public static void main(String[] args) {
        Scanner tcl = new Scanner(System.in);
        System.out.println("Digite dois valores");
        int num1 = tcl.nextInt();
        int num2 = tcl.nextInt();
        if (num1 > num2) {
            for (; num1 >= num2; num1--) {
                System.out.println(num1);
            }
        } else if (num1 < num2) {
            for (; num1 <= num2; num1++) {
                System.out.println(num1);
            }
        } else {
            System.out.println("Não possui intervalo");
        }
    }
}
