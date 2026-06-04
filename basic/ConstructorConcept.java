package basic;
public class ConstructorConcept {
    int id;
    String name;

    //Default constructor
    public ConstructorConcept(){
    }

    //parameterized Constructor
    public ConstructorConcept(int id,String name){
        this.id = id;
        this.name = name;
    }

    public static void main(String[] args) {
        ConstructorConcept concept = new ConstructorConcept(101,"Sinchana");
        System.out.println(concept.id+" : "+concept.name);
    }
}
