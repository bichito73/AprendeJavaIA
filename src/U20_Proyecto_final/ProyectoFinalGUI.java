package U20_Proyecto_final;
/**
 * Unidad 20 - Proyecto final (GUI)
 * Enunciado: Ejemplo con Swing para login de usuarios.
 */
import javax.swing.*;
import java.awt.event.*;
import java.util.*;
public class ProyectoFinalGUI extends JFrame {
  static HashMap<String,String> usuarios=new HashMap<>();
  JTextField user=new JTextField(10);
  JPasswordField pass=new JPasswordField(10);
  public ProyectoFinalGUI(){
    super("Login");
    usuarios.put("admin","1234");
    JButton b=new JButton("Entrar");
    b.addActionListener(new ActionListener(){
      public void actionPerformed(ActionEvent e){
        String u=user.getText();
        String c=new String(pass.getPassword());
        if(usuarios.containsKey(u)&&usuarios.get(u).equals(c)) JOptionPane.showMessageDialog(null,"Bienvenido "+u);
        else JOptionPane.showMessageDialog(null,"Acceso denegado");
      }});
    JPanel p=new JPanel();
    p.add(new JLabel("Usuario:"));p.add(user);
    p.add(new JLabel("Clave:"));p.add(pass);
    p.add(b);
    setContentPane(p);
    setSize(250,150);
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    setVisible(true);
  }
  public static void main(String[] args){ new ProyectoFinalGUI(); }
}
