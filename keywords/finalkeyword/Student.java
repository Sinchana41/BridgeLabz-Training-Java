package keywords.finalkeyword;

public class Student {

   //if class is final - we can not inherit
   //if variable is final - we can not re-initialize the value

   int id;
   String name;

   public Student(int var1, String var2) {
      this.id = var1;
      this.name = var2;
   }

   public void display() {
      System.out.println(this.name + " : " + this.id);
   }

   public static void main(String[] var0) {
      Student var1 = new Student(101, "Sarswathi");
      var1.display();
   }
    

}
