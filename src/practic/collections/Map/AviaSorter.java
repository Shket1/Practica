package practic.collections.Map;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/*
Нужно написать прогрмму которая будет распределять пассажиров по местам в самолете
 */

public class AviaSorter {
    // Пример списка пассажиров (на самом деле их больше)
    private static List<String> passengerNames = List.of(
            "Василий Петров",
            "Анна Ягирская",
            "Виктория Сотова",
            "Игорь Серов",
            "Людмила Ульянова"
    );

    public static void main(String[] args) {
        Map<String, Integer> seats = assignSeats(passengerNames);
        System.out.println("Места пассажиров: " + seats);
    }

    //Этот метод назначает каждому пассажиру из списка, номер места в самолете
    public static Map<String, Integer> assignSeats(List<String> passengerNames) {
        Map<String, Integer> stringIntegerHashMap = new HashMap<>();
        int seats = 1;

        for (String name : passengerNames)
            stringIntegerHashMap.put(name, seats++);

        return stringIntegerHashMap;
    }

}
