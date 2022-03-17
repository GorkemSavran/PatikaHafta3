package com.gorkemsavran;

public interface IMyList<E> {
    int size();

    int getCapacity();

    boolean add(E e);

    E get(int index);

    E remove(int index);

    E set(int index, E e);

    int indexOf(E e);

    int lastIndexOf(E e);

    boolean isEmpty();

    E[] toArray();

    void clear();

    MyList<E> subList(int start, int finish);

    boolean contains(E e);
}
