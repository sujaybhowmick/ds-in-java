package com.ds.tree;

import java.util.ArrayList;
import java.util.List;

/**
 * Generic Binary Tree
 * Created by Sujay on 15/11/2015.
 */
public class BinaryTree<T extends Comparable<T>> {
    private Tree<T> root;


    public Tree<T> insert(T data){
        if(null == this.root){
            this.root = new Node<T>(data);
            return this.root;
        }else {
            return insert(this.root, data);
        }
    }

    private Tree<T> insert(Tree<T> node, T data){
        if(null == node){
            return new Node<T>(data);
        }else if(node.compareTo(data) > 0){
            node.setLeft(insert(node.getLeft(), data));
        }else if(node.compareTo(data) < 0){
            node.setRight(insert(node.getRight(), data));
        }
        return node;
    }

    public List<T> sort(){
        List<T> sortedList = new ArrayList<T>();
        inorder(this.root, sortedList);
        return sortedList;
    }

    private void inorder(Tree<T> node, List<T> sortedList){
        if(node != null) {
            inorder(node.getLeft(), sortedList);
            sortedList.add(node.get());
            inorder(node.getRight(), sortedList);
        }
    }

}
