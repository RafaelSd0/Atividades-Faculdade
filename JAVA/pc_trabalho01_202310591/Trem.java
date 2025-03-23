/* *********************************************************************
* Autor............: Rafael Silva de Oliveira
* Matricula........: 202310591
* Inicio...........: 16/03/2025
* Ultima alteracao.: 22/03/2025
* Nome.............: Trem
* Funcao...........: Define as caracteristicas e metodos dos Trens.
************************************************************************ */

import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

public class Trem {
  private ImageView imagem;
  private double velocidade;
  private String direcao;
  private String nome;

  public Trem(double x, double y, String caminhoImagem, String nome) {
    imagem = new ImageView(new Image(caminhoImagem));
    imagem.setFitHeight(50);
    imagem.setFitWidth(70);
    
    imagem.setX(x);
    imagem.setY(y);
    this.velocidade = 0;
    this.nome = nome;
  }

  // Método responsável por monitorar a posição dos trens, ajustar suas trajetórias em curvas e movimentá-los conforme os trilhos.
  public void mover(String rumo) {
    double velocidade = getVelocidade();
    direcao = rumo;
    switch (direcao) {
      case "cima":
        //Trem 1
        if (imagem.getY() >= 680 && imagem.getY() <=  771 && nome.equals("trem1")){
          // ↗
          imagem.setX(imagem.getX() + velocidade);
          imagem.setY(imagem.getY() - velocidade * 2.2);
          imagem.setRotate(315);
        } else if (imagem.getY() >= 480  && imagem.getY() <=  571 && nome.equals("trem1")) {
          // ↖
          imagem.setX(imagem.getX() - velocidade);
          imagem.setY(imagem.getY() - velocidade * 2.2);
          imagem.setRotate(225);
        } else if (imagem.getY() >= 280 && imagem.getY() <=  371 && nome.equals("trem1")){
          // ↗
          imagem.setX(imagem.getX() + velocidade);
          imagem.setY(imagem.getY() - velocidade * 2.2);
          imagem.setRotate(315);
        } else if (imagem.getY() >= 110  && imagem.getY() <=  201 && nome.equals("trem1")) {
          // ↖
          imagem.setX(imagem.getX() - velocidade);
          imagem.setY(imagem.getY() - velocidade * 2.2);
          imagem.setRotate(225);
        // Trem2  
        } else if (imagem.getY() >= 680 && imagem.getY() <=  771 && nome.equals("trem2")){
          // ↖
          imagem.setX(imagem.getX() - velocidade);
          imagem.setY(imagem.getY() - velocidade * 2.2);
          imagem.setRotate(225);
        } else if (imagem.getY() >= 480  && imagem.getY() <=  571 && nome.equals("trem2")) {
          // ↗
          imagem.setX(imagem.getX() + velocidade);
          imagem.setY(imagem.getY() - velocidade * 2.2);
          imagem.setRotate(315);
        } else if (imagem.getY() >= 280 && imagem.getY() <=  371 && nome.equals("trem2")){
          // ↖
          imagem.setX(imagem.getX() - velocidade);
          imagem.setY(imagem.getY() - velocidade * 2.2);
          imagem.setRotate(225);
        } else if (imagem.getY() >= 110  && imagem.getY() <=  201 && nome.equals("trem2")) {
          // ↗
          imagem.setX(imagem.getX() + velocidade);
          imagem.setY(imagem.getY() - velocidade * 2.2);
          imagem.setRotate(315);
        } else {
          // cima
          imagem.setY(imagem.getY() - velocidade);
          imagem.setRotate(270);
        }
        break;
      case "baixo":
      //Trem 1
        if (imagem.getY() >= 100 && imagem.getY() <= 191 && nome.equals("trem1") ){
          // ↘
          imagem.setX(imagem.getX() + velocidade);
          imagem.setY(imagem.getY() + velocidade * 2.2);
          imagem.setRotate(45);
        } else if (imagem.getY() >= 280 && imagem.getY() <= 371 && nome.equals("trem1") ) {
          // ↙
          imagem.setX(imagem.getX() - velocidade);
          imagem.setY(imagem.getY() + velocidade * 2.2);
          imagem.setRotate(135);
        } else if (imagem.getY() >= 480 && imagem.getY() <= 571 && nome.equals("trem1") ){
          // ↘
          imagem.setX(imagem.getX() + velocidade);
          imagem.setY(imagem.getY() + velocidade * 2.2);
          imagem.setRotate(45);
        } else if (imagem.getY() >= 680 && imagem.getY() <= 771 && nome.equals("trem1") ) {
          // ↙
          imagem.setX(imagem.getX() - velocidade);
          imagem.setY(imagem.getY() + velocidade * 2.2);
          imagem.setRotate(135);
          //Trem2 
        } else if (imagem.getY() >= 100 && imagem.getY() <= 191 && nome.equals("trem2") ){
          // ↙
          imagem.setX(imagem.getX() - velocidade);
          imagem.setY(imagem.getY() + velocidade * 2.2);
          imagem.setRotate(135);
        } else if (imagem.getY() >= 280 && imagem.getY() <= 371 && nome.equals("trem2") ) {
          // ↘
          imagem.setX(imagem.getX() + velocidade);
          imagem.setY(imagem.getY() + velocidade * 2.2);
          imagem.setRotate(45);
        } else if (imagem.getY() >= 480 && imagem.getY() <= 571 && nome.equals("trem2") ){
          // ↙
          imagem.setX(imagem.getX() - velocidade);
          imagem.setY(imagem.getY() + velocidade * 2.2);
          imagem.setRotate(135);
        } else if (imagem.getY() >= 680 && imagem.getY() <= 771 && nome.equals("trem2") ) {
          // ↘
          imagem.setX(imagem.getX() + velocidade);
          imagem.setY(imagem.getY() + velocidade * 2.2);
          imagem.setRotate(45);
        } else {
          //baixo
          imagem.setY(imagem.getY() + velocidade);
          imagem.setRotate(90);
        }
        break;
      default:
        imagem.setX(-70);
        imagem.setY(-70);
        imagem.setRotate(225);
        break;
    }
  }

  public ImageView getImagem() {
    return imagem;
  }

  public void setVelocidade(double v) {
    this.velocidade = v;
  }
  
  public double getVelocidade(){
  	return this.velocidade;
  } 

  public void setDirecao(String direcao) {
    this.direcao = direcao;
  }

  public String getDirecao(){
    return direcao;
  }

  public void setPosicao(double x, double y ){
  	imagem.setX(x);
    imagem.setY(y);
  }
  
}

