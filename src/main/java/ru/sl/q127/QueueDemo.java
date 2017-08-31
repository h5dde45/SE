package ru.sl.q127;

import java.util.PriorityQueue;
import java.util.Queue;

public class QueueDemo {
    public static void main(String[] args) {
        Queue<String> queue=new PriorityQueue<>();
        queue.add("asd");
        queue.add("zxc");
        System.out.println(queue.add("qwe"));
        System.out.println(queue.offer("cfr"));

        System.out.println(queue);
        System.out.println(queue.element());
        System.out.println(queue);
        System.out.println(queue.remove());
        System.out.println(queue);


    }
}
