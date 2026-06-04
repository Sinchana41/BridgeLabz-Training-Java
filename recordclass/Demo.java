/*record class -> used to for classes which is holding data
                  by defult variables private and final
                  we can declare only static variable inside the class
                  we can declare methods
                  no zero parameterized constructor
 */
record Alien(int id,String name) {
   // int alienId; ->error

   //Alien(){ } -> error

   
   public void show(){
    System.out.println("hi");
   }
/* 
   //cononical constructor -> same as the parameters we innitially
   public Alien(int id,String name) {
    this.id = id;
    this.name = name;
   }
*/
   //compact cononical constructor -> checking conditions
    Alien{
    if(id == 0){
        throw new NullPointerException("value can not be zero");
    }
    }

}

public class Demo{
    public static void main(String[] args) {
        Alien alien1 = new Alien(1, "Ram");
        Alien alien2 = new Alien(2, "Janu");
       // Alien alien3 = new Alien(0, "Seetha");//Exception
       // Alien alien4 = new Alien(); ->error
        
        System.out.println(alien1);//Alien[id=1, name=Ram]
        System.out.println(alien2);//Alien[id=2, name=Janu]
        alien1.show();//hi       
        System.out.println(alien1.name());//Ram
    }
}
