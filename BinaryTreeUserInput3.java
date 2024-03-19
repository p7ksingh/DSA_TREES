package com.arr.trees;

import java.util.Scanner;

public class BinaryTreeUserInput3 {
    public static BinaryTreeNode<Integer> takeTreesInputBetter(boolean isRoot, int parentdata, boolean isLeft) {
        if (isRoot) {
            System.out.println("Enter root data");
        } else {
            if (isLeft) {
                System.out.println("Enter left child of" + parentdata);
            } else {
                System.out.println("Enter right child of" + parentdata);
            }
        }
        Scanner sc = new Scanner(System.in);
        // System.out.println("Enter root data");
        int rootData = sc.nextInt();
        if (rootData == -1) {
            return null;
        }

        BinaryTreeNode<Integer> root = new BinaryTreeNode<Integer>(rootData);
        BinaryTreeNode<Integer> leftChild = takeTreesInputBetter(false, rootData, true);
        BinaryTreeNode<Integer> rightChild = takeTreesInputBetter(false, rootData, false);
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
        BinaryTreeNode<Integer> root = takeTreesInputBetter(true,0,true);
        printTreeDetails(root);
    }
}
