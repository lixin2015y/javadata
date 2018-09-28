package com.array;

public class Student {
    private String name;
    private int score;

    public Student(String name, int score) {
        this.name = name;
        this.score = score;
    }

    @Override
    public String toString() {
        return String.format("Student(name: %s , score: %d)", name, score);
    }

    public static void main(String[] args) {
        Array<Student> studentArray = new Array<>(20);
        studentArray.addEnd(new Student("Alice", 100));
        studentArray.addEnd(new Student("Bob", 66));
        studentArray.addEnd(new Student("Charlie", 88));
        System.out.println(studentArray.toString());
    }
}

