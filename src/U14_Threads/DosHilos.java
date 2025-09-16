package U14_Threads;
/**
 * Ejercicio 14.3 - Dos hilos
 * Enunciado: Lanza dos hilos simultáneamente.
 */
public class DosHilos {
  public static void main(String[] args){
    Thread t1=new Thread(() -> {for(int i=0;i<5;i++) System.out.println("Hilo1 "+i);});
    Thread t2=new Thread(() -> {for(int i=0;i<5;i++) System.out.println("Hilo2 "+i);});
    t1.start(); t2.start();
  }
}
