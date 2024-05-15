import java.util.Scanner;
public class ConversãoDeUnidades {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double metros, cm, ml;
        System.out.print("Digite Metros: ");
        metros = scan.nextDouble();
        cm = metros * 100;
        ml = metros * 1000;
        System.out.println("Metros: "+ metros);
        System.out.println("Centímetros: "+ cm);
        System.out.println("Milímetros: "+ ml);
        scan.close();
    }
}
