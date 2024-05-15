import java.util.Scanner;
public class InversãoDeString {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        //escrever string
        String frase = scan.nextLine();
        String invertida = "";
        //inverter a sring
        
        int i = frase.length() - 1;
        do{
            char c = frase.charAt(i);
            invertida += c;
            i--;
        }while(i >= 0);
        System.out.print(invertida);

        scan.close();
    }
}
