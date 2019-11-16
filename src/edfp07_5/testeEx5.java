/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edfp07_5;

/**
 *
 * @author utilizador
 */
public class testeEx5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        SinglyLinkedList<Integer> list=new SinglyLinkedList<>();
        
        list.addFirst(1);
        list.addLast(2);
        list.addLast(3);
        list.addLast(4);
        
//       list.print();
        
        list.Reverse();
        
        list.print();
    }
    
}
