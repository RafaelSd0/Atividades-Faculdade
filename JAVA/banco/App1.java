package banco;
import java.util.Scanner;
public class App1 {
    public static void main(String[] args) {
        /*ContaBancaria c1 = new ContaBancaria();
        c1.contaBancaria(0, 1293);
        c1.verificarSaldo();
        c1.depositar(100);
        c1.verificarSaldo();
        numeroconta= scan.nextInt();*/
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite 5 numeros para sua conta");
        String numeroconta = scan.nextLine();


        

        if(numeroconta.length() == 5){
            int opc;

            System.out.println("Digite 1 para começar e 0 para terminar");
            opc = scan.nextInt();
            Interface1 in = new Interface1();
            in.interface1(opc, numeroconta);
            scan.close();
        }else{
            System.err.println("erro voce tem que digitar uma sequecia de 5 numeros");
            scan.close();
        }

        
        
    }
}
