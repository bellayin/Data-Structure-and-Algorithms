package com.datastructure.algorithms.solution.binarysearch;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

import static com.datastructure.algorithms.solution.binarysearch.Node.insert;

/**
 * @author bellag.
 */
public class BSTLevelOrderTraversal {

    static Queue<Node> queue = new LinkedList<>();

    static void levelOrder(Node root) {
        if (root != null) {
            queue.add(root);
        }
        while (!queue.isEmpty()) {
            Node tree = queue.remove();
            System.out.print(tree.data + " ");

            if (tree.left != null) {
                queue.add(tree.left);
            }
            if (tree.right != null) {
                queue.add(tree.right);
            }
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
        levelOrder(root);
    }
}
