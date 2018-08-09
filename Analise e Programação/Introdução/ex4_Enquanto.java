import java.util.Scanner;

public class ex4_Enquanto {
    public static void main(String[] args) {
        Scanner tcl = new Scanner(System.in);
        System.out.println("Digite o valor inicial");
        int valor1 = tcl.nextInt();
        System.out.println("Digite o valor final");
        int valor2 = tcl.nextInt();
        
        while (valor1 <= valor2) {
            System.out.print(valor1 + "\t");
            valor1++;
        }
    }
}
