package hmw3_4;

import java.util.*;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Main {
    public static void main(String[] args) {

        ExecutorService executorService = Executors.newFixedThreadPool(5);

        Map<String, City> map = new HashMap<>();

        City moscow = new Moscow("hmw3.Moscow","MOW");
        map.put(moscow.getCityCode(), moscow);
        City london = new London("hmw3.London", "LON");
        map.put(moscow.getCityCode(), london);
        City newyork = new NewYork("New York", "NYC");
        map.put(moscow.getCityCode(), newyork);
        City berlin = new Berlin("hmw3.Berlin", "BER");
        map.put(moscow.getCityCode(), berlin);
        City newdelhi = new NewDelhi("New Delhi", "DEL");
        map.put(moscow.getCityCode(), newdelhi);



        List<City> cityByCode = new ArrayList<>(map.values());
        Collections.sort(cityByCode);
        for (City city : cityByCode) {
            System.out.println(city.getCityCode() + " --> " + city.getCityName());
        }

        Scanner s = new Scanner(System.in);
        System.out.println("Listelenen şehirlerden en az üç, en fazla beş tanesini seçiniz. Lütfen öncelikle, seçim yapacağınız şehir sayısını giriniz: ");
        int length = s.nextInt();
        System.out.println("Lütfen " + length + " şehir kodu giriniz: ");
        String [] myArray = new String[length];
        for(int i=0; i<length; i++ ) {
            myArray[i] = s.nextLine();
        }
        for(int i=0; i<length; i++ ) {
            switch (myArray) {
                case "MOW":
                    executorService.execute(new SimpleThread(moscow));
                    break;
                case "LON":
                    executorService.execute(new SimpleThread(london));
                    break;
                case "NYC":
                    executorService.execute(new SimpleThread(newyork));
                    break;
                case "BER":
                    executorService.execute(new SimpleThread(berlin));
                    break;
                case "DEL":
                    executorService.execute(new SimpleThread(newdelhi));
                    break;

            }
        }

    }

}