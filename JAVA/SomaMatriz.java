/*Escreva um programa em Java que receba como entrada duas matrizes de números inteiros e exiba a soma das duas matrizes. Certifique-se de verificar se as duas matrizes têm o mesmo tamanho antes de realizar a soma. */

import java.util.Scanner;
public class  SomaMatriz {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        System.out.print("Digite o número de linhas: ");
        int linhas = scan.nextInt();
        System.out.print("Digite o número de colunas: ");
        int colunas = scan.nextInt();

        int [][] matriz1 = new int[linhas][colunas];
        int [][] matriz2 = new int[linhas][colunas];

        System.out.println("Digite os elementos da primeira matriz: ");

        elementosDaMatriz(scan, matriz1);

        System.out.println("Digite os elementos da segunda matriz: ");

        elementosDaMatriz(scan, matriz2);

        System.out.println("imprimindo a primeira matriz: ");

        imprimeMatriz(matriz1);

        System.out.println(" ");


        System.out.println("imprimindo a segunda matriz: ");

        imprimeMatriz(matriz2);

        System.out.println(" ");
        
        //imprimindo a soma das matrizes
        somaMatriz(matriz1, matriz2, linhas, colunas);

        scan.close();
    }
    public static void elementosDaMatriz(Scanner scan, int matirz[][]){
        for(int i = 0; i < matirz.length; i++){
            for(int j = 0; j < matirz[0].length; j++){
                matirz [i] [j] = scan.nextInt(); 
            }
        }
    }
    public static void imprimeMatriz(int matirz[][]){
        for(int i = 0; i < matirz.length; i++){
            System.out.println(" ");

            for(int j = 0; j < matirz[0].length; j++){

                System.out.print(matirz[i][j]  + " ");
            }
        }
    }
    public static void somaMatriz(int matriz1[][], int matriz2[][], int linhas, int colunas){
        System.out.print("A soma das matrizes é de: ");
        for(int i = 0; i < linhas; i++){
            System.out.println(" ");

            for(int j = 0; j < colunas; j++){
                System.out.print(matriz2 [i][j] + matriz2[i][j]);
                System.out.print(' ');

            }
        }
    }
}