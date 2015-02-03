package anttoshka.multithread;

/**
 * Created by Антон on 02.02.2015.
 */
public class ThirdLayer implements Runnable {
    volatile String name;

    public ThirdLayer(String name) {
        this.name = name;
    }

        @Override
    public void run() {
        System.out.println(Thread.currentThread().getName());
    }
}
