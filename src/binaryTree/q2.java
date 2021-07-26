package binaryTree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class q2 {
    static ArrayList<Integer> reverseLevelOrder(Node node){
        ArrayList<Integer> ans=new ArrayList<>();
        Stack<Integer> st=new Stack<>();
        Queue<Node> qu=new LinkedList<>();
        qu.add(node);
        while(!qu.isEmpty()){
            Node temp=qu.remove();
            st.add(temp.data);
            if(temp.right!=null) qu.add(temp.right);
            if(temp.left!=null)qu.add(temp.left);
            
        }
        while(!st.isEmpty()){
            ans.add(st.pop());
        }

        return ans;

    }
}
