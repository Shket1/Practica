package practic.collections.potatoLaboratory;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/*
Нужно найти 2 самые маленькие картошки, и 2 самые большие по альфа пзнаку
 */

public class PotatoLaboratory {

    public static void main(String[] args) {
        List<Potato> potatoes = List.of(
                new Potato(1, 30, 30, 30),
                new Potato(2, 35, 31, 35),
                new Potato(3, 40, 35, 44),
                new Potato(4, 28, 44, 41),
                new Potato(5, 33, 23, 30),
                new Potato(6, 35, 33, 33),
                new Potato(7, 38, 41, 24)
        );

        for (Potato p : potatoes) {
            System.out.println(p.id + " + " + p.calculateAlpha(p));
        }

        List<Potato> fourUnderExperiment = findPotatoesForExperiment(potatoes);

        System.out.println("Картофелины для эксперимента: " + fourUnderExperiment);
    }

    /*
    Здесь можно было найти с помощью Collections.max() и Collections.min(), но я использовал сортировку
     */
        private static List<Potato> findPotatoesForExperiment(List<Potato> potatoes) {
        ArrayList<Potato> potatoesSorted = new ArrayList<>(potatoes);
        Collections.sort(potatoesSorted);
        return List.of(potatoesSorted.get(0), potatoesSorted.get(1), potatoesSorted.get(potatoesSorted.size() - 2), potatoesSorted.get(potatoesSorted.size() - 1));
    }
}