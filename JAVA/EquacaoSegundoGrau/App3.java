package EquacaoSegundoGrau;

public class App3 {
    public static void main(String[] args) {
        Equacao e1 = new Equacao(0, 3, 4);
        Equacao e2 = new Equacao(-9, 1, 7);
        Equacao e3 = new Equacao(-9, 7, 9);

        System.out.println(e1.resolver());
        System.out.println(e2.resolver());
        System.out.println(e3.resolver());

    }

}
