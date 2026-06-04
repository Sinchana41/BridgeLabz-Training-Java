package basic;
class Methods{

    //without return type, without parameters
    public void playMusic(){
        System.out.println("Music is playing");
    }

    //with return type, without parameters
    public String Music(){
       return"Music is playing";
    }

    //without return type, with parameters
    public void add(int a,int b){
        System.out.println(a+b);
    }

    //with return type, with parameters
    public int addition(int a,int b){
        return a+b;
    }

    public static void main(String[] args){
        Methods methods = new Methods();
        methods.playMusic();
        System.out.println(methods.Music());
        methods.add(2,3);
        System.out.println(methods.addition(2,5));
    }

}