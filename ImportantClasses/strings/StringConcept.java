package ImportantClasses.strings;
class StringConcept{
    public static void main(String[] args){
        String name = "Sinchana";
        System.out.println(name);//Sinchana

        name = "Shyam";
        System.out.println(name);//Shyam
        System.out.println(name.length());//5
        System.out.println(name.charAt(0));//S
        System.out.println(name.toUpperCase());//SHYAM
        System.out.println(name.toLowerCase());//shyam
        System.out.println(name.indexOf('y'));//2
        System.out.println(name.isEmpty());//false
        name = name.concat("A");
        System.out.println(name);//ShyamA
        System.out.println(name.concat("B"));//ShyamAB
        

        //Immutable
        String s = new String("Ram");
        //mutable
        StringBuilder sb = new StringBuilder("Seetha");
        StringBuffer sbu = new StringBuffer("Abhimanyu");

        System.out.println(s);//Ram
        sb = sb.append("Lava");
        System.out.println(sb);//SeethaLava
        sbu = sbu.append("kusha");
        System.out.println(sbu);//Abhimanyukusha
        System.out.println(sbu.reverse());//ahsukuynamihbA
    } 
}