// Classe que representa um nó da lista
public class Node {
  Object val;
  Node prox;

  Node (Object val){
    this.val = val;
  }

  public Object getVal(){
    return val;
  }

  public Node getProx(){
    return prox;
  }
}
