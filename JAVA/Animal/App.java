package Animal;

/* Para cada exercício:

a) Considere a implementação de construtores com argumentos e construtores sem argumentos, toString e equals. Crie objetos e teste os métodos.

b) Considere a implementação utilizando herança de interface (modificador de acesso private) e herança de implementação (modificador de acesso protected)

c) Considere a construção do diagrama de classes da UML

1. Crie uma classe base chamada Animal com métodos como fazerSom(). Crie subclasses como Cachorro, Gato e Vaca que herdam de Animal e implementam o método fazerSom() com sons específicos para cada animal.
 */

public class App {
    public static void main(String[] args) {
        Vaca vac = new Vaca("mimosa", 10);
        Gato gat = new Gato("Felix", 2);
        Cachorro cach = new Cachorro("Rex", 7);
        dalmata na = new dalmata("sndn", 3, "nfasd");

        System.out.println(cach.toString());
        System.out.println(gat.fazerAniversario());
        vac.fazerSom();
        System.out.println(na.toString());

        cach.reagir(19);
        cach.reagir(2);
        cach.reagir(true);
        cach.reagir(false);

    }

    
}
