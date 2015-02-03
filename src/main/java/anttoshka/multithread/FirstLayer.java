package anttoshka.multithread;

/**
 * Created by Антон on 02.02.2015.
 */
public class FirstLayer implements Runnable {



    @Override
    public void run() {
        String name = Thread.currentThread().getName();
        System.out.println(name);
        Thread[] threads = new Thread[3];

        for (int i = 0; i < threads.length; i++) {
            threads[i] = new Thread(new SecondLayer(name +": Thread-" + i));
        }

        for (Thread thread : threads) {
            thread.start();
            try {
                thread.join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
