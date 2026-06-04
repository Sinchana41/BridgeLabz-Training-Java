package methodoverriding;

public class Demo {   public static void main(String[] args) {
        Car car = new Car(1100000, "green");
        car.riding();
        Duster duster =  new Duster(1000000, "Silver");
        duster.riding();
    }
}
