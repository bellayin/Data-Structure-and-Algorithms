package com.datastructure.algorithms.solution.binarysearch;

/**
 * @author bellag.
 */
public class Node {

    /*
     * Node's left and right subtrees are referred to as children.
     */
    Node left, right;
    int data;

    Node(int data) {
        this.data = data;
        left = right = null;
    }

    /*
     * = Insert leafs
     * Each element in the left subtree is less than or equal to the root element
     * Each element in the right subtree is greater than the root element
     */
    public static Node insert(Node root, int data) {
        if (root == null) {
            return new Node(data);
        } else {
            Node node;
            if (data <= root.data) {
                node = insert(root.left, data);
                root.left = node;
            } else {
                node = insert(root.right, data);
                root.right = node;
            }
            return root;
        }
    }
}
