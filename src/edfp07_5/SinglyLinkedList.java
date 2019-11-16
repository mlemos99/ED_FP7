/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edfp07_5;

/**
 *
 * @author utilizador
 * @param <T>
 */
public class SinglyLinkedList<T> {

    private Node<T> first; //pode ter tail... mais um node
    private int size;

    public SinglyLinkedList(Node<T> first) {
        this.first = first;
        this.size = 1;
    }
    //CONSTRUTOR PARA UMA LISTA SEM NADA

    public SinglyLinkedList() {
        this.first = null;
        this.size = 0;
    }

    public int getSize() {
        return size;
    }

    public boolean isEmpty() {
        return (size == 0);
    }

    public void addFirst(T v) {
        Node<T> newNode = new Node<>(v, first);
        first = newNode;
        this.size++;
    }


    public void addLast(T v) {
        Node<T> newNode = new Node<>(v, null);
        if (isEmpty()) {
            first = newNode;
        } else {
            Node<T> c = first;
            while (c.getNext() != null) {
                c = c.getNext();
            }
            c.setNext(newNode);

        }
        size++;
    }

    public void removeFirst() {
        if (isEmpty()) {
            return;
        }
        first = first.getNext();
        size--;

    }

    public void removeLast() {
        if (isEmpty()) {
            return;
        }
        if (size == 1) {
            first = null;
        } else {
            Node<T> c = first;
            for (int i = 0; i < size - 2; i++) {
                c = c.getNext();
                c.setNext(c.getNext().getNext());
            }
            size--;
        }
    }

    public void remove(T value) {
        if (isEmpty()) {
            return;
        }
        if (value.equals(this.first.getValue())) {
            this.removeFirst();

        } else {
            Node<T> c = first;
            for (int i = 0; i < size - 1; i++) {
                if (value.equals(c.getNext().getValue())) {
                    c.setNext(c.getNext().getNext());
                    size--;
                }
                c = c.getNext();
            }
        }

    }

    public void print() {
        Node<T> c = first;
        while (c != null) {

            System.out.println(c.toString());
            c = c.getNext();
        }
    }

    public Node<T> reverseP(Node<T> node) {
        Node temp = node;
        if (node.getNext() == null) {
            first.setNext(null);
            first = node;
            return node;
        }else{
            this.reverseP(node.getNext()).setNext(temp);
        }

        return temp;
    }

    public void Reverse() {
        reverseP(this.first);
    }
}
