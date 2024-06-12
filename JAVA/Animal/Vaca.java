package Animal;

public class Vaca extends Animal {
    public Vaca(String nome, int idade){
        super(nome, idade);
    }

    public Vaca(){
        idade = 0;
    }

    @Override
    public void fazerSom() {
        System.out.println(nome + "está berrando");
    }
}
