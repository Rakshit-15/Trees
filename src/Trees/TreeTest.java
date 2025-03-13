package Trees;

public class TreeTest {

    public static int sumOfAllNode(TreeNode<Integer> root){

        if(root==null) return 0;  // if there is no root then there will be sum as 0.

        int sum=0;
        // through this loop we will have the ans of all nodes through recursion and
        //once we have that we will add root data to return the final ans.
        for(int i=0;i<root.children.size();i++){
            int ans=sumOfAllNode(root.children.get(i));
            sum+=ans;
        }
        return sum+root.data;

    }

    public static int countNodes(TreeNode<Integer> root){

         if(root==null) return 0;

         int count=1;
         for(int i=0;i<root.children.size();i++){
             int ans=countNodes(root.children.get(i));
             count+=ans;
         }
        return count;
    }

    public static void printTree(TreeNode<Integer> root){

        if(root==null) return;

        System.out.print (root.data+" :");
        for(int i=0;i<root.children.size();i++){
            System.out.print(root.children.get(i).data+" ");
        }
        System.out.println();
        for(int i=0;i< root.children.size();i++){

              TreeNode<Integer> child=root.children.get(i);
              printTree(child);

        }


    }


}
