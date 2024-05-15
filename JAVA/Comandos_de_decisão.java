public class Comandos_de_decisão {
    public static void main(String[] args){
       int nota=70;
       int media=60;
       // && e, ||ou, !não,== igual, != diferente, < menor que
       // > maior que, >= maior igual, <= menor igual.
       // estrutura if else 
       if (nota >= media){
        System.out.println("Aprovado");
       }else if(nota >= 40){
        System.out.println("Recuperacao");
       }else{
        System.out.println("reprovado");
       }
       // condição ternaria
       String res;
       res=(nota >= media ? "Aprovado condição ternaria":"Reprovado condição ternaria");
    System.out.println("Resultado:" + res);

    // Switch
    int pos = 9;
    switch (pos) {
        case 1:
            System.out.println("Primero lugar");
            break;
        case 2:
            System.out.println("Segundo lugar");
            break;
        case 3:
            System.out.println("Terceiro lugar");
            break;        
         case 4: case 5: case 6 :
            System.out.println("Premio de conçolação");
            break;

        default:
            System.out.println("Nao ganhou nada");
            break;
    }
    }
}
