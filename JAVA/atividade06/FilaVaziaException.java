public class FilaVaziaException extends Exception {
  @Override
  public String getMessage(){
    return "Erro: A Fila esta vazia";
  }
}
