public class Deque extends FilaArray implements IDeque<Object> {

  public Deque(int tam){
    super(tam);
  }

  public void fazVazio(){
    fazVazia();
  }

  public boolean estaVazio(){
    return estaVazia();
  }

  public Object getPrimeiro(){
    return getArray()[getHead()];
  }

  public Object getUltimo(){
    return getArray()[getTail()];
  }

  public void enfileirarInicio(Object objeto){
    if (estaCheia()) throw new RuntimeException("Container cheio");
    int novoHead;
    if (getHead() == 0) {
      novoHead = getArray().length - 1;
    } else {
        novoHead = getHead() - 1;
    }
    setArray(novoHead, objeto);
    setHead(novoHead);

    incrementCount();
  }

  public void enfileirarFim(Object objeto){
    if (estaCheia()) throw new RuntimeException("Container cheio");
    enfileirar(objeto);
  }

  public Object desenfileirarInicio(){
    if (estaVazia()) throw new RuntimeException("Deque vazio");

    int novoHead; 
    if (getHead() == getArray().length) {
      novoHead = 0;
    } else {
      novoHead = getHead() + 1;
    }
  

    Object item = getArray()[getHead()]; 
    getArray()[getHead()] = null; 
    setHead(novoHead);

    decrementCount();

    return item;
  }

  public Object desenfileirarFim() {
    if (estaVazia()) throw new RuntimeException("Deque vazio");

    Object item = getArray()[getTail()]; 
    getArray()[getTail()] = null; 
    int novoTail;
    if (getTail() == 0) {
      novoTail = getArray().length - 1;
    } else {
      novoTail = getTail() - 1;
    }
    setTail(novoTail);

    decrementCount();

    return item;
}
}
