package Graph.Node;

import java.util.ArrayList;

public class Node {
    private int data;
    private boolean visited;
    private ArrayList<Node> children= new ArrayList<Node>();
    public Node(int data){
        this.data=data;
        this.visited=false;
    }
    public boolean isVisited(){
        return this.visited;
    }
    public void setVisitedStatus(boolean status)
    {
        this.visited=status;
    }
    public int getData(){
        return this.data;
    }
    public void addChildren(Node node){
        this.children.add(node);
    }
    public ArrayList<Node> getChildren(){
        return this.children;
    }
}
