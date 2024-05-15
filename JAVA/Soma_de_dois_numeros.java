import java.util.Scanner;
public class Soma_de_dois_numeros {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int n1=0, n2=0, res=0;
        System.out.print("Digite um numero: ");
        n1=scan.nextInt();
        System.out.print("Digite um numero: ");
        n2=scan.nextInt();
        scan.close();
        res = n1 + n2;
        System.out.printf("A soma de %d com %d e igual a %d",n1,n2,res);
    }
}
