import java.util.Scanner;
public class  ContagemDeCaracteres {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Digite uma frase: ");
        String frase = scan.nextLine();
        int i = 0, e = 0;
        do {
            char cara = frase.charAt(i);
            if (Character.isUpperCase(cara)) {
                System.out.print(cara + " ");
                e++;
            }
            i++;
        } while (i < frase.length());
        System.out.print(e + " Letras Maiúsculas");

        scan.close();
    }
}