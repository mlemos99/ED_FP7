/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edfp07_1_2;

import java.util.Objects;

/**
 *
 * @author utilizador
 */
public class LinearNode<T> {
    private T value;
    private LinearNode<T> NoSeguinte;
    private LinearNode<T> NoAnterior;

    public LinearNode(T value) {
        this.value = value;
        this.NoSeguinte = null;
        this.NoAnterior = null;
    }

    public LinearNode() {
        this.value = null;
        this.NoSeguinte = null;
        this.NoAnterior = null;
    }

    public T getValue() {
        return value;
    }

    public LinearNode<T> getNoSeguinte() {
        return NoSeguinte;
    }

    public LinearNode<T> getNoAnterior() {
        return NoAnterior;
    }

    public void setValue(T value) {
        this.value = value;
    }

    public void setNoSeguinte(LinearNode<T> NoSeguinte) {
        this.NoSeguinte = NoSeguinte;
    }

    public void setNoAnterior(LinearNode<T> NoAnterior) {
        this.NoAnterior = NoAnterior;
    }

    @Override
    public String toString() {
        return "Node{" + "value=" + value + '}';
    }

    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final LinearNode<?> other = (LinearNode<?>) obj;
        if (!Objects.equals(this.value, other.value)) {
            return false;
        }
        return true;
    }
    
    
    
    
    
}
