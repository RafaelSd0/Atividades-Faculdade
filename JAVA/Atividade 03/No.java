// Classe que representa um nó da lista
public class No <T> {
  T val;
  No<T> prox;
  No<T> back;

  public No (T val,No<T> prox, No<T> back){
    this.val = val;
    this.prox = prox;
    this.back = back;
  }

  public T getVal(){
    return val;
  }

  public No<T> getProx(){
    return prox;
  }

  public No<T> getBack(){
    return back;
  }
}
