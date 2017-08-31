package ru.sl.q127;

import java.util.ArrayDeque;
import java.util.Deque;

public class DeQueueDemo {
    public static void main(String[] args) {
        Deque<String> deque=new ArrayDeque<>();
        deque.add("sdf");
        deque.add("tsdf");
        System.out.println(deque.add("dtgfr"));
        System.out.println(deque.add("atgfr"));


        System.out.println(deque);
        deque.addFirst("first");
        deque.addLast("last");
        System.out.println(deque);

        deque.push("push1");
        deque.push("push2");

        System.out.println(deque);
        deque.pop();
        System.out.println(deque);


    }
}
