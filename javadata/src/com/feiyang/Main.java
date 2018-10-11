package com.feiyang;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();

        list.add("张三");
        list.add("李四");
        list.add("王五");

        //将list转化为数组
        Object[] array = list.toArray();

        String[] array2 = list.toArray(new String[4]);

        System.out.println(list.indexOf("李四"));

        System.out.println(list.contains("赵六"));



    }
}
