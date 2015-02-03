package anttoshka.multithread;

/**
 * Created by Антон on 02.02.2015.
 */
public class SecondLayer implements Runnable {

    volatile String name;

    public SecondLayer(String name) {
        this.name = name;
    }

    @Override
    public void run() {
        System.out.println(name);
        Thread[] threads = new Thread[3];

        for (int i = 0; i < threads.length; i++) {
            threads[i] = new Thread(new ThirdLayer(Thread.currentThread().getName()), name +": Thread+" + i);
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
