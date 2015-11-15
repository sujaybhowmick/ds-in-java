package com.ds.tree;

/**
 * Created by Sujay on 15/11/2015.
 */
public class Node<T extends Comparable<T>> implements Tree<T> {

    private T data;
    private Tree<T> left;
    private Tree<T> right;

    public Node(T data){
        this.data = data;
    }

    public boolean isLeaf() {
        return (this.left == null && this.right == null);
    }

    public T get() {
        return this.data;
    }

    public void set(T data) {
        this.data = data;
    }

    public Tree<T> getLeft() {
        return this.left;
    }

    public Tree<T> getRight() {
        return this.right;
    }

    public void setRight(Tree<T> right) {
        this.right = right;

    }

    public void setLeft(Tree<T> left) {
        this.left = left;
    }

    public int compareTo(T o) {
        return this.data.compareTo(o);
    }
}
