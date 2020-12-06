package hmw3_4;

public class NewYork extends City implements Runnable{

    public NewYork(String cityName, String cityCode) {
        setCityName(cityName);
        setCityCode("NYC");
        setGmt("GMT-5:00");
    }

    @Override
    public void run() {
        synchronized (this) {
            this.showTime();
        }
    }
}