package banco;
import java.util.Scanner;
/**
 * intervace1
 */
class Interface1 {
    Scanner scan = new Scanner(System.in);
    String numeroConta;
    public int opcao;
    //Construtor
    public void interface1(int opcao, String numeroC){
        this.opcao = opcao;
        this.numeroConta = numeroC;
        menu();
    }

    void menu(){
        float valor;
        ContaBancaria c1 = new ContaBancaria();
        c1.contaBancaria(0, numeroConta);
        while (opcao != 0) {
            System.out.println("-----------------Menu----------------");
            System.out.println("    Digite 0 para sair");
            System.out.println("    Digite 1 para depositar");
            System.out.println("    Digite 2 para sacar");
            System.out.println("    Digite 3 para verificar saldo");
            opcao = scan.nextInt();
            switch (opcao) {
                case 0:
                    System.out.print("fim de papo");
                    scan.close(); 
                    break;
                case 1:
                    System.out.print("Qual o valor do deposito");
                    valor= scan.nextInt();
                    c1.depositar(valor);
                    break;
                case 2:
                    System.out.print("Qual o valor do saque");
                    valor= scan.nextInt();
                    c1.sacar(valor);
                    //sacar
                    break;
                case 3:
                    c1.verificarSaldo();
                    //verificar
                    break;            
                default:
                    System.out.println("Essa opcao nao existe");
                    break;
            }
        }
    }
    
}