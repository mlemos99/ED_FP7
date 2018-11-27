/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edfp07_3;

/**
 *
 * @author mario
 */
public class SolveTowers {

    /**
     * Creates a TowersOfHanoi puzzle and solves it.
     */
    public static void main(String[] args) {
        TowersOfHanoi towers = new TowersOfHanoi(5);
        towers.solve();
    }
}
