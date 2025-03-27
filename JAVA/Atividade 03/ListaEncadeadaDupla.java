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
  public void remover(T item) throws ObjetoNaoEncontradoException {
    // Caso a lista esteja vazia
    if (head == null) {
        throw new ObjetoNaoEncontradoException();
    }
    
    No<T> atual = head;
    boolean encontrado = false;
    
    // Percorre a lista procurando o elemento
    while (atual != null) {
      if (atual.val.equals(item)) {
          encontrado = true;
          
          // Caso 1: Remoção do primeiro nó
        if (atual == head) {
            head = atual.prox;
            if (head != null) {
                head.back = null;
            } else {
                // Lista ficou vazia
                tail = null;
            }
        }
        // Caso 2: Remoção do último nó
        else if (atual == tail) {
            tail = atual.back;
            tail.prox = null;
        }
        // Caso 3: Remoção de um nó do meio
        else {
            atual.back.prox = atual.prox;
            atual.prox.back = atual.back;
        }
        
        break; // Elemento encontrado e removido, pode sair do loop
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
    while (atual != null) {  // Melhor usar while em vez de for com size
        System.out.println(atual.val);  // Assumindo que o campo se chama "dado"
        atual = atual.prox;  // Use o mesmo nome de campo que você definiu na classe No
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
