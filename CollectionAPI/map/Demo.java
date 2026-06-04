package map;

import java.util.*;

public class Demo {

    public static void main(String[] args) {
        Map<String,Integer> m = new HashMap<String,Integer>();
        m.put("Sinchana", 22);
        m.put("Sushma", 24);
        m.put("Jayanthi", 45);
        m.put("Murthy", 61);

        System.out.println(m);//{Murthy=61, Sushma=24, Jayanthi=45, Sinchana=22}

        //Set<String> s = m.keySet();
        for(String key : m.keySet()){
            System.out.println(key+" : "+m.get(key));
        }
        
        System.out.println(m.isEmpty());//false
        m.replace("Sinchana",22,23);//{Murthy=61, Sushma=24, Jayanthi=45, Sinchana=23}
        System.out.println(m);//
    }
}
