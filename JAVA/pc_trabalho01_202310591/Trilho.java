/* *********************************************************************
* Autor............: Rafael Silva de Oliveira
* Matricula........: 202310591
* Inicio...........: 16/03/2025
* Ultima alteracao.: 22/03/2025
* Nome.............: Trilho
* Funcao...........: Define as caracteristicas e metodos do Trilho.
************************************************************************ */

import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Pane;

public class Trilho {
  private ImageView imagem;
  private static final int DEFAULT_X = 425;
  private static final int DEFAULT_Y = 0;
  private static final int DEFAULT_WIDTH = 150;
  private static final int DEFAULT_HEIGHT = 900;
  private static final String DEFAULT_IMAGE = "trilho_vertical.png";

  public Trilho(Pane root) {
    this(DEFAULT_X, DEFAULT_Y, DEFAULT_WIDTH, DEFAULT_HEIGHT, DEFAULT_IMAGE, root);
  }

  public Trilho(int x, int y, int width, int height, String imagePath, Pane root) {
    imagem = new ImageView(new Image(getClass().getResourceAsStream(imagePath)));

    imagem.setFitHeight(height);
    imagem.setFitWidth(width);
    imagem.setX(x);
    imagem.setY(y);

    root.getChildren().add(imagem);
  }

  public ImageView getImagem() {
    return imagem;
  }
}
