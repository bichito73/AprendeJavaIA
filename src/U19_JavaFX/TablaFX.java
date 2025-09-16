package U19_JavaFX;
/**
 * Ejercicio 19.3 - Tabla en JavaFX
 * Enunciado: Muestra una tabla con datos.
 */
import javafx.application.Application;
import javafx.collections.*;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class TablaFX extends Application {
  public static class Persona {
    String nombre; int edad;
    Persona(String n,int e){nombre=n;edad=e;}
    public String getNombre(){return nombre;}
    public int getEdad(){return edad;}
  }
  @Override
  public void start(Stage stage){
    TableView<Persona> tabla=new TableView<>();
    TableColumn<Persona,String> colNombre=new TableColumn<>("Nombre");
    colNombre.setCellValueFactory(c->new javafx.beans.property.SimpleStringProperty(c.getValue().getNombre()));
    TableColumn<Persona,Number> colEdad=new TableColumn<>("Edad");
    colEdad.setCellValueFactory(c->new javafx.beans.property.SimpleIntegerProperty(c.getValue().getEdad()));
    tabla.getColumns().addAll(colNombre,colEdad);
    tabla.setItems(FXCollections.observableArrayList(new Persona("Ana",20),new Persona("Luis",30)));
    VBox root=new VBox(tabla);
    stage.setScene(new Scene(root,300,200));
    stage.show();
  }
  public static void main(String[] args){ launch(); }
}
