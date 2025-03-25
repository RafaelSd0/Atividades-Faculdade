// Classe que representa a lista encadeada
public class ListaEncadeada {
  Node head;
  Node tail;

  public ListaEncadeada() {
    this.head = null;
    this.tail = null;
  }

  /* Metodos Obrigatórios*/

  //Insere elemento na primeira posição da lista.
  public void inserirInicio(Object item){

    Node novo = new Node(item);

    if(headVazio() ){
      head = novo;
      tail = novo;
      return;
    }

    novo.prox = head;
    head = novo;

  }

  //Insere elemento no final da lista.
  public void inserirFim(Object item){

    Node novo = new Node(item);

    if(headVazio()){
      head = novo;
      return;
    } else {
      tail.prox = novo;
    }
    tail = novo;
  }

  // Remove Elemento da lista
  public void remover(Object item) throws ObjetoNaoEncontradoException{
    Node apagar = head;
    Node anterior = null;

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
    Node atual = head; 
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

  /* Métodos Extras */

  public int tamanho(){
    Node atual = head; 
    int tam = 0;
    while (atual != null) {
      tam++; 
      atual = atual.prox; 
    }
    return tam;
  }

  public boolean buscar(Object item) {
    Node temp = head;

    while ( temp != null && temp.getVal() != item) {
      temp = temp.prox;
    }

    if ( temp == null){
      return false;
    }

    return true;
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
