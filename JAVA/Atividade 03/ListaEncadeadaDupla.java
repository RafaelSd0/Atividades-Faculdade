// Classe que representa a lista encadeada
public class ListaEncadeadaDupla <T> {
  No<T> head;
  No<T> tail;

  public ListaEncadeadaDupla() {
    this.head = null;
    this.tail = null;
  }

  /* Metodos Obrigatórios*/

  //Insere elemento na primeira posição da lista.
  public void inserirInicio(T item){
    No<T> novo;

    if(headVazio() ){
      novo = new No<T>(item, null, null);
      head = novo;
      tail = novo;
    } else{
      novo = new No<T>(item, head, null );
      head.back = novo;
      head = novo;
    }
  }

  //Insere elemento no final da lista.
  public void inserirFim(T item){
    No<T> novo;

    if(headVazio()){
      novo = new No<>(item,null,null);
      head = novo;
      tail = novo;
      return;
    } else {
      novo = new No<>(item,null,tail);
      tail.prox = novo;
      tail = novo;
    }
  }

// Remove Elemento da lista
  public void remover(T item) throws ObjetoNaoEncontradoException, ListaVaziaException {
    if (head == null) {
      throw new ListaVaziaException();
    }
    
    No<T> atual = head;
    boolean encontrado = false;
    
    while (atual != null) {
      if (atual.val.equals(item)) {
        encontrado = true;
        if (atual == head) {
          head = atual.prox;
          if (head != null) {
            head.back = null;
          } else {
            tail = null;
          }
        }
        else if (atual == tail) {
          tail = atual.back;
          tail.prox = null;
        }
        else {
          atual.back.prox = atual.prox;
          atual.prox.back = atual.back;
        }
        break; 
    }
      atual = atual.prox;
    }
  
    if (!encontrado) {
      throw new ObjetoNaoEncontradoException();
    }
  }

  // Exibe todos os elementos da lista
  public void exibirLista() {
    No<T> atual = head;
    while (atual != null) {  
      System.out.println(atual.val);  
      atual = atual.prox; 
    }
}

  public Object getPrimeiro() throws ListaVaziaException {
    if (headVazio()) {
      throw new ListaVaziaException();
    }
    return head.getVal();
  }

  public Object getUltimo() throws ListaVaziaException {
    if (tailVazio()) {
      throw new ListaVaziaException();
    }
    return tail.getVal();
  }

  public void limpar(){
    this.head = null;
    this.tail = null;
  }

  /*Meus Metodos*/

  public boolean headVazio(){
    return head == null;
  }

  public boolean tailVazio(){
    return tail == null;
  }

}