package U14_Threads;
/**
 * Ejercicio 14.1 - Hilo simple
 * Enunciado: Crea un hilo que muestre un mensaje varias veces.
 */
public class HiloSimple extends Thread {
  public void run(){
    for(int i=0;i<5;i++){ System.out.println("Hola desde el hilo "+i); }
  }
  public static void main(String[] args){
    new HiloSimple().start();
  }
}
