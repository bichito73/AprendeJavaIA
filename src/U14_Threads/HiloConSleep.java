package U14_Threads;
/**
 * Ejercicio 14.4 - Hilo con sleep
 * Enunciado: Un hilo que espera entre mensajes.
 */
public class HiloConSleep extends Thread {
  public void run(){
    try{
      for(int i=0;i<5;i++){
        System.out.println("Mensaje "+i);
        Thread.sleep(500);
      }
    }catch(InterruptedException e){}
  }
  public static void main(String[] args){
    new HiloConSleep().start();
  }
}
