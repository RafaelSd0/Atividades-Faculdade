public class TestFila {
  /*
    Utilize uma lista encadeada simples como estrutura interna.
    Exercício:
    1. Enfileire os números 10, 20 e 30.
    2. Mostre o primeiro elemento da fila.
    3. Desenfileire todos os elementos, imprimindo cada um.
    4. Verifique se a fila est ́a vazia ao final.
  */
  public static void main(String[] args) {
    
    // 1. Enfileire os números 10, 20 e 30.
    FilaEncadeada<Integer> fila = new FilaEncadeada<Integer>();
    fila.enfileirar(10);
    fila.enfileirar(20);
    fila.enfileirar(30);
  
    // 2. Mostre o primeiro elemento da fila.
    try {
      System.out.println("Primeiro elemento: " + fila.getPrimeiro());
    } catch (Exception e) {
      System.err.println(e);
    }
  
    // 3. Desenfileire todos os elementos, imprimindo cada um.
    for (int i =  0; i <= fila.getSize() + 1; i++){
      System.out.println(fila.desenfileirar() + " Foi desenfileirado");     
    }

    // 4. Verifique se a fila est ́a vazia ao final.
    if (fila.estaVazia()) System.out.println("A fila está vazia");
    
  }
}
