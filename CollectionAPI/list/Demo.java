package list;

import java.util.*;


public class Demo {
    public static void main(String[] args) {
       List<Integer> l = new ArrayList<Integer>();
       l.add(10);
       l.add(3);
       l.add(4);
       l.add(5);
       System.out.println(l);//[2, 3, 4, 5]

       for (int num : l) {
        System.out.println(num);
       }

       for(int i = 0;i < l.size();i++){
        System.out.print(l.get(i)+" ");//10 3 4 5 
       }
       System.out.println();
       
       Iterator<Integer> i = l.iterator();

        while (i.hasNext()) 
            System.out.print(i.next()+" ");// 10 3 4 5

        System.out.println();

        ListIterator<Integer> li = l.listIterator();
        while (li.hasNext()) 
            System.out.print(li.next()+" ");//10 3 4 5 
       
        System.out.println();

        while (li.hasPrevious()) 
            System.out.print(li.previous()+" ");//5 4 3 10 

       System.out.println();
       System.out.println(l.contains(5));//true
       System.out.println(l.indexOf(3));//1
       System.out.println(l.size());//4
       System.out.println(l.remove(2));//4
       System.out.println(l.removeAll(l));//true
    }

}
