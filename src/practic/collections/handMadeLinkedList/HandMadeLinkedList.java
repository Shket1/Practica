package practic.collections.handMadeLinkedList;

import java.util.NoSuchElementException;

public class HandMadeLinkedList<T> {

    class Node<E> {
        public E data;
        public Node<E> next;
        public Node<E> prev;

        public Node(Node<E> prev, E data, Node<E> next) {
            this.data = data;
            this.next = next;
            this.prev = prev;
        }
    }


    /**
     * Указатель на первый элемент списка. Он же first
     */
    private Node<T> head;

    /**
     * Указатель на последний элемент списка. Он же last
     */
    private Node<T> tail;

    private int size = 0;

    public void addFirst(T element) {
        final Node<T> oldHead = head;
        final Node<T> newHead = new Node<>(null, element, oldHead);
        head = newHead;
        if (oldHead == null)
            tail = newHead;
        else
            oldHead.prev = newHead;
        size++;
    }

    public T getFirst() {
        final Node<T> curHead = head;
        if (curHead == null)
            throw new NoSuchElementException();
        return head.data;
    }

    public void addLast(T element) {
        final Node<T> oldTail = tail;
        final Node<T> newTail = new Node<>(oldTail, element,null);
        tail = newTail;
        if (oldTail == null)
            head = newTail;
        else
            oldTail.next = newTail;
        size++;
    }

    public T getLast() {
        final Node<T> curTail = tail;
        if (curTail == null)
            throw new NoSuchElementException();
        return tail.data;
    }

    public int size() {
        return this.size;
    }

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
}