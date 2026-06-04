package polymorphism.rtp;

public class Hp extends Laptop {

    @Override
    public void display() {
    System.out.println("from Hp  class");
    }

    public static void main(String[] args) {
        Laptop laptop = new Hp();
        laptop.display();
    }
}
