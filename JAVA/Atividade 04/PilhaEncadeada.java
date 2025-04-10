public class PilhaEncadeada<T> implements IPilha<T> {
  public ListaEncadeada<T> lista;
  private int cont;

  public PilhaEncadeada(){
    lista = new ListaEncadeada<T>();
    cont = 0;
  }

  public void fazVazia(){
    lista.limpar();
    cont = 0;
  }

  public boolean estaVazia(){
    return cont == 0;
  }

  @Override
  public void push(T val){
    lista.inserirInicio(val);
    cont ++;
  }

  @Override
  public T pop() throws PilhaVaziaException{
    if (estaVazia()){
      throw new PilhaVaziaException();
    }
    T result = lista.getPrimeiro();
    try{
      lista.remover(result);
    } catch (ObjetoNaoEncontradoException e) {
      System.err.println(e);
    }
    cont --;
    return result;
  }

  @Override
  public T getTop() throws PilhaVaziaException{
    if (estaVazia()){
      throw new PilhaVaziaException();
    }
    return lista.getPrimeiro();
  }

}
