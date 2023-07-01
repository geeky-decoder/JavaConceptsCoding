package Queue;

import java.util.Comparator;

public class MyCustomComparator implements Comparator<Integer> {

    @Override
    public int compare(Integer o1, Integer o2) {
        return o1 < o2 ? -1 : ((o1 == o2 ? 0 : 1));
    }
}
