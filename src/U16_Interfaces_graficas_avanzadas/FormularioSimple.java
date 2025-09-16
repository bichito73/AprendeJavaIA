package U16_Interfaces_graficas_avanzadas;
/**
 * Ejercicio 16.1 - Formulario simple
 * Enunciado: Ventana con campo de texto y botón.
 */
import javax.swing.*;
import java.awt.*;
public class FormularioSimple extends JFrame {
  public FormularioSimple(){
    super("Formulario");
    JTextField campo=new JTextField(15);
    JButton boton=new JButton("Aceptar");
    setLayout(new FlowLayout());
    add(new JLabel("Nombre:")); add(campo); add(boton);
    setSize(250,120);
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    setVisible(true);
  }
  public static void main(String[] args){ new FormularioSimple(); }
}
