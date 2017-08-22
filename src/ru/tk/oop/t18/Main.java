package ru.tk.oop.t18;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Queue<Integer> queue=new LinkedList<>();

        int[]ints={3,7,6,5,2};
        for (int i=0;i<ints.length;i++){
            queue.add(ints[i]);
        }

        System.out.println(queue);
        System.out.println(queue.isEmpty());
        System.out.println(queue.remove());
        System.out.println(queue);

        while (!queue.isEmpty()){
            System.out.println(queue.remove());
        }
        System.out.println(queue.peek());
        System.out.println("===================");

        PriorityQueue<Integer> priorityQueue=new PriorityQueue<>();
        Integer[]integers={4,2,7,5,6};

        for (Integer integer:integers){
            priorityQueue.add(integer);
        }
        System.out.println(priorityQueue);

        PriorityQueue<Integer> priorityQueue2=new PriorityQueue<>();
        Integer[]integers2={4,2,7,5,6};

        for (int i=0;i<integers2.length;i++){
            priorityQueue2.offer(integers2[i]);
        }
        System.out.println(priorityQueue2);
        System.out.println("===================");
        System.out.println("===================");

        Comparator<Integer> comparator= (o1, o2) -> {
            if(o1>o2) return -1;
            if(o1==o2) return 0;
             return 1;
        };

        PriorityQueue<Integer> priorityQueue3=new PriorityQueue<>();
        Integer[]integers3={4,2,7,5,6};
        System.out.println(Arrays.toString(integers3));
        Collections.addAll(priorityQueue3,integers3);
        System.out.println("========");

        System.out.println(priorityQueue3);
        System.out.println(Arrays.toString(integers3));
        System.out.println("========");

        priorityQueue3.toArray(integers3);
        System.out.println(Arrays.toString(integers3));
        System.out.println(priorityQueue3);
        System.out.println("========");
        Arrays.sort(integers3,comparator);
        System.out.println(Arrays.toString(integers3));
        System.out.println(priorityQueue3);




    }
}
