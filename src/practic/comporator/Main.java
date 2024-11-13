package practic.comporator;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Fruits> list = new ArrayList<>();
        list.add(new Fruits("Яблоко", 85));
        list.add(new Fruits("Банан", 140));
        list.add(new Fruits("Апельсин", 57));
        list.add(new Fruits("Мандарин", 25));

        //Сортировка списка фруктов
        FruitsWeightComparator comparator = new FruitsWeightComparator();
        list.sort(comparator);
        System.out.println(list);

        //Сортировка в обратном порядке
        Comparator<Fruits> reversedComp = new FruitsWeightComparator().reversed();
        list.sort(reversedComp);
        System.out.println(list);

    }
}
