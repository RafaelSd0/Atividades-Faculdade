// Classe que representa a lista encadeada
public class ListaEncadeada<T> {
  No<T> head;
  No<T> tail;

  public ListaEncadeada() {
    this.head = null;
    this.tail = null;
  }

  /* Métodos Obrigatórios*/

  //Insere elemento na primeira posição da lista.
  public void inserirInicio(T item){

    No<T> novo = new No<T>(item);

    if(headVazio() ){
      head = novo;
      tail = novo;
      return;
    }

    novo.prox = head;
    head = novo;

  }

  //Insere elemento no final da lista.
  public void inserirFim(T item){

    No<T> novo = new No<T>(item);

    if(headVazio()){
      head = novo;
      return;
    } else {
      tail.prox = novo;
    }
    tail = novo;
  }

  // Remove Elemento da lista
  public void remover(T item) throws ObjetoNaoEncontradoException{
    No<T> apagar = head;
    No<T> anterior = null;

    while (apagar != null && apagar.getVal() != item) {
      anterior = apagar;
      apagar = apagar.prox;
    }

    if (apagar == null) {
      throw new ObjetoNaoEncontradoException();
    }

    if (apagar == head){
      head = apagar.prox;
    } else {
      anterior.prox = apagar.prox;
    }

    if (apagar == tail){
      tail = anterior;
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

  public T getPrimeiro() throws PilhaVaziaException {
    if (headVazio()) {
      throw new PilhaVaziaException();
    }
    return head.getVal();
  }

  public T getUltimo() throws PilhaVaziaException {
    if (tailVazio()) {
      throw new PilhaVaziaException();
    }
    return tail.getVal();
  }

  public void limpar(){
    tail = null;
    head = null;
  }

  /*Meus Métodos*/

  public boolean headVazio(){
    return head == null;
  }

  public boolean tailVazio(){
    return tail == null;
  }

}
