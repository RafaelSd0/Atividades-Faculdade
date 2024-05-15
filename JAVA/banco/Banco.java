package banco;
/*
 * Crie uma classe chamada ContaBancaria com os atributos número da conta e saldo. Implemente construtores para inicializar esses atributos e métodos para depositar, sacar e verificar o saldo. Crie 5 objetos e teste os métodos.
 */

class ContaBancaria {
    public String numeroDaConta;
    private float saldo;
    //Construtor
    public void contaBancaria(float saldo, String numeroDaConta){
        this.saldo = saldo;
        this.numeroDaConta = numeroDaConta;
    }

    public float depositar(float valor){
        if (valor < 0){
            System.out.println("erro voce nao pode depositar essa quantia");
            return 0;
        }else{

            System.out.println("quantia depositada");
            saldo = saldo + valor;
            return saldo;
        
        }

    }
    public float sacar(float valor){
        if(valor > saldo){
            System.out.println("erro voce nao pode sacar essa quantia");
            return 0;
        }else{
            System.out.println("quantia sacada");
            saldo = saldo - valor;
            return saldo;

        }
    }
    void verificarSaldo(){
        System.out.println("Dono da conta: " + this.numeroDaConta + " verifica o saldo.");
        System.out.println("Seu saldo disponivel: "+ this.saldo);
    }

}
