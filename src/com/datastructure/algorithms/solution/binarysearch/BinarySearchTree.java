package com.datastructure.algorithms.solution.binarysearch;

import java.util.Scanner;

import static com.datastructure.algorithms.solution.binarysearch.Node.insert;

/**
 * @author bellag.
 */

public class BinarySearchTree {

    public static int getHeight(Node root) {
        /*
         * Any node has a height of 1, and the height of an empty subtree is -1
         * The height of a tree is the number of edges between the root node and its furthest leaf
         * Calculation should be performed recursively
         */
        if (root == null) {
            return -1;
        } else {
            return 1 + Math.max(getHeight(root.left), getHeight(root.right));
        }
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int numberOfNodes = sc.nextInt();
        Node root = null;
        while (numberOfNodes-- > 0) {
            int data = sc.nextInt();
            root = insert(root, data);
        }
        int height = getHeight(root);
        System.out.println(height);
    }
}