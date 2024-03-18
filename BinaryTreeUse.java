package com.arr.trees;

public class BinaryTreeUse {
    public static void main(String[] args) {
        BinaryTreeNode<Integer> root = new BinaryTreeNode<>();
        root.data = 1;

        BinaryTreeNode<Integer> rootRight = new BinaryTreeNode<>();

        BinaryTreeNode<Integer> rootLeft = new BinaryTreeNode<>();
        root.right = rootRight;
        root.left = rootLeft;
        BinaryTreeNode<Integer> twoRight = new BinaryTreeNode<>();

        BinaryTreeNode<Integer> threeLeft = new BinaryTreeNode<>();
        rootRight.right = threeLeft;
        rootLeft.left = twoRight;
    }
}
