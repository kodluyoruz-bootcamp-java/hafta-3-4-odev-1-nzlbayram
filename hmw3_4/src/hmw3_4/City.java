package hmw3_4;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.TimeZone;

public class City implements Clock, Comparable<City> {

    public String cityName;
    public String cityCode;
    public String gmt;

    public String getCityName() {
        return cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    public String getCityCode() {
        return cityCode;
    }

    public void setCityCode(String cityCode) {
        this.cityCode = cityCode;
    }

    public String getGmt() {
        return gmt;
    }

    public void setGmt(String gmt) {
        this.gmt = gmt;
    }

    public City(String cityName, String cityCode, String gmt) {
        this.cityName = cityName;
        this.cityCode = cityCode;
        this.gmt = gmt;
    }

    public void showTime() {
        while(true) {
            Date time = Calendar.getInstance().getTime();
            SimpleDateFormat dateFormat = new SimpleDateFormat("HH:mm:ss");
            dateFormat.setTimeZone(TimeZone.getTimeZone(gmt));
            String clock = dateFormat.format(time);
            System.out.println(getCityName() + "'s local time: " + clock );
        }
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public int compareTo(City city) {
        return (this.getCityName().compareTo(city.getCityName()));
    }

}
