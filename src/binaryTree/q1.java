package binaryTree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class q1 {
    static ArrayList<Integer> levelOrder(Node node)
    {
        ArrayList<Integer> ans=new ArrayList<Integer>();
        Queue<Node> queue=new LinkedList<Node>();
        queue.add(node);
        while(!queue.isEmpty())
        {
            Node temp= node=queue.remove();
            ans.add(temp.data);
            if(temp.left!=null)
            queue.add(temp.left);
            if(temp.right!=null)
            queue.add(temp.right);
           
            
        }
        return ans;
    }
}
