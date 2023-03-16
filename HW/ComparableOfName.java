package Seminar4.HW;

import java.util.Comparator;

public class ComparableOfName <T extends  Product> implements Comparator<T> {
    @Override
    public int compare(T o1, T o2 ) {
        return o1.getName().compareTo(o2.getName());
    }
}
