package basic;
public class ThisKeyWord {
    
    String color;
    String brand;
    public String getColor() {
        return color;
    }
    //this -> refers to current object
    public void setColor(String color) {
        this.color = color;
    }
    public String getBrand() {
        return brand;
    }
    public void setBrand(String brand) {
        this.brand = brand;
    }

    public static void main(String[] args) {
        ThisKeyWord keyWord = new ThisKeyWord();
        keyWord.setBrand("TATA Siarra");
        System.out.println(keyWord.getBrand());//TATA Siarra
        keyWord.setColor("black");
        System.out.println(keyWord.getColor());//black
    }
}
