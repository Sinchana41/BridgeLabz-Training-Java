package set;

import java.util.*;

public class Demo {

    public static void main(String[] args) {
        Set<Integer> s = new HashSet<Integer>();
        s.add(10);
        s.add(3);
        s.add(5);
        s.add(7);
        s.add(3);

        System.out.println(s);//[3, 5, 7, 10]

        Iterator<Integer> i = s.iterator();

        while (i.hasNext()) 
            System.out.print(i.next()+" ");//3 5 7 10 

        System.out.println(s.contains(7));//true
        System.out.println(s.isEmpty());//false

        HashSet<Integer> hs = new HashSet<Integer>();
        hs.add(87);
        hs.add(89);
        System.out.println(s.addAll(hs));//true
        System.out.println(s);//[3, 5, 7, 87, 89, 10]
    }

}
