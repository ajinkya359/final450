package binaryTree;

import java.util.ArrayList;
import java.util.Stack;



public class q8{

    static void postOrder_helper_iterative(Node node,ArrayList<Integer> ans){
        Stack<Node> st=new Stack<>();
        Node temp=node;
        while(!st.isEmpty()||temp!=null){
           if(temp!=null){
               if(temp.right!=null) st.add(temp.right);
               st.add(temp);
               temp=temp.left;
           }
           else{
               temp=st.pop();
               Node next_top=st.pop();
               if(next_top==temp.right) {
                   st.add(temp);
                   temp=next_top;
               }
               else{
                   ans.add(temp.data);
                   st.add(next_top);
                   System.out.println(temp.data);
                   temp=null;
               }
           }
        }

    }

    static void postOrder_helper_recursive(Node node,ArrayList<Integer> ans){
        if(node!=null){
            postOrder_helper_recursive(node.left, ans);
            postOrder_helper_recursive(node.right, ans);
            ans.add(node.data);
        }
    }


    static ArrayList<Integer> postOrder(Node root){
        ArrayList<Integer> ans=new ArrayList<>();
        postOrder_helper_recursive(root, ans);
        return ans;
    }
}