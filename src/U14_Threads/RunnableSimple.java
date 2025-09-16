package U14_Threads;
/**
 * Ejercicio 14.2 - Runnable simple
 * Enunciado: Implementa Runnable para ejecutar en un hilo.
 */
public class RunnableSimple implements Runnable {
  public void run(){
    for(int i=0;i<5;i++){ System.out.println("Hola desde runnable "+i); }
  }
  public static void main(String[] args){
    new Thread(new RunnableSimple()).start();
  }
}
