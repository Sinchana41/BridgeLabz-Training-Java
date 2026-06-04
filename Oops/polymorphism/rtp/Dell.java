package polymorphism.rtp;

public class Dell extends Laptop {

    @Override
    public void display() {
    System.out.println("from dell  class");
    }

    public static void main(String[] args) {
        Laptop laptop = new Dell();
        laptop.display();
    }
}
