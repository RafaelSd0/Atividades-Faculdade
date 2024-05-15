import java.util.Scanner;
public class CalculoDesconto {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        float produto, percentual, desconto;
        System.out.print("Digite o valor do produto: ");
        produto = scan.nextFloat();
        System.out.print("Digite o valor do percentual: ");
        percentual = scan.nextFloat();
        scan.close();
        System.out.print("Desconto: ");
        desconto = (produto * percentual)/100;
        System.out.print(desconto);

        
    }
    
}