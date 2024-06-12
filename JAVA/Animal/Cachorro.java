package Animal;

public class Cachorro extends Animal {
    public String sexo;
    public Cachorro(String nome, int idade){
        super(nome, idade);
    }

    public Cachorro(){
        idade = 0;
    }

    @Override
    public void fazerSom() {
        System.out.println(nome + "está latindo");
    }

    public void reagir(int hora){
        if (hora < 10) {
            System.out.println("dormindo");
        }else{
            System.out.println("acordado");
        }
    }
    public void  reagir(boolean fok){
        if (fok == true) {
            System.out.println("latir");
        }else{
            System.out.println("Abanar Rabo");
        }
    }

    @Override
    public String toString() {
        
        return (super.toString() + "  cacnkasndkas  " + nome );
    }
}
