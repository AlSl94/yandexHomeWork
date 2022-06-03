package ru.yandex.Sprint.Sprint4.Lesson2_4;

import java.util.NoSuchElementException;



public class HandMadeLinkedList<E> {

    public static void main(String[] args) {
        HandMadeLinkedList<Integer> integers = new HandMadeLinkedList<>();

        integers.addFirst(1);
        integers.addFirst(2);
        integers.addFirst(3);
        integers.addLast(4);
        integers.addLast(5);

        System.out.println(integers.getFirst());
        System.out.println(integers.getLast());
    }

    class Node<E> {
        public E value;
        public Node<E> next;
        public Node<E> prev;

        public Node(Node<E> prev, E value, Node<E> next) {
            this.value = value;
            this.next = next;
            this.prev = prev;
        }
    }


    /**
     * Указатель на первый элемент списка. Он же first
     */
    private Node<E> first;

    /**
     * Указатель на последний элемент списка. Он же last
     */
    private Node<E> last;

    private int size = 0;

    public void addFirst(E element) {
        final Node<E> oldHead = first;
        final Node<E> newNode = new Node<>(null, element, oldHead);
        first = newNode;
        if (oldHead == null)
            last = newNode;
        else
            oldHead.prev = newNode;
        size++;
    }

    public E getFirst() {
        final Node<E> curHead = first;
        if (curHead == null)
            throw new NoSuchElementException();
        return first.value;
    }

    public void addLast(E element) {
        final Node<E> oldTail = last;
        final Node<E> newNode = new Node<>(oldTail, element, null);
        last = newNode;
        if (oldTail == null) {
            last = newNode;
        } else
            oldTail.prev = newNode;
        size++;
    }

    public E getLast() {
        final Node<E> last = this.last;
        if (last == null)
            throw new NoSuchElementException();
        return last.value;
    }

    public int size() {
        return this.size;
    }
}