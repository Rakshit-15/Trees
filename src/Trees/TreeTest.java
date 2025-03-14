package Trees;

import java.util.*;
public class TreeTest {

    public static void printLevelWise(TreeNode<Integer> root){
        /* Your class should be named Solution
         * Don't write main().
         * Don't read input, it is passed as function argument.
         * Print output and don't return it.
         * Taking input is handled automatically.
         */
        Queue<TreeNode<Integer>> q=new LinkedList<>();

        q.add(root);


        while(!q.isEmpty()){

            int levelSize=q.size();


            for(int i=0;i<levelSize;i++){
                TreeNode<Integer> front=q.poll();
                System.out.print(front.data+" ");


                for(int j=0;j<front.children.size();j++){

                    q.add(front.children.get(j));

                }
            }
            System.out.println();
        }


    }

    public static int numNodeGreater(TreeNode<Integer> root,int x){


        // Write your code here
        int count=0;
        if(root==null){
            return 0;
        }



        for(int i=0;i<root.children.size();i++){

            int smallAns=numNodeGreater(root.children.get(i),x);
            count=count+smallAns;

        }
        if(root.data>x)
        {
            return 1+count;
        }
        return count;

    }
    public static int getHeight(TreeNode<Integer> root){


        if(root==null) return 0;
        int ans=0;

        for(int i=0;i<root.children.size();i++){
            int childHeight=getHeight(root.children.get(i));
            ans=Math.max(ans,childHeight);

        }
        return 1+ans;
    }

    public static void printPostOrder(TreeNode<Integer> root){

        if(root==null) return;

        for(int i=0;i<root.children.size();i++){
            printPostOrder(root.children.get(i));

        }
        System.out.print(root.data+" ");
        return;        // without return also,this would work as Java automatically returns to the caller once the recursive call finishes.
    }


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
