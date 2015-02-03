package anttoshka.multithread;

/**
 * Created by Anton on 02.02.2015.
 */
public class FewThreads implements Runnable {
    static volatile int count = 0;
    volatile String name;
    public FewThreads(String name) {
        count++;
        this.name = name;
    }

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName());
        try {
            createThreeThreads();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    private void createThreeThreads() throws InterruptedException {
        String[] temp = Thread.currentThread().getName().split(": ");
        if (temp.length == 1){
            Thread[] threads = new Thread[3];

            for (int i = 0; i < threads.length; i++) {
                threads[i] = new Thread(new FewThreads(Thread.currentThread().getName()), name +": Thread-" + i);
            }

            for (Thread thread : threads) {
                thread.start();
                thread.join();
            }
        }

        if (temp.length > 2){
            Thread[] threads = new Thread[3];

            for (int i = 0; i < threads.length; i++) {
                threads[i] = new Thread(new FewThreads(Thread.currentThread().getName()), name +": Thread---" + i);
            }

            for (Thread thread : threads) {
                thread.start();
                thread.join();
            }
        }

    }


}
