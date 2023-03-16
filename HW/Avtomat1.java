package Seminar4.HW;

import Seminar1.CW3.BottleOfWater;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Avtomat1 extends Avtomat{
    List<ListOfChips> list1 = new ArrayList<>();
    List<ListOfChocolate> list2 = new ArrayList<>();
    List<ListOfWaters> list3 = new ArrayList<>();

    public void setList1(List<ListOfChips> list1) {
        this.list1 = list1;
    }

    public void setList2(List<ListOfChocolate> list2) {
        this.list2 = list2;
    }

    public void setList3(List<ListOfWaters> list3) {
        this.list3 = list3;
    }



    @Override
    String getProduct() {
        List<ListOfChips> listch = new ArrayList<>();
        List<ListOfChocolate> listOfChocolates = new ArrayList<>();
        List<ListOfWaters> listOfWaters = new ArrayList<>();
        for (ListOfChips lc : list1){
            lc.getChipsList().sort(new ComparableOfName<>());
            listch.add(lc);
        }
        for (ListOfWaters lw: list3){
            lw.getWaterList().sort(new ComparableOfName<>());
            listOfWaters.add(lw);
        }
        for (ListOfChocolate lch : list2){
            lch.getChocolateList().sort(new ComparableOfName<>());
            listOfChocolates.add(lch);
        }
        String s = listch.toString() + '\n' + listOfChocolates.toString() + '\n' + listOfWaters.toString();
        return s;
    }
}
