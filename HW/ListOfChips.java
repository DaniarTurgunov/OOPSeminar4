package Seminar4.HW;

import java.util.Iterator;
import java.util.List;

public class ListOfChips implements Iterable<Chips>{
    List<Chips>chipsList;

    public List<Chips> getChipsList() {
        return chipsList;
    }

    public void setChipsList(List<Chips> chipsList) {
        this.chipsList = chipsList;
    }

    @Override
    public Iterator<Chips> iterator() {
        return chipsList.iterator();
    }

    @Override
    public String toString() {
        return "Снеки= " + chipsList.toString();
    }
}
