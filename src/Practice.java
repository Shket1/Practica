import java.util.List;

public class Practice {

    public static void main(String[] args) {
        String[] mas = {"Latte", "Cappuccino", "Americano"};

        for (String s : mas) {
            System.out.println(s);
        }

        List<String> list = List.of(mas);

        System.out.println(list);
    }
}
