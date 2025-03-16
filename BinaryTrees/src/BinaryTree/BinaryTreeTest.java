package BinaryTree;

public class BinaryTreeTest {

    public static void printBinaryTree(BinaryTreeNode<Integer> root){

        if(root==null) return;

        System.out.println(root.data);
        printBinaryTree(root.left);
        printBinaryTree(root.right);
    }
}
