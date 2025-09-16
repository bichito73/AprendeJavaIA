package U19_JavaFX;
/**
 * Ejercicio 19.4 - Gráficos JavaFX
 * Enunciado: Dibuja un círculo y un rectángulo en JavaFX.
 */
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

public class GraficosFX extends Application {
  @Override
  public void start(Stage stage){
    Circle c=new Circle(100,100,50,Color.RED);
    Rectangle r=new Rectangle(200,50,80,60);
    Pane root=new Pane(c,r);
    stage.setScene(new Scene(root,400,200));
    stage.show();
  }
  public static void main(String[] args){ launch(); }
}
