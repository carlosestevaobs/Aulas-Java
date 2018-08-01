import java.util.Scanner; 
public class Media4Notas {
    public static void main(String[] args) {
        Scanner tcl = new Scanner(System.in);
        double prova1, prova2, prova3, prova4, media;
        prova1 = tcl.nextDouble();
        prova2 = tcl.nextDouble();
        prova3 = tcl.nextDouble();
        prova4 = tcl.nextDouble();
        media = (prova1 + prova2 + prova3 + prova4)/4;
        System.out.print("Sua média é "+ media);
    }
}
