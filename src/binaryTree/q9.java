package binaryTree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class q9 {
    static ArrayList<Integer> leftView(Node root){

        ArrayList<Integer> ans=new ArrayList<>();
        
        if(root==null)return ans;
        
        Queue<Node> qu=new LinkedList<>();
        qu.add(root);
        
        Node current_node=null;
        
        int number_of_nodes_on_current_level=1;
        
        while(!qu.isEmpty()){
            int nodes_in_next_level=0;
        
            Node temp=qu.peek();
            ans.add(temp.data);
            // qu.add(temp);/

            while(number_of_nodes_on_current_level!=0){
                current_node=qu.remove();
                if(current_node.left!=null) {
                    nodes_in_next_level++;
                    qu.add(current_node.left);
                }
                if(current_node.right!=null){
                    nodes_in_next_level++;
                    qu.add(current_node.right);
                }

                number_of_nodes_on_current_level--;
            }

            number_of_nodes_on_current_level=nodes_in_next_level;
        }
        return ans;
    }
}
