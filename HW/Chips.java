package Seminar4.HW;

public class Chips extends Product{
    private int price;
    private int value;

    public Chips(String name, int price, int value) {
        super(name);
        this.price = price;
        this.value = value;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return super.getName() +
                ", Цена= " + price +
                ", Обьем= " + value + "гр";
    }
}
