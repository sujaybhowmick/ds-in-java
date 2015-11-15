package com.ds.tree;

/**
 * Created by Sujay on 15/11/2015.
 */
public interface Tree<T> extends Comparable<T>{
    boolean isLeaf();

    T get();

    void set(T data);

    Tree<T> getLeft();

    Tree<T> getRight();

    void setRight(Tree<T> right);

    void setLeft(Tree<T> left);
}
