public interface IDeque <T> {
  void fazVazio();

  boolean estaVazio();

  T getPrimeiro();

  T getUltimo();

  void enfileirarInicio(T objeto);

  void enfileirarFim(T objeto);

  T desenfileirarInicio();

  T desenfileirarFim();
}
