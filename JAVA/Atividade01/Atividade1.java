

class Atividade1{
	public static void main (String args[]){

		Array ar = new Array();
		
		//Criar um array de 10 numeros inteiros e preenche-lo com valores aleatorios.
		for(int num : ar.getLista()){
			System.out.println(num);
		}
		System.out.println("------------------------");
		
		//Percorrer o array e encontrar o maior e o menor numero
		System.out.println("Menor:" + ar.menor());
		System.out.println("Maior:" + ar.maior());
		System.out.println("------------------------");
		
		//Calcular a soma de todos os elementos do array
		System.out.println("Soma:" + ar.soma());
		System.out.println("------------------------");
		
		//Calcular a media dos valores armazenados no array
		System.out.printf("Média: %.1f%n", ar.media());
	}
}

