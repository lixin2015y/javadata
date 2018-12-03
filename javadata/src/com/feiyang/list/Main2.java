package com.feiyang.list;

import com.array.Student;

import java.util.*;

public class Main2 {
    public static void main(String[] args) {
        /*list*/
        List<Student> studentList = new ArrayList<>();
        studentList.add(new Student("zhangsan", 15));
        studentList.add(new Student("lisi", 20));
        studentList.add(new Student("lisi", 15));
//        System.out.println(studentList.indexOf(new Student("lisi", 20)));


        /*map*/
        Map<String, Student> map = new HashMap<>();
        for (Student s : studentList) {
            map.put(s.getName(), s);
        }

        for (String key : map.keySet()) {
            System.out.println(map.get(key));
        }

        for (Map.Entry<String, Student> entry : map.entrySet()) {
            System.out.println(entry.getValue());
        }


        /*TreeMap*/
        Map<String, Student> treeMap = new TreeMap<>(new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return -o1.compareTo(o2);
            }
        });

        for (Student s : studentList) {
            treeMap.put(s.getName(), s);
        }

        for (Map.Entry<String, Student> entry : treeMap.entrySet()) {
            System.out.println(entry.getValue());
        }

        Map<Student, String> studentStringMap = new HashMap<>();
        studentStringMap.put(new Student("w", 12), "w");
        System.out.println(studentStringMap.get(new Student("w", 12)));

    }
}
