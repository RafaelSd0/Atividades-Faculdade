public class TestDeque {
  /*
    1. Insira 5 elementos no início e 5 no fim da deque.
    2. Remova 2 elementos do início e 2 do fim.
    3. Mostre o primeiro e o  ́ultimo elemento da deque restante.
  */
  public static void main(String[] args) {

    Deque deque = new Deque(5);

    // 1. Insira 5 elementos no início e 5 no fim da deque.
    deque.enfileirarInicio(30);
    deque.enfileirarInicio(20);
    deque.enfileirarInicio(10);
    deque.enfileirarFim(40);
    deque.enfileirarFim(50);

    System.out.println("Remova 2 elementos do início e 2 do fim.");
    for (int i = 0; i < 2; i++){
      System.out.println("Remover Inicio: " + deque.desenfileirarInicio());
    }
    for (int i = 0; i < 2; i++){
      System.out.println("Remover Fim: " +deque.desenfileirarFim());
    }
    
    System.out.println("Mostre o primeiro e o  ́ultimo elemento da deque restante.");
    System.out.println("Primeiro: " +deque.getPrimeiro());
    System.out.println("Ultimo: " +deque.getUltimo());
  }
}

// Professor tive que fazer outros métodos no Fila array, não sei se pode, mas ok funcionou. :)