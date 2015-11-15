package com.ds.tree;

import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;

/**
 * Created by Sujay on 16/11/2015.
 */
public class BinaryTreeTest {

    @Test
    public void testSort() throws Exception {
        BinaryTree<Student> binaryTree = new BinaryTree<Student>();
        Student student1 = new Student("Sujay", "Bhowmick");
        Student student2 = new Student("Kiaan", "Bhowmick");
        Student student3 = new Student("Annette", "Bhowmick");
        Student student4 = new Student("Elroy", "Stephens");
        Student student5 = new Student("Sheryl", "Stephens");
        Student student6 = new Student("Gwen", "Stephens");
        Student student7 = new Student("Some", "Bhowmick");
        Student student8 = new Student("Ruma", "Bhowmick");

        binaryTree.insert(student1);
        binaryTree.insert(student2);
        binaryTree.insert(student3);
        binaryTree.insert(student4);
        binaryTree.insert(student5);
        binaryTree.insert(student6);
        binaryTree.insert(student7);
        binaryTree.insert(student8);


        List<Student> sortedList = binaryTree.sort();
        assertEquals(sortedList.get(0).toString(), "Annette, Bhowmick");
        assertEquals(sortedList.get(7).toString(), "Sujay, Bhowmick");

        System.out.println(binaryTree.getHeight());
        System.out.println(binaryTree.findMax().get());
        System.out.println(binaryTree.delete(student7));
        sortedList = binaryTree.sort();
    }
}