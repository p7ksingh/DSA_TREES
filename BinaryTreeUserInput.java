package com.arr.trees;

public class BinaryTreeUserInput {
    public static void printTrees(BinaryTreeNode<Integer> root) {
        // base case

        if (root == null) {
            return;
        }
        System.out.println(root.data);
        // if (root.left != null) {
        printTrees(root.left);
        // }
        // if (root.right != null) {
        printTrees(root.right);
        // }
    }

    public static void main(String[] args) {
        BinaryTreeNode<Integer> root = new BinaryTreeNode<Integer>(1);

        BinaryTreeNode<Integer> leftTree1 = new BinaryTreeNode<Integer>(2);
        BinaryTreeNode<Integer> rightTree1 = new BinaryTreeNode<Integer>(3);
        root.left = leftTree1;
        root.right = rightTree1;
        BinaryTreeNode<Integer> leftTree2 = new BinaryTreeNode<Integer>(4);

        BinaryTreeNode<Integer> rightTree2 = new BinaryTreeNode<Integer>(5);
        rightTree1.right = rightTree2;
        leftTree1.left = leftTree2;
        printTrees(root);
    }
}
