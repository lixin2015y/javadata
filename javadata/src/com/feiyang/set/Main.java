package com.feiyang.set;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        List<String> list = Arrays.asList("a", "d", "c", "a");

        Set<String> set = new TreeSet<>(new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return -o1.compareTo(o2);
            }
        });

        set.addAll(list);

        System.out.println(new ArrayList<>(set));
    }


}
