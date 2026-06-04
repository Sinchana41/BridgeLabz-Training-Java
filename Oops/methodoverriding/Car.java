package methodoverriding;

public class Car {
     int price;
     String color;

    public Car(int price, String color) {
        this.price = price;
        this.color = color;
    }
   
    public void riding(){
        System.out.println("Car is going in very speed");
    }

}
