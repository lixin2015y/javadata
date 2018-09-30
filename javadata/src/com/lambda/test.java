package com.lambda;

import com.array.Array;

import java.util.Arrays;
import java.util.Comparator;

public class test {
    public static void main(String[] args) {
        Thread thread = new Thread(() -> {
            System.out.println("run方法");
        });

        thread.start();

        int arr[] = new int[]{1, 2, 6, 4, 3};

//        Arrays.sort(arr, (s1, s2) -> {
//            return (s1 < s2) ? true : false;
//        });

        Arrays.sort(arr);

        System.out.println(Arrays.toString(arr));

    }


}
