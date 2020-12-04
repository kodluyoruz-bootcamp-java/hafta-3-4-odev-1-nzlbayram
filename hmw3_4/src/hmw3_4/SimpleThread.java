package hmw3_4;

public class SimpleThread implements Runnable {

    public City city;

    public SimpleThread(City city) {
        this.city = city;
    }

    @Override
    public void run() {
        synchronized (this) {
            city.showTime();
        }
    }
}
