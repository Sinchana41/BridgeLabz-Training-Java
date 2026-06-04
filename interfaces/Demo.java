package interfaces;

//class -> class - extends
//class -> interface - implements
//interface -> interface - extends

interface Computer {
    void show();
}
 
class Laptop implements Computer{
    @Override
    public void show(){
        System.out.println("From laptop");
    }
}

class Desktop implements Computer{
    @Override
    public void show(){
        System.out.println("From Desktop");
    }
}

class Developer{
    public void show(Computer computer){
        computer.show();
    } 
}

public class Demo {
    
    public static void main(String[] args) {
        Computer laptop = new Laptop();
        Computer desktop = new Desktop();
        Developer developer = new Developer();
        developer.show(laptop);//From laptop
        developer.show(desktop);//From Desktop
    }
}
