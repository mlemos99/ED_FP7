/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edfp07_1_2;

/**
 *
 * @author utilizador
 */
public class ex1TESTE {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        OrderedListADT<Integer> list=new DoubleLinkedOrderesList<>();
        list.add(1);
        list.add(2);
        list.add(4);
        list.add(5);
        list.add(3);
        
       
        System.out.println(list.print());
    }
    
}
