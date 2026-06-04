package basic;
public class StaticKeyWord {
    
    String mobileBrand;
    int mobilePrice;
    //static variable
    static String memory = "128GB";//common for all the objects

    public StaticKeyWord(){
        System.out.println("this is constructor");
    }

    public StaticKeyWord(String mobileBrand,int mobilePrice){
        this.mobileBrand = mobileBrand;
        this.mobilePrice = mobilePrice;
        System.out.println("this is constructor");
    }

    public String getMobileBrand() {
        return mobileBrand;
    }

    public int getMobilePrice() {
        return mobilePrice;
    }

    //Non-static method
    public void displayInformation(){
        System.out.println(mobileBrand+" "+mobilePrice);
    }
  
    //static method
    public static void display(StaticKeyWord sk){
        System.out.println(sk.mobileBrand+" "+sk.mobilePrice);
    }
    
    //static block
    static{
        System.out.println("This is the static block");
    }

    public static void main(String[] args) {
        StaticKeyWord sk = new StaticKeyWord("VIVO", 14000);
        StaticKeyWord staticKeyWord = new StaticKeyWord("RealMe", 15000);
        sk.displayInformation();
        StaticKeyWord.display(staticKeyWord);

        System.out.println(memory);
    }
    
}
