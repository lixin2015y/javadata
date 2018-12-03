package com.array;

import java.util.Objects;

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

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }

        if (o instanceof Student) {
            Student student = (Student) o;
            return Objects.equals(this.name, student.name) && this.score == student.score;
        }
        return false;
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, score);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }
}

