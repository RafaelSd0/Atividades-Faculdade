package carro;

public class App4 {
    public static void main(String[] args) {
       Carro c1 = new Carro("ford", "fiesta", 2004);
       Carro c2 = new Carro("volksvagen", "gol", 2006);
       Carro c3 = new Carro("pegeot", "207", 2002);


        System.out.println(c1.verMeuCarro());
        System.out.println(c2.verMeuCarro());
        System.out.println(c3.verMeuCarro());

    }
}
