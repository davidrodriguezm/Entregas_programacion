package t2.a15;

import java.util.Comparator;

class IntegerDecreciente implements Comparator<Integer> {

    @Override
    public int compare(Integer o1, Integer o2) {
        return o2 - o1;
    }
}
