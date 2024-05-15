import java.util.Scanner;

public class FormataçãoDeEmail {

    static String formatarString(String str){
        String menusculas = str.toLowerCase();
        char c;
        String email = "", acumulador = "";
        for(int i = 0 ; i < menusculas.length(); i++){
            if (i == 0) {
                c = menusculas.charAt(i);
                acumulador += c;
            }else if(menusculas.charAt(i) == ' '){

                if (i + 1 < menusculas.length() && menusculas.charAt(i+1) != ' ' ) {
                    // Verifica se existe um próximo caractere e não é um espaço em branco
                    c = menusculas.charAt(i + 1);
                    acumulador += c;
                    
                }
            }
        }
        email = acumulador;
        acumulador = "";
        return email;
        
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        System.out.print("Digite seu Nome(com no minimo um Sobrenome): ");
        String nome = scan.nextLine();
        String email = formatarString(nome);

        System.out.print(email + "@empresa.com.br");

        scan.close();
    }
}
