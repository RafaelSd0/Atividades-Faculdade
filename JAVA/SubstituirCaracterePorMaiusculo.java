public class SubstituirCaracterePorMaiusculo {
    public static void main(String[] args) {
        String str = "carlos suares Silva";
        int posicao = 0;
        String novaStr = substituirPorMaiuscula(str, posicao);
        System.out.println("String modificada: " + novaStr);
    }

    public static String substituirPorMaiuscula(String str, int posicao) {
        if (posicao < 0 || posicao >= str.length()) {
            throw new IllegalArgumentException("Posição inválida");
        }else{
            char caractere = str.charAt(posicao);
            char caractereMaiusculo = Character.toUpperCase(caractere);

            StringBuilder strBuilder = new StringBuilder(str);
            strBuilder.setCharAt(posicao, caractereMaiusculo);
            return strBuilder.toString();

        }

        
        
    }
}
