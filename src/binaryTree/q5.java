package binaryTree;

public class q5 {
    static void mirror(Node node){
        if(node!=null){
            Node temp=node.left;
            node.left=node.right;
            node.right=temp;
            mirror(node.left);
            mirror(node.right);
        }
    }
}
