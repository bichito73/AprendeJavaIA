package U20_Proyecto_final;
/**
 * Unidad 20 - Proyecto final
 * Enunciado: Proyecto integrador con lo aprendido en el curso.
 * Aquí se muestra un ejemplo de aplicación de consola que combina varias partes.
 */
import java.util.*;
public class ProyectoFinal {
  static HashMap<String,String> usuarios=new HashMap<>();
  public static void registrar(String u,String c){usuarios.put(u,c);}
  public static boolean login(String u,String c){return usuarios.containsKey(u)&&usuarios.get(u).equals(c);}
  public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    registrar("admin","1234");
    System.out.print("Usuario: "); String u=sc.nextLine();
    System.out.print("Clave: "); String c=sc.nextLine();
    if(login(u,c)) System.out.println("Bienvenido "+u);
    else System.out.println("Acceso denegado");
  }
}
