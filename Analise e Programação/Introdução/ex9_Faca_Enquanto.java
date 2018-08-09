import java.util.Scanner;
public class ex9_Faca_Enquanto {
    public static void main(String[] args) {
        Scanner tcl = new Scanner(System.in);
        System.out.println("Digite um valor");
        int num1 = tcl.nextInt();        
        do {
            System.out.println(num1);
            num1++;
        } while (num1 <= 900);
    }
}
