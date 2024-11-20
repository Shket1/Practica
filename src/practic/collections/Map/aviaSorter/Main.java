package practic.collections.Map.aviaSorter;

import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class Main {

    public static void main(String[] args) {

        Map<String, String> books = new TreeMap<>();

        books.put("Девид боуи", "Поющие в терновнике");
        books.put("Пушкин", "Евгений Онегин");
        books.put("Толстой", "война и мир");
        books.put("Веста323232", "1255563");
        books.put("Веста22", "125556777");
        books.put("Веста1", "12555665645343242");

        for (String s : books.keySet())
            System.out.println(s);
    }
}
