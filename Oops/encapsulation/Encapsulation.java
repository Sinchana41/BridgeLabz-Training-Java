package encapsulation;
class Encapsulation{
    String name;
    int age;

    public void setName(String n){
        name = n;
    }
    
    public String getName(){
        return name;
    }
    
    public void setAge(int a){
        age = a;
    }
    
    public int  getAge(){
        return age;
    }

    public static void main(String[] args){
        Encapsulation e = new Encapsulation();
        e.setName("Sinchana");
        System.out.println(e.getName());//Sinchana
        e.setAge(23);
         System.out.println(e.getAge());//23
    }
}