package practic.collections.Map.autoShop;

import java.util.Comparator;
import java.util.Map;
import java.util.TreeMap;

/*
Нужно отсортировать машины по цене
 */

public class Main {
    public static void main(String[] args) {

        Comparator<Car> carComparator = new Comparator<Car>() {
            @Override
            public int compare(Car o1, Car o2) {
                return o1.priceInRubles - o2.priceInRubles;
            }
        };

        Map<Car, Integer> cars = new TreeMap<>(carComparator);

        cars.put(new Car("Audi A6", 3_760_000), 2);
        cars.put(new Car("Honda CR-V", 2_500_00), 3);
        cars.put(new Car("KIA Cerato", 1_300_000), 8);
        cars.put(new Car("Volkswagen Tiguan", 1_935_000), 5);

        for (Car car: cars.keySet())
            System.out.println(car);
    }
}
