package U19_JavaFX;
/**
 * Ejercicio 19.1 - Hola JavaFX
 * Enunciado: Ventana simple con un botón usando JavaFX.
 */
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class HolaJavaFX extends Application {
  @Override
  public void start(Stage stage){
    Button btn=new Button("Hola JavaFX");
    btn.setOnAction(e->System.out.println("Botón pulsado"));
    StackPane root=new StackPane(btn);
    Scene scene=new Scene(root,300,200);
    stage.setTitle("Hola JavaFX");
    stage.setScene(scene);
    stage.show();
  }
  public static void main(String[] args){ launch(); }
}
