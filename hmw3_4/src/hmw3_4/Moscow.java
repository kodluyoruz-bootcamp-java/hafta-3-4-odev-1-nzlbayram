package hmw3_4;

public class Moscow extends City implements Runnable{

    public Moscow(String cityName, String cityCode) {
        setCityName(cityName);
        setCityCode("MOW");
        setGmt("GMT+3:00");
    }

    @Override
    public void run() {
        synchronized (this) {
            this.showTime();
        }
    }
}