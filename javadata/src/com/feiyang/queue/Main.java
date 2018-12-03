package com.feiyang.queue;

import java.util.Arrays;
import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;

public class Main {
    public static void main(String[] args) {
//        Queue queue = new LinkedList();
//        queue.add("b");
//        queue.offer("a");
//        System.out.println(queue);
//
//        System.out.println(queue.element());
//        queue.remove();
//        System.out.println(queue);
//
//        System.out.println(queue.peek());
//        queue.poll();
//        System.out.println(queue);


        Queue<String> priorityQueue = new PriorityQueue<>(new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o1.compareTo(o2);
            }
        });
        priorityQueue.addAll(Arrays.asList("b", "a"));
        System.out.println(priorityQueue.peek());

    }
}
