package practic.classCast;

import java.util.List;

public class Calculator {

    private Calculator() {}

    public static double calculate(List<MediaItem> mediaItems) {
        // Напишите реализацию метода, который будет возвращать общее количество дней,
        // потраченных на просмотр фильмов и сериалов
        double filmRuntime = 0;
        for (MediaItem item : mediaItems) {
            if (item instanceof Movie movie) {
                filmRuntime = movie.getRuntime();
            } else {
                Series series = (Series) item;
                filmRuntime = filmRuntime + (series.getRuntime() * series.getSeriesCount());
            }
        }
        return filmRuntime / (60 * 24);
    }

}