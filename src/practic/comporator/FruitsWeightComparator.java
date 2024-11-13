package practic.comporator;

import java.util.Comparator;

public class FruitsWeightComparator implements Comparator<Fruits> {
    @Override
    public int compare(Fruits o1, Fruits o2) {
        return (int) (o1.weight - o2.weight);
    }
}
