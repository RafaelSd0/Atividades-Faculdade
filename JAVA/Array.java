import java.util.ArrayList;
/**
 * Array
 */
public class Array {

    public static void main(String[] args) {
        ArrayList <Integer> numeros = new ArrayList<>();
        numeros.add(12);
        numeros.add(14);
        numeros.add(16);
        numeros.add(1656);

        for (Integer i : numeros) {
            System.out.println(i);
        }

        ArrayList <String> carros = new ArrayList<>();
        carros.add("Gol bola");
        carros.add("HB20");
        carros.add(0, "Corola");

        for (String string : carros) {
            System.out.println(string);
        }

        System.out.println(carros.get(1));
    }
}