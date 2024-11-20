package practic.collections.set;

import java.util.HashSet;
import java.util.List;
import java.util.Set;


/*
Нужно найти количество уникальных товаров
 */
public class ShoppingList {
    private static List<String> allPurchases = List.of(
            "яблоки",
            "молоко",
            "колбаса",
            "огурцы",
            "сок",
            "хлеб",
            "виноград",
            "молоко",
            "йогурт",
            "хлеб",
            "пельмени"
    );

    public static void main(String[] args) {
        Set<String> uniquePurchases = findUniquePurchases(allPurchases);

        System.out.println( "За месяц было куплено " + uniquePurchases.size() + " уникальных товаров.");
    }

    public static Set findUniquePurchases(List<String> allPurchases) {
        Set<String> uniqueProducts = new  HashSet<>(allPurchases);
        return uniqueProducts;
    }
}
