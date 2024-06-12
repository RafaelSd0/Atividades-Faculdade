package Animal;

public class Gato extends Animal {
    public Gato(String nome, int idade){
        super(nome, idade);
    }

    public Gato(){
        idade = 0;
    }

    @Override
    public void fazerSom() {
        System.out.println(nome + "está miando");
    }

    
}
