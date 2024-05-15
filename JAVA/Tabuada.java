import java.util.Scanner;
public class Tabuada {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        float num;
        System.out.print("Digite um numero: ");
        num = scan.nextFloat();
        for(int i = 1; i <= 10; i++){
            System.out.println(num + " x " + i + " = "+ num * i);
        }
        scan.close();
    }
}