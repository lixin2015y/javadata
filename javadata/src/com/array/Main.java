package com.array;

public class Main {
    public static void main(String[] args) {
        Array<Integer> array = new Array(20);
        for (int i = 0; i < 10; i++) {
            array.addEnd(i);
        }
        System.out.println(array.toString());

        array.add(1, 99);

        System.out.println(array.toString());

        array.addHead(111);

        System.out.println(array.toString());

        System.out.println(array.contains(111));

        System.out.println(array.remove(0));

        System.out.println(array.contains(111));


    }
}
