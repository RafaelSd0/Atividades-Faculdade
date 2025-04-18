// Classe que representa a lista encadeada
public class ListaEncadeada<T> {


  public class Elemento {
    private T val;
    private Elemento prox;

    public Elemento(T val){
      this.val = val;
    }

    public T getVal(){
      return val;
    }

    public Elemento getProx(){
      return prox;
    }

    public void setProx(Elemento prox){
      this.prox = prox;
    }
  
  }

  protected Elemento head;
  protected Elemento tail;



  public ListaEncadeada() {
    this.head = null;
    this.tail = null;
  }

  /* Métodos Obrigatórios*/

  //Insere elemento na primeira posição da lista.
  public void inserirInicio(T item){

    Elemento novo = new Elemento(item);

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
    Elemento novo = new Elemento(item);
  
    if(headVazio()){
      head = novo;
      tail = novo; 
      return;
    } else {
      tail.prox = novo;
    }
    tail = novo;
  }
  
  

  // Remove Elemento da lista
  public void remover(T item){
    Elemento apagar = head;
    Elemento anterior = null;
  
    while (apagar != null && apagar.getVal() != item) {
      anterior = apagar;
      apagar = apagar.prox;
    }
  
    if (apagar == null) {
      return;
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
    Elemento atual = head; 
    while (atual != null) {
        System.out.println(atual.val); 
        atual = atual.prox; 
    }
  }

  public T getHead() {
    return head.getVal();
  }
  public T getUltimo()  {
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
