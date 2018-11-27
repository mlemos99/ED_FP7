/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edfp07_1_2;



/**
 *
 * @author User
 * @param <T>
 */
public class DoubleLinkedOrderesList<T> extends DoubleLinkedList<T> implements OrderedListADT<T> {

    public DoubleLinkedOrderesList() {
        super();
    }

    @Override
    public void add(T element) {
        if (element instanceof Comparable) {
            LinearNode<T> curr = head;
            Comparable<T> temp=(Comparable<T>) element;
            
            LinearNode<T> newNode= new LinearNode<>(element);
            int conta = 0;
            
            if(isEmpty()){  //lista vazia
               head=newNode;
               tail=head;
               this.count++;
               this.n_oper++;
               return;
           }
            
            //menor que o primeiro
            if(temp.compareTo(head.getValue())<0) {
               newNode.setNoSeguinte(head);
               head.setNoAnterior(newNode);
               head=newNode;
               this.count++;
               this.n_oper++;
               return;
            }
            
            //maior que o ultimo
            if(temp.compareTo(tail.getValue())>0) {
               tail.setNoSeguinte(newNode);
               newNode.setNoAnterior(tail);
               tail=newNode;
               this.count++;
               this.n_oper++;
               return;
            }
            
            //meter no meio
            
           while (curr.getNoSeguinte() != null && temp.compareTo(curr.getValue())>0){
               curr = curr.getNoSeguinte();
           }
           
           newNode.setNoAnterior(curr.getNoAnterior());
           curr.setNoAnterior(newNode);
           newNode.setNoSeguinte(curr);
           newNode.getNoAnterior().setNoSeguinte(newNode);
            this.count++;
            this.n_oper++;
            
            
            
            
            
        }
            
            
            
            
            
            
            
    } 
        }