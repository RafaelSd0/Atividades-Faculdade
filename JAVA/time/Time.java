package time;
//atributos
//nome, estadio, escalacao
//Metodos
//jogsdores
public class Time {
    private String nome;
    private String estadio;
    private Jogador escalacao[];

    public Time(String nome, String estadio, Jogador escalacao[]){
        this.nome = nome;
        this.estadio = estadio;
        this.escalacao = escalacao;
    }

    public String getEstadio() {
        return estadio;
    }

    public String getNome() {
        return nome;
    }

    public void setEstadio(String estadio) {
        this.estadio = estadio;
    }
    
    public void setNome(String nome) {
        this.nome = nome;
    }

    public void jogadores(){
        System.out.println("Clube: "+nome);
        System.out.println("Estádio: "+estadio);
        for(int i=0; i < 11;i++){
            if (escalacao[i].getPosicao() == "goleiro") {
                System.out.println("Golero: ");
                escalacao[i].estatisticas();
            }
        }

        for(int i=0; i < 11;i++){
            if (escalacao[i].getPosicao() == "zaguero") {
                System.out.println("Zaguero: ");
                escalacao[i].estatisticas();
            }
        }
        
        for(int i=0; i < 11;i++){
            if (escalacao[i].getPosicao() == "meia") {
                System.out.println("Meio campista: ");
                escalacao[i].estatisticas();
            }
        }
        
        for(int i=0; i < 11;i++){
            if (escalacao[i].getPosicao() == "atacante") {
                System.out.println("Atacante: ");

                escalacao[i].estatisticas();
            }
        }
    }
}