import java.util.Scanner;

public class Main {
  public static void main(String[] args) {

    // Contadores de pacientes atendidos por categoria
    int atendidosVerde = 0;
    int atendidosAmarelo = 0;
    int atendidosVermelho = 0;

    // Filas separadas por prioridade
    FilaEncadeada<String> vermelho = new FilaEncadeada<String>();
    FilaEncadeada<String> amarelo = new FilaEncadeada<String>();
    FilaEncadeada<String> verde = new FilaEncadeada<String>();

    boolean sair = false;
    int num = 0;
    
    Scanner scanner = new Scanner(System.in); 

    String menu = "Sistema Atendimento Pacientes Pronto-Socorro.\nDigite (1) para cadastrar paciente\nDigite (2) para atender paciente\nDigite (3) para exibir status da fila\nDigite (4) para exibir relatório\nDigite (5) para sair";
    
    while (!sair) {

      System.out.println(menu);
      System.out.print("Digite sua operação: ");
      num = scanner.nextInt();
      
      switch (num) {

        case 1: // Cadastro de paciente
          Paciente pBase = new Paciente();

          System.out.println("Opção escolhida: Cadastrar paciente");

          System.out.print("Digite o nome do paciente: ");
          scanner.nextLine(); // Limpa buffer
          String nome = scanner.nextLine(); // Lê nome com espaços
          pBase.setNome(nome);
          System.out.println(" ");

          System.out.println("Escolha a prioridade\n(1) para Leve\n(2) para Moderada\n(3) para Grave");
          int pri = scanner.nextInt();

          // Validação de prioridade
          if (pri != 1 && pri != 2 && pri != 3) {
            System.out.println("Erro: prioridade não existe\nOperação cancelada!\n");
            break;
          }

          pBase.setPrioridade(pri);
          System.out.println(" ");

          // Enfileira o paciente na fila correta
          if (pBase.getPrioridade().equals("verde")) {
            System.out.println("Colocando paciente na fila Leve (verde)...");
            verde.enfileirar(pBase.getNome());
          } else if (pBase.getPrioridade().equals("amarelo")) {
            System.out.println("Colocando paciente na fila Moderada (amarela)...");
            amarelo.enfileirar(pBase.getNome());
          } else if (pBase.getPrioridade().equals("vermelho")) {
            System.out.println("Colocando paciente na fila Grave (vermelha)...");
            vermelho.enfileirar(pBase.getNome());
          }

          System.out.println("Operação concluída!\n");
          break;

        case 2: // Atender paciente
          if (!vermelho.estaVazia()) {
            try {
              System.out.println("Desenfileirando: " + vermelho.getPrimeiro());  
              vermelho.desenfileirar();
              atendidosVermelho++; // Conta paciente atendido
              System.out.println("Operação concluída!\n");
            } catch (Exception e) {}
          } else if (!amarelo.estaVazia()) {
            try {
              System.out.println("Desenfileirando: " + amarelo.getPrimeiro());  
              amarelo.desenfileirar();
              atendidosAmarelo++;
              System.out.println("Operação concluída!\n");
            } catch (Exception e) {}
          } else if (!verde.estaVazia()) {
            try {
              System.out.println("Desenfileirando: " + verde.getPrimeiro());  
              verde.desenfileirar();
              atendidosVerde++;
              System.out.println("Operação concluída!\n");
            } catch (Exception e) {}
          } else {
            System.out.println("Erro: Sem pacientes na fila");
            System.out.println("Operação cancelada!\n");
          }
          break;

        case 3: // Exibir status das filas
          System.out.println("Fila Grave (vermelha):");
          vermelho.getElements();
          System.out.println("");

          System.out.println("Fila Moderada (amarela):");
          amarelo.getElements();
          System.out.println("");

          System.out.println("Fila Leve (verde):");
          verde.getElements();
          System.out.println("");
          break;

        case 4: // Relatório completo
          System.out.println("RELATÓRIO DO SISTEMA DE ATENDIMENTO\n");

          System.out.println("Pacientes atendidos por categoria:");
          System.out.println("Grave (vermelha): " + atendidosVermelho);
          System.out.println("Moderada (amarela): " + atendidosAmarelo);
          System.out.println("Leve (verde): " + atendidosVerde);
          System.out.println("");

          int total = vermelho.getSize() + amarelo.getSize() + verde.getSize();
          System.out.println("Total de pacientes em espera: " + total);
          System.out.println(" - Grave (vermelha): " + vermelho.getSize());
          System.out.println(" - Moderada (amarela): " + amarelo.getSize());
          System.out.println(" - Leve (verde): " + verde.getSize());

          if (total == 0) {
            System.out.println("\nNão há pacientes aguardando atendimento.\n");
          } else {
            System.out.println("\nPacientes aguardando por prioridade:\n");

            System.out.println("Grave (vermelha):");
            vermelho.getElements();

            System.out.println("Moderada (amarela):");
            amarelo.getElements();

            System.out.println("Leve (verde):");
            verde.getElements();
          }

          System.out.println("");
          break;

        case 5: // Encerrar sistema
          System.out.println("\nSaindo...\n");
          sair = true;
          break;  

        default: // Opção inválida
          System.out.println("\nErro: Operação não encontrada\n");
          break;
      }
    }
    scanner.close();
  }
}