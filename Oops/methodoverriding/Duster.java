package methodoverriding;

public class Duster extends Car {
    
    public Duster(int price, String color) {
        super(price, color);
    }

    @Override
    public void riding(){
        System.out.println("Duster is going in 100k/h");
    }

}
