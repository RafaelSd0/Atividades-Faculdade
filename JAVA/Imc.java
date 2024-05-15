import java.util.Scanner;
public class Imc {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        float peso, altura, imc;
        System.out.print("Digite seu peso:");
        peso = scan.nextFloat();
        System.out.print("Digite sea altura:");
        altura = scan.nextFloat();

        imc = peso/(altura*altura);

        System.out.print("IMC =");
        System.out.print(imc);
        scan.close();

    }
}
