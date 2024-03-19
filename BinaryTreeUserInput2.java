package com.arr.trees;

import java.util.Scanner;

public class BinaryTreeUserInput2 {
    public static BinaryTreeNode<Integer> takeTreesInput() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter root data");
        int rootData = sc.nextInt();
        if (rootData == -1) {
            return null;
        }

        BinaryTreeNode<Integer> root = new BinaryTreeNode<Integer>(rootData);
        BinaryTreeNode<Integer> leftChild = takeTreesInput();
        BinaryTreeNode<Integer> rightChild = takeTreesInput();
        root.left = leftChild;
        root.right = rightChild;
        return root;
    }

    public static void printTreeDetails(BinaryTreeNode<Integer> root) {

        if (root == null) {
            return;
        }
        System.out.println(root.data);
        printTreeDetails(root.left);
        printTreeDetails(root.right);

    }

    public static void main(String[] args) {
        BinaryTreeNode<Integer> root = takeTreesInput();
        printTreeDetails(root);
    }
}
