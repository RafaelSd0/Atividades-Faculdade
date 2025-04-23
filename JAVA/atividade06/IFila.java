public interface IFila <T> {
  void fazVazia();

  boolean estaVazia();

  T getPrimeiro() throws FilaVaziaException;

  void enfileirar(T objeto);

  T desenfileirar() throws FilaVaziaException;
}
