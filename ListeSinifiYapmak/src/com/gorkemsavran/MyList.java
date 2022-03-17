package com.gorkemsavran;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Objects;

public class MyList<E> implements IMyList<E> {

    private int capacity;
    private int size;

    private Object[] elements;

    public MyList() {
        this(10);
    }

    public MyList(final int capacity) {
        this.capacity = capacity;
        this.size = 0;
        this.elements = new Object[capacity];
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public int getCapacity() {
        return capacity;
    }

    @Override
    public boolean add(final E e) {
        if (size >= capacity) {
            capacity = capacity * 2;
            elements = Arrays.copyOf(elements, capacity);
        }
        elements[size] = e;
        size++;
        return true;
    }

    @Override
    public E get(final int index) {
        if (!isIndexValid(index)) return null;
        return (E) elements[index];
    }

    @Override
    public E remove(final int index) {
        if (!isIndexValid(index)) return null;
        E element = (E) elements[index];
        for (int i = index; i < size; i++) {
            elements[i] = elements[i + 1];
        }
        size--;
        return element;
    }

    @Override
    public E set(final int index, final E e) {
        if (!isIndexValid(index)) return null;
        elements[index] = e;
        return e;
    }

    @Override
    public int indexOf(final E e) {
        for (int i = 0; i < size; i++) {
            if (elements[i].equals(e)) {
                return i;
            }
        }
        return -1;
    }

    @Override
    public int lastIndexOf(final E e) {
        for (int i = size - 1; i >= 0; i--) {
            if (elements[i].equals(e)) {
                return i;
            }
        }
        return -1;
    }

    @Override
    public boolean isEmpty() {
        return size == 0;
    }

    @Override
    public E[] toArray() {
        return (E[]) elements;
    }

    @Override
    public void clear() {
        size = 0;
        elements = new Object[capacity];
    }

    @Override
    public MyList<E> subList(final int start, final int finish) {
        MyList<E> myList = new MyList<>();
        for (int i = start; i <= finish; i++) {
            myList.add((E) elements[i]);
        }
        return myList;
    }

    @Override
    public boolean contains(final E e) {
        for (int i = 0; i < size; i++) {
            if (elements[i].equals(e)) {
                return true;
            }
        }
        return false;
    }

    @Override
    public String toString() {
        return Arrays.toString(Arrays.stream(elements)
                .filter(Objects::nonNull)
                .toArray());
    }

    private boolean isIndexValid(final int index) {
        return index >= 0 && index <= size - 1;
    }
}
