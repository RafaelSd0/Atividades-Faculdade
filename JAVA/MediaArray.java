import java.util.Scanner;
public class MediaArray {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Digite a quantidade de números para ser feita a média: ");
        int num =scan.nextInt();
        float media[] = new float[num]; 
        float resultado = 0;
        System.out.println("Agora digite os números para que seja feita a média ");
        for(int i = 0; i < num; i++){
            media[i] = scan.nextInt();
        }
        //soma todos os valores do array
        for(int i = 0; i < num; i++){
            resultado += media[i];
        }

        //imprimir o resultado
        System.out.print("A média é de: ");
        System.out.print(resultado / num);
        scan.close();
    }
}
