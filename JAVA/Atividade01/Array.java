import java.util.Random;

class Array {

  private int[] lista; 

  public Array() {
    lista = new int[10]; 
    Random gerador = new Random();

    for (int i = 0; i < 10; i++) {
      lista[i] = gerador.nextInt(); 
    }
  }

  public int[] getLista() {
    return this.lista;
  }

  public int menor() {
    int menor = lista[0];
    for (int i = 1; i < lista.length; i++) {
      if (menor > lista[i]) {
        menor = lista[i];
      }
    }
    return menor;
  }

  public int maior() {
    int maior = lista[0];
    for (int i = 1; i < lista.length; i++) {
      if (maior < lista[i]) {
        maior = lista[i];
      }
    }
    return maior;
  }
  
  public long soma() {
    long soma = 0;
    for (int i = 0; i < lista.length; i++) {
      soma += lista[i];
    }
    return soma;
  }
  
  public double media() {
    long soma = soma();
    return (double) soma / lista.length;
  }
}
