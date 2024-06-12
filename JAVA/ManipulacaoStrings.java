public class ManipulacaoStrings {
    public static void main(String[] args) {
        String str = "Olá, mundo!";
        
        // Contar o número de caracteres
        int numeroDeCaracteres = str.length();
        System.out.println("Número de caracteres: " + numeroDeCaracteres);
        
        // Substituir caracteres
        String novaStr = str.replace('O', 'a');
        System.out.println("Nova string: " + novaStr);
        
        // Converter para maiúsculas
        String strMaiuscula = str.toUpperCase();
        System.out.println("String em maiúsculas: " + strMaiuscula);

        str.charAt(0);
    }
}
