/* *********************************************************************
* Autor............: Rafael Silva de Oliveira
* Matricula........: 202310591
* Inicio...........: 13/03/2025
* Ultima alteracao.: 22/03/2025
* Nome.............: Trem-Bala
* Funcao...........: Simulação do funcionamento de trens em um percurso pré-definido, com 5 trechos distintos. A simulação conta com 2 trens simultâneos. A direção inicial dos trens é escolhida pelo usuário na GUI.
************************************************************************ */

import javafx.animation.AnimationTimer;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.stage.Stage;

public class Principal extends Application {

  Trem trem1 = new Trem(421, 830, "trem.png", "trem1");
  Trem trem2 = new Trem(508, 830, "trem2.png", "trem2");

  public double velocidade1 = 0;
  public double velocidade2 = 0;
  public Pane root;

  @Override
  public void start(Stage primaryStage) {
    root = new Pane();

    // Botões
    Button b = new Button("Cima");
    Button b2 = new Button("Baixo");
    Button b3 = new Button("Invertido 1");
    Button b4 = new Button("Invertido 2");
    Button btnMais = new Button("+");
    Button btnMenos = new Button("-");
    Button btnReset = new Button("Reset");
    Button btnMais2 = new Button("+");
    Button btnMenos2 = new Button("-");

    // Label
    Label labelVelocidade = new Label("Velocidade Trem 1");
    Label labelVelocidade2 = new Label("Velocidade Trem 2");

    // Inicialização do trilho
    Trilho tri = new Trilho(root);

    // Posição dos botões 
    b.setLayoutX(750);
    b.setLayoutY(750);
    b2.setLayoutX(850);
    b2.setLayoutY(750);
    b3.setLayoutX(750);
    b3.setLayoutY(800);
    b4.setLayoutX(850);
    b4.setLayoutY(800);
    btnMais.setLayoutX(150);
    btnMais.setLayoutY(800);
    btnMenos.setLayoutX(100);
    btnMenos.setLayoutY(800);
    btnReset.setLayoutX(750);
    btnReset.setLayoutY(50);
    labelVelocidade.setLayoutX(100);
    labelVelocidade.setLayoutY(780);
    btnMais2.setLayoutX(150);
    btnMais2.setLayoutY(700);
    btnMenos2.setLayoutX(100);
    btnMenos2.setLayoutY(700);
    labelVelocidade2.setLayoutX(100);
    labelVelocidade2.setLayoutY(680);
    labelVelocidade2.setLayoutX(10);

    // Eventos dos botões
    b.setOnAction(e -> mudarRumo("cima"));
    b2.setOnAction(e -> mudarRumo("baixo"));
    b3.setOnAction(e -> mudarRumo("invertido1"));
    b4.setOnAction(e -> mudarRumo("invertido2"));
    btnMais.setOnAction(e -> alterarVelocidade1(0.2));
    btnMenos.setOnAction(e -> alterarVelocidade1(-0.2));
    btnMais2.setOnAction(e -> alterarVelocidade2(0.2));
    btnMenos2.setOnAction(e -> alterarVelocidade2(-0.2));
    btnReset.setOnAction(e -> reset());

    // Oculta os trens
    trem1.mover("n");
    trem2.mover("n");

    root.getChildren().addAll(b, b2, b3, b4, btnMais, btnMenos, btnMais2, btnMenos2, btnReset, labelVelocidade, labelVelocidade2, trem1.getImagem(), trem2.getImagem());

    AnimationTimer timer = new AnimationTimer() {
    @Override
    public void handle(long now) {
        verificarLimites(); // Verifica se o trem precisa mudar de direção
        // Coloca os trens em movimento
        trem1.mover(trem1.getDirecao()); 
        trem2.mover(trem2.getDirecao());
        }
    };
    timer.start(); 

    Scene scene = new Scene(root, 1000, 900);
    primaryStage.setTitle("Simulação de Trens");
    primaryStage.setScene(scene);
    primaryStage.show();
  }

  // Métodos para alterar a velocidade dos trens
  public void alterarVelocidade1(double val) {
    if (velocidade1 >= 1 && val > 0) {
      velocidade1 = 1;
    } else if (velocidade1 == 0 && val <= 0) {
      velocidade1 = 0;
    } else if (velocidade1 < 0) {
    	velocidade1 = 0;
    } else {
      velocidade1 += val;
    }
    trem1.setVelocidade(velocidade1);
  }

  public void alterarVelocidade2(double val) {
    if (velocidade2 >= 1 && val > 0) {
      velocidade2 = 1;
    } else if (velocidade2 == 0 && val <= 0) {
      velocidade2 = 0;
    } else if (velocidade2 < 0) {
    	velocidade2 = 0;
    } else {
      velocidade2 += val;
    }
    trem2.setVelocidade(velocidade2);
  }

  // Reseta os trens para o estado inicial
  public void reset(){
    velocidade1 = 0;
    velocidade2 = 0;
    trem1.setVelocidade(0);
    trem2.setVelocidade(0);
  	trem1.mover("n");
    trem2.mover("n");
  }
  
  // Muda a direção dos trens
  public void mudarRumo(String rumo){
  	switch (rumo) {
      case "cima":
      trem1.setPosicao(421, 830);
			trem2.setPosicao(508, 830);
      trem1.mover("cima");
      trem2.mover("cima");
      break;
      case "baixo":
      trem1.setPosicao(421, 30);
			trem2.setPosicao(508, 30);
      trem1.mover("baixo");
      trem2.mover("baixo");
      break;
     case "invertido1":
      trem1.setPosicao(421, 30);
			trem2.setPosicao(508, 830);
      trem1.mover("baixo");
      trem2.mover("cima");
      break;
     case "invertido2":
      trem1.setPosicao(421, 830);
			trem2.setPosicao(508, 30);
      trem1.mover("cima");
      trem2.mover("baixo");
      break;      
    }
  }

  public void verificarLimites() {
    // Definição dos limites do trilho
    double limiteSuperior = 30;
    double limiteInferior = 830;

    // Verifica os limites para o trem 1
    if (trem1.getImagem().getY() <= limiteSuperior) {
        trem1.setDirecao("baixo");
    } else if (trem1.getImagem().getY() >= limiteInferior) {
        trem1.setDirecao("cima");
    }

    // Repete para o trem 2
    if (trem2.getImagem().getY() <= limiteSuperior) {
        trem2.setDirecao("baixo");
    } else if (trem2.getImagem().getY() >= limiteInferior) {
        trem2.setDirecao("cima");
    }
  }

  public static void main(String[] args) {
    launch(args);
}

  
}
