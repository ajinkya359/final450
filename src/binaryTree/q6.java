package binaryTree;

import java.util.ArrayList;
import java.util.Stack;

public class q6 {

    static void inOrder_helper_recursive(Node node,ArrayList<Integer> ans)
    {
        if(node!=null)
        {
            inOrder_helper_recursive(node.left, ans);
            ans.add(node.data);
            inOrder_helper_recursive(node.right, ans);
        }
        
    }

    static void inOrder_helper_iterative(Node node,ArrayList<Integer> ans){
        Stack<Node> st=new Stack<>();
        Node currentNode=node;
        while(!st.isEmpty()||currentNode!=null)
        {
            if(currentNode==null){
                currentNode=st.pop();
                ans.add(currentNode.data);
                currentNode=currentNode.right;
            }
            else{
                st.add(currentNode);
                currentNode=currentNode.left;
            }
        }
    }



    static ArrayList<Integer> inOrder(Node root){
        ArrayList<Integer> ans=new ArrayList<>();
        inOrder_helper_recursive(root, ans);
        return ans;
    }
}
