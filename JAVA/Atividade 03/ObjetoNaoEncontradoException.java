public class ObjetoNaoEncontradoException extends Exception{
  @Override
  public String getMessage(){
    return "Erro: Objeto não encontrado";
  }
}
