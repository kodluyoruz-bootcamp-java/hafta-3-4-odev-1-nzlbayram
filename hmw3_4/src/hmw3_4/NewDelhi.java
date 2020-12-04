package hmw3_4;

public class NewDelhi extends City implements Runnable{

    public NewDelhi(String cityName, String cityCode) {
        setCityName(cityName);
        setCityCode("MOW");
        setGmt("GMT+5:30");
    }

    @Override
    public void run() {
        synchronized (this) {
            this.showTime();
        }
    }
}