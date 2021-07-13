package Graph;

import Graph.Node.Node;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class GraphTraversalAlgorithms {
    public static ArrayList<Node> DFS(Node root)
    {
        ArrayList<Node> result=new ArrayList<>();
        if(root!=null)
        {
            Stack<Node> stack=new Stack<>();
            Node current;
            stack.add(root);
            root.setVisitedStatus(true);
            while(!stack.isEmpty())
            {
                current=stack.pop();
                System.out.println(current.getData());
                result.add(current);
                for(Node x: current.getChildren())
                {
                    if(!x.isVisited()) {
                        stack.add(x);
                        x.setVisitedStatus(true);
                    }
                }
            }
            current=null;
            stack.add(root);
            root.setVisitedStatus(false);
            while(!stack.isEmpty())
            {
                current=stack.pop();
                for(Node x: current.getChildren())
                {
                    if(x.isVisited()) {
                        stack.add(x);
                        x.setVisitedStatus(false);
                    }
                }
            }
        }
        return result;
    }
    public static ArrayList<Node> BFS(Node root)
    {
        ArrayList<Node> result=new ArrayList<>();

        if(root!=null)
        {

            Queue<Node> queue=new LinkedList<>();
            Node current;
            queue.add(root);
            root.setVisitedStatus(true);
            while(!queue.isEmpty())
            {
                current=queue.remove();
                System.out.println(current.getData());
                result.add(current);
                for(Node x: current.getChildren())
                {
                    if(!x.isVisited()) {
                        queue.add(x);
                        x.setVisitedStatus(true);
                    };
                }
            }
            current=null;
            queue.add(root);
            root.setVisitedStatus(false);
            while(!queue.isEmpty())
            {
                current=queue.remove();
                for(Node x: current.getChildren())
                {
                    if(x.isVisited()) {
                        queue.add(x);
                        x.setVisitedStatus(false);
                    }
                }
            }
        }
        return result;
    }

}
