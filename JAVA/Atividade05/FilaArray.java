public class FilaArray implements IFila<Object> {
  private Object array[];
  private int count, head, tail, tam;

  public FilaArray(int tam){
    this.tam = tam;
    array = new Object[tam];
    head = 0;
    tail = tam-1;
    count = 0;
  }

  public void fazVazia(){

    while (count >0) {

      array[head] = null;
      head++;
      if (head == array.length) head= 0;
      count--;

    }
  }

  public boolean estaVazia(){
    return count == 0;
  }

  public boolean estaCheia(){
    return count == tam;
  }

  public Object getPrimeiro(){
    if (estaCheia()) throw new RuntimeException("Fila Cheia");
    return array[head];
  }

  public void enfileirar(Object objeto){
    if (estaCheia()) throw new RuntimeException("Container cheio");
    tail++;
    if(tail == array.length) tail = 0;
    array[tail] = objeto;
    count++;
  }

  public Object desenfileirar(){
    if (estaCheia()) throw new RuntimeException("Container cheio");
    Object result = array[head];
    array[head] = null;
    head++;
    if(head == array.length) head = 0;
    count--;
    return result;
  }

  protected int getHead(){
    return head;
  }

  protected int getTail(){
    return tail;
  }

  protected void setHead(int head){
    this.head = head;
  }

  protected void setTail(int tail){
    this.tail = tail;
  }

  protected Object[] getArray() {
    return array;
  }

  protected void setArray(int indece, Object objeto) {
    array[indece] = objeto; 
  }

  protected void incrementCount(){
    count ++;
  }

  protected void decrementCount(){
    count --;
  }

}
