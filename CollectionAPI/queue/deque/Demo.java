package queue.deque;

import java.util.LinkedList;

public class Demo {

    public static void main(String[] args) {
        LinkedList<Integer> linkedList = new LinkedList<>();
        linkedList.add(2);
        linkedList.add(5);
        linkedList.add(10);
        linkedList.add(20);

        linkedList.forEach(System.out::println);

        System.out.println(linkedList.size());//4
        System.out.println(linkedList.contains(10));//true
        System.out.println(linkedList.remove());//2
        System.out.println(linkedList);//[5, 10, 20]
    }

}
