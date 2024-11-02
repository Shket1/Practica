package practic.algorithms;
import java.util.*;

public class GuessingGame {
    public static void main(String[] args) {
        Random random = new Random();
        int target = random.nextInt(1000) + 1;
        System.out.println("Я загадал число. Попробуйте угадать!");

        Scanner s = new Scanner(System.in);
        int userGuess = -1;

        do {
            userGuess = s.nextInt();
            if (userGuess > target) {
                System.out.println("Ваше число больше");
            } else if (userGuess < target) {
                System.out.println("Ваше число меньше");
            } else {
                System.out.println("Это оно, поздравляю!");
            }
        } while (userGuess != target);
        // Считывайте числа от пользователя пока не найдёте число, равное target
    }

}
