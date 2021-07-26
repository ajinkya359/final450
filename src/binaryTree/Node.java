package binaryTree;

public class Node {
    public int data;
    public Node left=null;
    public Node right=null;
    public Node(int data){
        this.data=data;
    }
    public static void main(String[] args) {
        Node node=new Node(134141);
        System.out.println(node.data);
    }
}
