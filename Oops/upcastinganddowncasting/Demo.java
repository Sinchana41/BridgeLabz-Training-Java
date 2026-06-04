package upcastinganddowncasting;

public class Demo {

    public static void main(String[] args) {

        //upcasting - super class refernce storing sub class object
        India india1 = new Karnataka(1234567);
        india1.display();

        India india2 = new TamilNadu(2234567);
        india2.display();

        //downcasting - Converting back that super class refernce to sub class type
        Karnataka karnataka = (Karnataka)india1;
        karnataka.display();

        TamilNadu tamilNadu = (TamilNadu)india2;
        tamilNadu.display();

    }

}
