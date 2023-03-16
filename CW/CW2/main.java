package Seminar4.CW.CW2;

public class main {
    public static void main(String[] args) {
        Bank<Cat>catBank = new Bank<>();
        catBank.setId(new Cat("Dvor", 6, true));
        System.out.println(catBank.getClient().toString());
        Bank<Dog>dogBank = new Bank<>();
        dogBank.setId(new Dog("Bobik",10));
        System.out.println(dogBank.getClient().toString());
    }
}
