package practic.collections.Map.treeMap;

import java.util.Comparator;
import java.util.Map;
import java.util.TreeMap;

/*
Создание TreeMap и выбор способа сортировки с помощью Comparator<>();
 */

public class Main {
    public static void main(String[] args) {
        Comparator<User> userComparator = new Comparator<User>() {
            @Override
            public int compare(User o1, User o2) {
                return o1.id - o2.id;
            }
        };

        Map<User, String> userComparatorTreeMap = new TreeMap<>(userComparator);

        userComparatorTreeMap.put(new User("Alex", 12), "Piter");
        userComparatorTreeMap.put(new User("Joni", 122), "Minsk");
        userComparatorTreeMap.put(new User("Villi", 229), "Laitila");
        userComparatorTreeMap.put(new User("Paulo", 938), "Borisov");
        userComparatorTreeMap.put(new User("Genri", 664), "Kiev");

        System.out.println("Пользователи: ");
        for (Map.Entry<User, String> entry: userComparatorTreeMap.entrySet()) {
            System.out.println(entry);
        }
    }
}
