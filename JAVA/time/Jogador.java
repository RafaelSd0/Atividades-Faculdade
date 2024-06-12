package time;
//* Atributos 
// nome, posição, participação*/
//Metodos
//marcar gol, fazer assistencia, desarme, defesa dificil, estatisticas
public class Jogador {
    private String nome;
    private String posicao;
    private int participacao;

    public Jogador(String nome, String posicao ){
        this.nome = nome;
        this.posicao = posicao;
        this.participacao = 0;
    }

    public String getNome() {
        return nome;
    }

    public int getParticipacao() {
        return participacao;
    }

    public String getPosicao() {
        return posicao;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    //Metodos
    //marcar gol, fazer assistencia, desarme, defesa dificil, estatisticas

    public int marcarGol(int gols){
        participacao = participacao + gols;
        return participacao;
    }  

    public int fazerAssistencia(int asst){
        participacao = participacao + asst;
        return participacao;
    }  

    public int desarmar(int desa){
        participacao = participacao + desa;
        return participacao;
    }

    public int defesa(int def){
        participacao = participacao + def;
        return participacao;
    }

    public void estatisticas(){
        System.out.println("Jogador: " + nome);
        System.out.println("Posição: " + posicao);
        if (posicao.equals("zaguero")) {

            System.out.println("Desarmes: " + participacao);
            
        }else if(posicao.equals("goleiro")){

            System.out.println("Defesas Dificeis: " + participacao);

        }else{

            System.out.println("Participações em gols: " + participacao);

        }
    }

}
