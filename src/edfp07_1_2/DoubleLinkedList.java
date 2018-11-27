/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edfp07_1_2;


import java.util.Iterator;

/**
 *
 * @author User
 * @param <T>
 */
public class DoubleLinkedList<T> implements ListADT<T> {

    protected LinearNode<T> head;
    protected LinearNode<T> tail;
    protected int count;
    protected int n_oper;

    public DoubleLinkedList() {
        this.head = null;
        this.tail = null;
        this.count = 0;
        this.n_oper = 0;
    }
    
    
    

    @Override
    public T removeFirst() {
        if (isEmpty()) {
            return null;
        }
        T first = head.getValue();
        head = head.getNoSeguinte();
        head.setNoAnterior(null);
        count--;
        n_oper++;
        return first;
    }

    @Override
    public T removeLast() {
        if (isEmpty()) {
            return null;
        }

        T last = tail.getValue();
        tail = tail.getNoAnterior();
        tail.setNoSeguinte(null);
        count--;
         n_oper++;
        return last;
    }

    @Override
    public T remove(T element) {
        if (isEmpty()) {
            return null;
        }

        boolean found = false;
        LinearNode<T> previous = null;
        LinearNode<T> current = head;

        while (current != null && !found) {
            if (element.equals(current.getValue())) {
                found = true;
            } else {
                previous = current;
                current = current.getNoSeguinte();
            }
        }

        if (!found) {
            return null;
        }

        if (size() == 1) {
            head = tail = null;
        } else if (current.equals(head)) {
            head = current.getNoSeguinte();
        } else if (current.equals(tail)) {
            tail = previous;
            tail.setNoSeguinte(null);
        } else {
            previous.setNoSeguinte(current.getNoSeguinte());
        }

        count--;
        n_oper++;
        return current.getValue();

    }

    @Override
    public T first() {
        return this.head.getValue();
    }

    @Override
    public T last() {
        return this.tail.getValue();
    }

    @Override
    public boolean contains(T target) {
        if (isEmpty()) {
            return false;
        }

        boolean found = false;
        LinearNode<T> previous = null;
        LinearNode<T> current = head;

        while (current != null && !found) {
            if (target.equals(current.getValue())) {
                return true;
            } else {
                previous = current;
                current = current.getNoSeguinte();
            }
        }

        return false;

    }

    @Override
    public boolean isEmpty() {
        return this.count == 0;
    }

    @Override
    public int size() {
        return this.count;
    }

    @Override
    public Iterator<T> iterator() {
        return new DoubleLinkedIterator<>(this.n_oper);
    }

  
    private class DoubleLinkedIterator<T> implements Iterator<T>{

        private LinearNode<T> actual;
        private int expected;
        private boolean can;
        
        public DoubleLinkedIterator(int expected) {
            this.actual=(LinearNode<T>) head;
            this.expected=expected;
            can=false;
        }
        
        
        
        @Override
        public boolean hasNext() {
            return(actual.getNoSeguinte()!=null);
        }

        @Override
        public T next() {
            if(expected==n_oper){
                can=true;
            }
            if(can==true){
                this.actual=this.actual.getNoSeguinte();
                return this.actual.getNoAnterior().getValue();
            }
            return null;
        }
        
    }
    
     private String printRecursivo(LinearNode<T> n){
        String lista="";
        
        
        if(n==null){
            return lista;
        }
        else{
            lista=n.getValue()+printRecursivo(n.getNoSeguinte());

        }
        return lista;
    }
     
     private String printReverse(LinearNode<T> n){
        String lista="";
        
        
        if(n==null){
            return lista;
        }
        else{
            lista=" "+n.getValue()+printReverse(n.getNoAnterior());

        }
        return lista;
    }
     
    @Override
     public String print(){
         //return this.printRecursivo(this.head);
         return this.printReverse(this.tail);
         
     }
     
     public void replace(T existingElement, T newElement){
         
     }
     
     
}
