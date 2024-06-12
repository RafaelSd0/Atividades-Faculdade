package Animal;

abstract class Animal {
    
    public String nome;
    public int idade;

    public Animal(String nome, int idade){
        this.idade = idade;
        this.nome = nome;
    }

    public Animal(){
        idade = 0;
    }

    public int getIdade() {
        return idade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }


    public void fazerSom() {
        System.out.println("O animal está fazendo um som.");
    }

    public int fazerAniversario(){
        idade = idade + 1;
        return idade;
    }

  
    public String toString() {
        
        return ("NOME: " + nome + " IDADE: " + idade );
    }
}
