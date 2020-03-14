package t2.a15;

import java.util.Comparator;

class StringDecreciente implements Comparator<String> {

    @Override
    public int compare(String c1, String c2) {
        return c2.compareToIgnoreCase(c1);
    }
}
