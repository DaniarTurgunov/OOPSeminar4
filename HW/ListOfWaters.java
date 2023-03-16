package Seminar4.HW;

import java.util.Iterator;
import java.util.List;

public class ListOfWaters implements Iterable<Water>{
    List<Water>waterList;

    public List<Water> getWaterList() {
        return waterList;
    }

    public void setWaterList(List<Water> waterList) {
        this.waterList = waterList;
    }

    @Override
    public Iterator<Water> iterator() {
        return waterList.iterator();
    }
    @Override
    public String toString() {
        return "Напитки= " + waterList.toString();
    }
}
