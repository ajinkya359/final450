package binaryTree;

public class q4 {
    static int height(Node node){
        if(node==null )return 0;
        return Math.max(height(node.left), height(node.right))+1;
    }
    static int diameter(Node root){
        if(root==null) return 0;
        int height_left=height(root.left);
        int height_right=height(root.right);
        int left_diameter=diameter(root.left);
        int right_diameter=diameter(root.right);

        int temp=Math.max(left_diameter, right_diameter);
        return Math.max(temp, height_left+height_right+1);
        
    }
}
