public interface IPilha <T> {
  public void fazVazia();
  public void push(T val);
  public boolean estaVazia();
  public T pop() throws PilhaVaziaException;
  public T getTop() throws PilhaVaziaException;
} 