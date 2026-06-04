package streamAPI;

import java.util.*;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Demo {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(2,5,3,6,4,8,7);

        // Consumer<Integer> c = new Consumer<Integer>() {
        //     @Override
        //     public void accept(Integer n) {
        //        System.out.println(n);
        //     }      
        // };
        // list.forEach(c);
        list.forEach(n ->System.out.println(n));

        int s = list.stream()
                     .filter(n -> n % 2 == 0)
                     .map(n -> n * 2)
                     .reduce(0,(a,b) -> a + b);

        System.out.println(s);//40
        
        IntStream.rangeClosed(1,10)
                 .forEach(System.out::println);

        Stream<Integer> s1 = list.stream()
                                .filter(n -> n % 2 == 0)
                                .map(n -> n * 3);

        s1.forEach(n -> System.out.print(n+" "));//6 18 12 24


        ArrayList<Integer> al = new ArrayList<>(1000);
        Random r = new Random();
        for(int i = 0; i <= 1000;i++){
            al.add(i,r.nextInt(100));
        }
       // System.out.println(al);
        
        long startSeq = System.currentTimeMillis();
        int sum1 = al.stream()
                     .map(n -> n*2)
                     .mapToInt(n -> n)
                     .sum();
        long endSeq = System.currentTimeMillis();

        long startpara = System.currentTimeMillis();
        int sum2 = al.parallelStream()
                     .map(n -> n*2)
                     .mapToInt(n -> n)
                     .sum();
        long endPara = System.currentTimeMillis();

        System.out.println(sum1+" "+sum2);
        System.out.println(endSeq-startSeq);
        System.out.println(endPara-startpara);

        List<String> names = Arrays.asList("sinchana","Laxmi","Abhinaya","Deepika");

       Optional<String> n = names.stream()
                                 .filter(str -> str.contains("x"))
                                 .findFirst();
                 
        System.out.println(n.orElse("not found"));//Optional[Laxmi]
                                 
        String name = names.stream()
                            .filter(st -> st.startsWith("S"))
                            .findFirst()
                            .orElse("not found");

        System.out.println(name);//not found
        
    }
}
