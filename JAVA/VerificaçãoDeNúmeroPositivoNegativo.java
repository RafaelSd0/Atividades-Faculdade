import java.util.Scanner;
public class VerificaçãoDeNúmeroPositivoNegativo {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num;
        System.out.print("Digite um número: ");
        num = scan.nextInt();
        if (num > 0) {
            System.out.print(num + " é positivo");
        }else if (num == 0){
            System.out.print(num + " é zero");
        } else {
            System.out.print(num + " é negativo");

        }
        scan.close();
    }
}
