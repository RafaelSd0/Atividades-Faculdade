/* Eu refiz os métodos da Lista Encadeada do zero  */

public class ListaClassificada<T> {

  protected class Elemento {
    private T val;
    private Elemento prox;

    public Elemento(T val) {
      this.val = val;
    }

    public T getVal() {
      return val;
    }

    public void setVal(T val) {
      this.val = val;
    }

    public Elemento getProx() {
      return prox;
    }

    public void setProx(Elemento prox) {
      this.prox = prox;
    }
  }

  protected Elemento head;
  protected Elemento tail;
  protected int count;

  protected class MeuCursor {

    Elemento elemento;

    public MeuCursor(Elemento elemento) {
      this.elemento = elemento;
    }

    public T getDado() {
      return elemento.getVal();
    }

    public void inerirDepois(T o) {
      Elemento novo = new Elemento(o);
      novo.setProx(elemento.getProx());
      elemento.setProx(novo);
      if (elemento == tail) tail = novo;
      count++;
    }

    public void inserirAntes(T o) {
      if (elemento == head) {
        Elemento novo = new Elemento(o);
        novo.setProx(head);
        head = novo;
        count++;
        return;
      }

      Elemento atual = head;
      while (atual != null && atual.getProx() != elemento) atual = atual.getProx();

      if (atual != null) {
        Elemento novo = new Elemento(o);
        novo.setProx(elemento);
        atual.setProx(novo);
        count++;
      }
    }

    public void remover() {
      if (elemento == head) {
        head = head.getProx();
        count--;
        return;
      }

      Elemento atual = head;
      while (atual != null && atual.getProx() != elemento) atual = atual.getProx();

      if (atual != null) {
        atual.setProx(elemento.getProx());
        if (elemento == tail) tail = atual;
        count--;
      }
    }
  }

  public ListaClassificada() {
    head = null;
    tail = null;
    count = 0;
  }

  public T get(int i) throws IndexOutOfBoundsException {
    if (i < 0 || i >= count) throw new IndexOutOfBoundsException();

    Elemento atual = head;
    for (int j = 0; j < i; j++) atual = atual.getProx();
    return atual.getVal();
  }

  public MeuCursor procurarPosicao(T o) {
    Elemento atual = head;
    while (atual != null) {
      if (atual.getVal().equals(o)) return new MeuCursor(atual);
      atual = atual.getProx();
    }
    return null;
  }

  public boolean eMembro(T o) {
    return procurarPosicao(o) != null;
  }

  @SuppressWarnings({ "rawtypes", "unchecked" })
	public void inserir(T o) {
    Elemento novo = new Elemento(o);

    if (head == null || ((Comparable) o).compareTo(head.getVal()) < 0) {
      novo.setProx(head);
      head = novo;
      if (tail == null) tail = novo;
    } else {
      Elemento atual = head;
      while (atual.getProx() != null && ((Comparable) o).compareTo(atual.getProx().getVal()) > 0) atual = atual.getProx();
      novo.setProx(atual.getProx());
      atual.setProx(novo);
      if (novo.getProx() == null) tail = novo;
    }
    count++;
  }

  public void remover(T o) {
    if (head == null) return;

    if (head.getVal().equals(o)) {
      head = head.getProx();
      if (head == null) tail = null;
      count--;
      return;
    }

    Elemento atual = head;
    while (atual.getProx() != null && !atual.getProx().getVal().equals(o)) atual = atual.getProx();

    if (atual.getProx() != null) {
      if (atual.getProx() == tail) tail = atual;
      atual.setProx(atual.getProx().getProx());
      count--;
    }
  }

  public T procurar(T o) {
    MeuCursor cursor = procurarPosicao(o);
    return (cursor != null) ? cursor.getDado() : null;
  }
}
