package hmw3_4;

import static java.lang.Thread.*;

public class SimpleThread implements Runnable{
    private City city;
    private int SN = 1000;
    public SimpleThread(City city){
        this.city = city;
    }
    @Override
    public void run() {
        try {
            sleep(SN);
            synchronized (this){
                this.city.showTime();

            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}