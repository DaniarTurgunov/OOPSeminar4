package Seminar4.HW;

public class Water extends Product {
    private int price;
    private double value;

    public Water(String name, int price, double value) {
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

    public double getValue() {
        return value;
    }

    public void setValue(double value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return  super.getName() +
                ", Цена= " + price +
                ", Обьем= " + value + "ml";
    }
}
