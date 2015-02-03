package anttoshka.multithread;

/**
 * Created by Anton on 01.02.2015.
 */
public class GeomProgression implements Runnable {

    private Thread thread;
    private int n;
    private final int step = 2;

    public GeomProgression(int n) {
        this.n = n;
        thread = new Thread(this, Integer.toString(n));
        thread.start();
    }

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName() + ": " + getGeomProgression());
    }

    private double getGeomProgression(){
        int sum = 1;
        int firstUnit = 1;
        int i = 1;
        while (true){
            int lastUnit = (int) Math.pow(step, i - 1);
            i++;
            int tempSum = sum;
            sum = ((lastUnit * step) - firstUnit);
            if (sum > n){
                sum = tempSum;
                break;
            }
        }
        return sum;
    }
}
