package com.arr.trees;

public class BinaryTreeUse1 {
    public static void printTrees(BinaryTreeNode<Integer> root) {
        if (root == null) {
            return;
        }
        System.out.println(root.data);
        // // base case
        // if (root.left != null) {
        printTrees(root.left);
        // }
        // if (root.right != null) {
        printTrees(root.right);
        // }
    }

    public static void main(String[] args) {
        BinaryTreeNode<Integer> root = new BinaryTreeNode<>(1);
        // root.data = 1;

        BinaryTreeNode<Integer> rootRight = new BinaryTreeNode<>(2);

        BinaryTreeNode<Integer> rootLeft = new BinaryTreeNode<>(3);
        root.right = rootRight;
        root.left = rootLeft;
        printTrees(root);
        // BinaryTreeNode<Integer> twoRight = new BinaryTreeNode<>();

        // BinaryTreeNode<Integer> threeLeft = new BinaryTreeNode<>();
        // rootRight.right = threeLeft;
        // rootLeft.left = twoRight;
    }
}
