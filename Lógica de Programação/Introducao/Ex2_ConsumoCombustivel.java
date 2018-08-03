import java.util.Scanner;
public class ConsumoCombustivel {
    public static void main(String[] args) {
        Scanner tcl = new Scanner(System.in);
        double distanciaTotalKM, consumoLitros;
        System.out.println("Digite a distância total em km");
        distanciaTotalKM = tcl.nextDouble();
        System.out.println("Digite o consumo total gasto em litros");
        consumoLitros = tcl.nextDouble();
        double ConsumoKM = distanciaTotalKM/consumoLitros;
        System.out.println("O consumo do automóvel é "
                + ConsumoKM +" litros por km");
    }
}
