package practic.collections.Map.searchUsersById;

import java.util.*;

/*
Нужно было усовершенствовать поиск пользователя по id. Сначала использовался ArrayList, я заменил его
на HashMap
 */

//Если использовать ArrayList
//Найден пользователь: User{id=378366, name='Имя 378366'}
//Поиск занял 16825600 наносекунд.

//Если использовать HashMap
//Найден пользователь: User{id=378366, name='Имя 378366'}
//Поиск занял 61300 наносекунд.

class Main {
    private static Map<Long, User> users = new HashMap<>();

    public static void main(String[] args) {
        // создадим 10 миллион пользователей
        for (long i = 1; i <= 1_000_000L; i++) {
            users.put(i, new User(i, "Имя " + i));
        }

        final long startTime = System.nanoTime();
        User user = users.get(378_366L);
        final long endTime = System.nanoTime();

        System.out.println("Найден пользователь: " + user);
        System.out.println("Поиск занял " + (endTime - startTime) + " наносекунд.");
    }

    static class User {
        Long id;
        String name;

        public User(Long id, String name) {
            this.id = id;
            this.name = name;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (!(o instanceof User user)) return false;

            if (!Objects.equals(id, user.id)) return false;
            return Objects.equals(name, user.name);
        }

        @Override
        public int hashCode() {
            int result = id != null ? id.hashCode() : 0;
            result = 31 * result + (name != null ? name.hashCode() : 0);
            return result;
        }

        public String toString() {
            return "User{id=" + id + ", name='" + name + "'}";
        }
    }
}