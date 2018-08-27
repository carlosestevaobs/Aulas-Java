import java.util.Scanner;
public class ex8_matrizes {
    public static void main(String[] args) {
        Scanner tcl = new Scanner(System.in);
        String matriz[][] = new String[5][2];        
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                matriz[i][j] = tcl.nextLine();
            }
        }
        
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                System.out.print(matriz[i][j]);
            }
            System.out.println("");
        }
    }
}
