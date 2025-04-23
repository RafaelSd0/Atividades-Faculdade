public class Paciente {
  private String nome;
  private String prioridade;

  public Paciente(){
  }

  public void setNome(String nome) {
    this.nome = nome;
  }

  public void setPrioridade(int prioridade) {
    if ( prioridade == 1){
      this.prioridade = "verde";
    } else if ( prioridade == 2){
      this.prioridade = "amarelo";
    } else if ( prioridade == 3){
      this.prioridade = "vermelho";
    }
  }

  public String getPrioridade() {
    return prioridade;
  }

  public String getNome() {
    return nome;
  }

}
