package U16_Interfaces_graficas_avanzadas;
/**
 * Ejercicio 16.5 - Eventos teclado/ratón
 * Enunciado: Captura eventos de teclado y ratón en una ventana.
 */
import javax.swing.*;
import java.awt.event.*;
public class EventosTecladoRaton extends JFrame {
  public EventosTecladoRaton(){
    super("Eventos");
    addKeyListener(new KeyAdapter(){public void keyPressed(KeyEvent e){System.out.println("Tecla: "+e.getKeyChar());}});
    addMouseListener(new MouseAdapter(){public void mouseClicked(MouseEvent e){System.out.println("Click en "+e.getX()+","+e.getY());}});
    setSize(300,200);
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    setVisible(true);
  }
  public static void main(String[] args){ new EventosTecladoRaton(); }
}
