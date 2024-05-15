import java.util.Scanner;

public class Media {
    public static void main(String[] args){
        Scanner scan = new  Scanner(System.in);
        int nota1,nota2, nota3,media=0;
        System.out.print("digita a nota ai: ");
        nota1 = scan.nextInt();
        System.out.print("digita a nota ai: ");
        nota2 = scan.nextInt();
        System.out.print("digita a nota ai: ");
        nota3 = scan.nextInt();
        scan.close();
        media = (nota1 + nota2 + nota3)/3;
        System.out.printf("A media de %d, %d + %d e: %d",nota1,nota2,nota3,media);
    }
}
