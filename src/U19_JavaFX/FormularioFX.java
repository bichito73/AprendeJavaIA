package U19_JavaFX;
/**
 * Ejercicio 19.2 - Formulario en JavaFX
 * Enunciado: Ventana con campos de texto y un botón.
 */
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class FormularioFX extends Application {
  @Override
  public void start(Stage stage){
    TextField nombre=new TextField();
    Button b=new Button("Enviar");
    b.setOnAction(e->System.out.println("Hola "+nombre.getText()));
    VBox root=new VBox(new Label("Nombre:"),nombre,b);
    Scene scene=new Scene(root,300,200);
    stage.setScene(scene);
    stage.show();
  }
  public static void main(String[] args){ launch(); }
}
