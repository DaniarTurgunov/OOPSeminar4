package Seminar4.HW;

import java.util.Iterator;
import java.util.List;

public class ListOfChocolate implements Iterable<Chocolate>{
    List<Chocolate>chocolateList;

    public List<Chocolate> getChocolateList() {
        return chocolateList;
    }

    public void setChocolateList(List<Chocolate> chocolateList) {
        this.chocolateList = chocolateList;
    }

    @Override
    public Iterator<Chocolate> iterator() {
        return chocolateList.iterator();
    }
    @Override
    public String toString() {
        return "Шоколад= " + chocolateList.toString();
    }
}
