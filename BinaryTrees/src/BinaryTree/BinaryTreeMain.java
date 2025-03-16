package BinaryTree;

import static BinaryTree.BinaryTreeTest.printBinaryTree;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class BinaryTreeMain {
    public static void main(String[] args) {

        BinaryTreeNode<Integer> root=new BinaryTreeNode<>(1);
        BinaryTreeNode<Integer> node1=new BinaryTreeNode<>(2);
        BinaryTreeNode<Integer> node2=new BinaryTreeNode<>(3);
        BinaryTreeNode<Integer> node3=new BinaryTreeNode<>(4);
        BinaryTreeNode<Integer> node4=new BinaryTreeNode<>(5);

                root.left=node1;
                root.right=node2;

                node1.right=node3;
                node2.left=node4;

                printBinaryTree(root);

    }
}