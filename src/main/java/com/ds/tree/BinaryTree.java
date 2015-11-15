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

    public long getHeight(){
       return getHeight(this.root);
    }

    public Tree<T> delete(T data){
        // TODO: Not working, need to check
        return delete(this.root, data);
    }

    private Tree<T> delete(Tree<T> root, T data){

        Tree<T> temp;
        if(root == null){
            throw new IllegalArgumentException("Tree is empty");
        }
        if(root.get().compareTo(data) > 0){
            root.setLeft(delete(root.getLeft(), data));
        }else if(root.get().compareTo(data) < 0){
            root.setRight(delete(root.getRight(), data));
        }else {
            if(root.getLeft() != null && root.getRight() != null){
                temp = findMax(root.getLeft());
                root.set(temp.get());
                root.setLeft(delete(root.getLeft(), root.get()));
            }else {
                temp = root;
                if(temp.getLeft() == null){
                    root = root.getRight();
                }
                if(temp.getRight() == null){
                    root = root.getLeft();
                }
                temp = null;
            }
        }
        return root;
    }

    public Tree<T> findMax(){
        return findMax(this.root);
    }

    private Tree<T> findMax(Tree<T> root){
        if(root == null){
            return null;
        }
        if(root.getRight() == null){
            return root;
        }else{
            return findMax(root.getRight());
        }

    }

    private long getHeight(Tree<T> node){
        if(null == node){
            return 0;
        }
        long left = getHeight(node.getLeft());
        long right = getHeight(node.getRight());
        if(left > right)
            return (left + 1);
        else
            return (right + 1);
    }

    private void inorder(Tree<T> node, List<T> sortedList){
        if(node != null) {
            inorder(node.getLeft(), sortedList);
            sortedList.add(node.get());
            inorder(node.getRight(), sortedList);
        }
    }

}
