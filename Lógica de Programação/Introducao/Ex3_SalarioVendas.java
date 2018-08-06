import java.util.Scanner;
public class Ex3_SalarioVendas {
    public static void main(String[] args) {
        Scanner tcl = new Scanner(System.in);
        System.out.println("Digite o nome");
        String nome = tcl.nextLine();
        System.out.println("Digite o salário fixo");
        double SalarioFixo = tcl.nextDouble();
        System.out.println("Digite o total de vendas (R$)");
        double TotalVendas = tcl.nextDouble();
        double SalarioEmVendas = TotalVendas * 0.15;
        double Total = SalarioFixo + SalarioEmVendas;
        System.out.println(nome + " seu salário deverá ser de R$ "+ Total);
    }
}
