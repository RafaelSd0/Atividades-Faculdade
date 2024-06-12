package time;
//*Crie as classes Time e Jogador. Associe um número variável de jogadores a um time. Defina os atributos e métodos. Crie os objetos e teste os métodos.
public class App {
    public static void main(String[] args) {
        Jogador jogadores[] = new Jogador [11];
        jogadores[0] = new Jogador("Rafael", "atacante");
        jogadores[1] = new Jogador("Ronaldo", "atacante");
        jogadores[2] = new Jogador("Messi", "atacante");
        jogadores[3] = new Jogador("Xave", "meia");
        jogadores[4] = new Jogador("Ozil", "meia");
        jogadores[5] = new Jogador("Casemiro", "meia");
        jogadores[6] = new Jogador("Alex", "zaguero");
        jogadores[7] = new Jogador("Pique", "zaguero");
        jogadores[8] = new Jogador("Ramos", "zaguero");
        jogadores[9] = new Jogador("Hakime", "zaguero");
        jogadores[10] = new Jogador("Diego", "goleiro");

        jogadores[4].marcarGol(177);
        jogadores[4].estatisticas();
        
        Time tim = new Time("Torrent", "São Petesburgo", jogadores);
        tim.jogadores();
        
    }
}