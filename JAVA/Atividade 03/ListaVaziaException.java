public class ListaVaziaException extends Exception {
  @Override
  public String getMessage(){
    return "Erro: A lista esta vazia";
  }
}
