package hmw3_4;

public class Berlin extends City implements Runnable {

    public Berlin(String cityName, String cityCode) {
        setCityName(cityName);
        setCityCode("BER");
        setGmt("GMT+1:00");
    }

    @Override
    public void run() {
        synchronized (this) {
            this.showTime();
        }
    }
}