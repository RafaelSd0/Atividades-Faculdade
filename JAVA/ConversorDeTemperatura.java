import java.util.Scanner;
public class ConversorDeTemperatura {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        float cell, far;
        System.out.print("Escreva temperatura em celsius:");
        cell = scan.nextFloat();
        scan.close();
        far =(cell * 9/5)+32;
        System.out.print("Temperatura em fahrenheit:");
        System.out.println(far);
        
    }
}
