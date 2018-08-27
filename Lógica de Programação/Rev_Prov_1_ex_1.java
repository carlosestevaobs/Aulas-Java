import java.util.Scanner;

public class Rev_Prov_1_ex_1 {
    public static void main(String[] args) {
        Scanner tcl = new Scanner(System.in);
        System.out.println("Digite um número inteiro");
        int a = tcl.nextInt();
        System.out.println("Digite uma palavra");
        String b = tcl.next();
        System.out.println("Digite um texto");
        String c = tcl.nextLine();
        System.out.println("Digite true ou false");
        boolean d = tcl.nextBoolean();
        System.out.println("Digite um número qualquer ");
        double e = tcl.nextDouble();
        System.out.println("Digite um número qualquer ");
        float f = tcl.nextFloat();
        
        //Estruturas condicionais
        System.out.println("digite dois valores inteiros");
        int g = tcl.nextInt();
        int h = tcl.nextInt();        
        // Simples
        if (g == h) {
            System.out.println("são iguais");
        } 
        
        // composto
        if (g == h) {
            System.out.println("iguais");
        } else {
            System.out.println("diferentes");
        }
        
        // aninhado
        if (g > h) {
            System.out.println("maior");
        } else if (g < h) {
            System.out.println("menor");
        } else if (g == h ) {
            System.out.println("igual");
        } else {
            System.out.println("não chega aqui");
        }
        
        // if dentro if
        if (g == h) {
            if (g % 2 == 0) {
                System.out.println("o maior é par");
            } else {
                System.out.println("o maior é ímpar");
            } 
        } else {
            if (g % 2 == 0) {
                System.out.println("o menor é par");
            } else {
                System.out.println("o menor é ímpar");
            }
        }
        
        // switch ... case
        int num = tcl.nextInt();        
        switch (num) {
            case 1:
                System.out.println("primeiro");
                break;
            case 2:
                System.out.println("segundo");
                break;
            default:
                System.out.println("digite um valor válido");
            
        }
        
        // Estruturas de repetição
        //enquanto - while
        int k, m;
        k = 1;
        m = 30;
        while (k <= m) {
            System.out.println(k);
            k++;
        }
        // para - for
        for (int i = 1; i <= 30; i++) {
            System.out.println(i);
        }
        
        //do... while
        int n, o;
        n = 100;
        o = 99;
        
        do {
            System.out.println(n);
            n--;
        } while (n == o);
        
        
        
        
        
        
        
        
       
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
    }
}
