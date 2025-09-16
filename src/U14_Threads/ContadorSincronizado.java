package U14_Threads;
/**
 * Ejercicio 14.5 - Contador sincronizado
 * Enunciado: Dos hilos incrementan un contador compartido usando synchronized.
 */
public class ContadorSincronizado {
  static int contador=0;
  public static synchronized void inc(){contador++;}
  public static void main(String[] args) throws InterruptedException {
    Runnable r=()->{for(int i=0;i<1000;i++) inc();};
    Thread t1=new Thread(r); Thread t2=new Thread(r);
    t1.start(); t2.start(); t1.join(); t2.join();
    System.out.println("Contador="+contador);
  }
}
