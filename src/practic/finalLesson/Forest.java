package practic.finalLesson;

import java.util.List;

public class Forest {
    private List<MountainHare> hares;
    private static String season;

    public Forest(List<MountainHare> hares, String season) {
        this.hares = hares;
        setSeason(season);
    }
// объявите недостающие переменные и добавьте конструктор
    public void setSeason(String newSeason) {
        season = newSeason;
        if (season.equals("лето")) {
            MountainHare.color = "серо-рыжий";
        } else {
            MountainHare.color = "белый";
        }
    }

    public void printHares() {
        for (int i = 0; i < hares.size(); i++) {
            System.out.println(hares.toString());
        }
    }
    // добавьте метод setSeason(String newSeason)
    // в этом методе реализуйте логику смены цвета шубок зайцев-беляков

    // добавьте метод printHares()

}