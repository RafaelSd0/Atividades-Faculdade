public class PilhaVaziaException extends Exception {
  @Override
  public String getMessage(){
    return "Erro: A lista esta vazia";
  }
}
