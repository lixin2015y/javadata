package com.array;

public class Array<E> {

    private E[] data;

    private int size;

    public Array(int capacity) {
        this.data = (E[]) new Object[capacity];
        size = 0;
    }

    public boolean isEmpty() {
        return this.size == 0;
    }


    public void add(int index, E e) {

        if (size == data.length) {
            throw new IllegalArgumentException("Add failed. Array is full.");
        }

        if (index < 0 || index > size) {
            throw new IllegalArgumentException("Add failed. Require index >= 0 and index <= size.");
        }

        for (int i = size - 1; i >= index; i--) {
            data[i + 1] = data[i];
        }
        data[index] = e;
        size++;
    }

    public void addHead(E e) {
        this.add(0, e);
    }

    public void addEnd(E e) {
        this.add(size, e);
    }

    public E get(int index) {
        if (index < 0 || index >= size) {
            throw new IllegalArgumentException("illegal index");
        }
        return data[index];
    }

    public void set(int index, E e) {
        if (index < 0 || index >= size) {
            throw new IllegalArgumentException("illegal index");
        }
        data[index] = e;
    }

    public boolean contains(E e) {
        for (int i = 0; i < size; i++) {
            if (data[i].equals(e)) {
                return true;
            }
        }
        return false;
    }

    public E remove(int index) {

        if (index < 0 || index >= size) {
            throw new IllegalArgumentException("illegal index");
        }
        E delE;
        delE = data[index];
        for (int i = index; i < size; i++) {
            data[i] = data[i + 1];
        }
        //清除当前对象
        data[size] = null;
        size--;
        return delE;
    }


    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(String.format("ArraySize : size = %d , capacity = %d\n", size, data.length));
        for (int i = 0; i < size; i++) {
            sb.append(data[i] + "  ");
        }
        return sb.toString();
    }
}
