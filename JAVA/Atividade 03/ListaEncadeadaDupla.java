// Classe que representa a lista encadeada
public class ListaEncadeadaDupla <T> {
  No<T> head;
  No<T> tail;
  int size;

  public ListaEncadeadaDupla() {
    this.head = null;
    this.tail = null;
    size = 0;
  }

  /* Metodos Obrigatórios*/

  //Insere elemento na primeira posição da lista.
  public void inserirInicio(T item){

    No<T> novo;

    if(headVazio() ){
      novo = new No<>(item, null, null);
      head = novo;
      tail = novo;

    } else{
      novo = new No<T>(item, head, null );
      head.back = novo;
      head = novo;
    }
    size ++;
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
    
    size ++;
  }

  // Remove Elemento da lista
  public void remover(T item) throws ObjetoNaoEncontradoException{
    No<T> apg = head;

  }

  // Exibe todos os elementos da lista
  public void exibirLista() {
    No<T> atual = head; 
    for(int i = 0; i < size; i++ ){
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
