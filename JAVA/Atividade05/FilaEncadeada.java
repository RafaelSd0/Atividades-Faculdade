public class FilaEncadeada<T> implements IFila<T> {
  private ListaEncadeada<T> lista;
  private int cont;

  public FilaEncadeada() {
    lista = new ListaEncadeada<>();
    cont = 0;
  }

  public void fazVazia(){
    lista.limpar();
    cont = 0;
  }

  public boolean estaVazia(){
    return cont == 0;
  }

  public T getPrimeiro() throws FilaVaziaException{
    if (estaVazia()) {
      throw new FilaVaziaException();
    }
    return lista.getHead();
  }

  public void enfileirar(T objeto){
    lista.inserirFim(objeto);
    cont++;
  }

  public int getSize(){
    return cont;
  }

  public T desenfileirar() {
    T result = lista.getHead(); 
    lista.remover(result); 
    cont--;
    return result; 
  }
 
}
