package Seminar4.CW.CW2;
import java.util.Comparator;

public class DogNameComparator<T extends Animal> implements Comparator<T> {
    @Override
    public int compare(T o1, T o2) {
        return o1.getName().compareTo(o2.getName());
    }
}
