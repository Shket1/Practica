package practic.algorithms;

public class FindElement {
    public static void main(String[] args) {
        int[] array = {1, 2, 65, 3, 5, 7, 54, 12, 46, 4, 2};
        System.out.println("Индекс искомого элемента: " + find(array, 3));
    }

    public static int find(int[] array, int elem) {

        //Linear complexity O(n);

        int index = -1;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == elem) {
                return i;
            }
        }
        return index;
    }
}
