package binaryTree;


public class q3 {
    
    static int height(Node node){
        if(node==null )return 0;
        return Math.max(height(node.left), height(node.right))+1;
    }
}
