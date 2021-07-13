package binaryTree;

import java.util.ArrayList;
import java.util.Stack;

public class q7 {
    static void preOrder_helper_recursive(Node node,ArrayList<Integer> ans)
    {
        if(node!=null)
        {
            ans.add(node.data);
            preOrder_helper_recursive(node.left, ans);
            preOrder_helper_recursive(node.right, ans);
        }
        
    }

    static void preOrder_helper_iterative(Node node,ArrayList<Integer> ans){
        Stack<Node> st=new Stack<>();
        Node currentNode=node;
        while(!st.isEmpty()||currentNode!=null)
        {
            if(currentNode==null){
                currentNode=st.pop();
                ans.add(currentNode.data);
                if(currentNode.right!=null) st.add(currentNode.right);
                currentNode=currentNode.left;
            }
            else{

                ans.add(currentNode.data);                
                if(currentNode.right!=null) st.add(currentNode.right);
                currentNode=currentNode.left;

            }
        }
    }



    static ArrayList<Integer> inOrder(Node root){
        ArrayList<Integer> ans=new ArrayList<>();
        preOrder_helper_recursive(root, ans);
        return ans;
    }
}
