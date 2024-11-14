import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Practice {

    public static void main(String[] args) {
        List<Integer> littleIntegers = Collections.nCopies(8, 2);
        List<Integer> bigIntegers = Collections.nCopies(4, 8000);

        ArrayList<Integer> litintegers = new ArrayList<>(littleIntegers);

        Collections.copy(litintegers, bigIntegers);

        System.out.println(litintegers);
    }
}
