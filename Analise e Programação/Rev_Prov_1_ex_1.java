import java.util.Scanner;

public class Rev_Prov_1_ex_1 {

    public static void main(String[] args) {
        Scanner tcl = new Scanner(System.in);
        System.out.println("Digite um número inteiro");
        int a = tcl.nextInt();
        System.out.println("Digite um número real");
        float b = tcl.nextFloat();
        System.out.println("Digite outro valor real");
        double c = tcl.nextDouble();
        System.out.println("Digite uma palavra");
        String d = tcl.next();
        System.out.println("Digite um texto");
        String e = tcl.nextLine();
        System.out.println("Digite true ou false");
        boolean f = tcl.nextBoolean();
        
        // estrutura condicionais
        // if
        
        int g,h;
        g = 8;
        h = 9;
        // simples
        if (g > h) {
            System.out.println(g+" é o maior");
        }
        // composto
        if (g > h) {
            System.out.println(g + "é maior");
        } else {
            System.out.println(h + " é o maior");
        }
        //aninhado
        if (g > h) {
            System.out.println(g + " é maior");
        } else if (g < h){
            System.out.println(h + " é maior");
        } else {
            System.out.println("São iguais");
        }
        
        // switch ... case
        switch (g){
            case 1:
                System.out.println("primeiro");
                break;
            case 2:
                System.out.println("segundo");
                break;
            default:
                System.out.println("O valor não é válido");
        }
        
        //while
        int x = 1;
        while (x < 10) {
            System.out.println(x);
            x++;
        }        
        do {
            System.out.println(x);
            x++;
        } while (x < 10);
        
        for (int i = 0; i < 10; i++) {
            System.out.println(i);
        }
        
        
        
        
        
                
        
        
        
        
        
        
        
        
        
        // estrutura condicional switch... case
        
        
            
            
            
            
            
            
            
            
            
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
                
        
        
        
        
        
        
        
        
        
        
        
        
        
    }
}
