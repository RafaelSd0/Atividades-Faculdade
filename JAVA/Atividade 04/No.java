
// Classe que representa um nó da lista
public class No <T> {
  T val;
  No<T> prox;

  public No (T val){
    this.val = val;
    this.prox = null;
  }

  public T getVal(){
    return val;
  }

  public No<T> getProx(){
    return prox;
  }

}
