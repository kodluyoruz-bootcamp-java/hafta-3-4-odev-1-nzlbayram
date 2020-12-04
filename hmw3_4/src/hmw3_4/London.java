package hmw3_4;

public class London extends City implements Runnable{

    public London(String cityName, String cityCode) {
        setCityName(cityName);
        setCityCode("LON");
        setGmt("GMT");
    }

    @Override
    public void run() {
        synchronized (this) {
            this.showTime();
        }
    }
}