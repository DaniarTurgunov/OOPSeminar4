package Seminar4.HW;
import java.util.*;
public class main {
    public static void main(String[] args) {
        ListOfWaters wL = new ListOfWaters();
        wL.setWaterList(Arrays.asList(new Water("Sprite", 50, 0.5),new Water("Fanta", 55, 0.5),new Water("Cola", 60, 0.5) ));
        ListOfChips cL = new ListOfChips();
        cL.setChipsList(Arrays.asList(new Chips("Lays", 80, 120), new Chips("Aringles",150, 125), new Chips("Russian Chips", 60, 80)));
        ListOfChocolate chL =new ListOfChocolate();
        chL.setChocolateList(Arrays.asList(new Chocolate("Dove",75,100), new Chocolate("Alpen Gold",60,85), new Chocolate("Schogetten", 150, 100)));
        Avtomat1 avt = new Avtomat1();
        avt.setList1(Collections.singletonList(cL));
        avt.setList3(Collections.singletonList(wL));
        avt.setList2(Collections.singletonList(chL));
        System.out.println(avt.getProduct());

    }
}

