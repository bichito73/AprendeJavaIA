package U11_Colecciones;
/**
 * Ejercicio 11.2 - Ordenar números
 * Enunciado: Lee números, guárdalos en ArrayList, ordénalos y muéstralos.
 */
import java.util.*;
public class OrdenarNumeros {
  public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    ArrayList<Integer> nums=new ArrayList<>();
    System.out.print("Introduce números (0 para acabar): ");
    int n;
    while((n=sc.nextInt())!=0) nums.add(n);
    Collections.sort(nums);
    System.out.println(nums);
  }
}
