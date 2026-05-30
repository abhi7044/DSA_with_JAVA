import java.util.*;
public class Priorder{
    static class Node{
        int data;
        Node left; 
        Node right;
        Node(int data){
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }
    
     static class BinaryTree{
        static int indx = -1;
        public static Node BuildTree(int nodes[]){
            indx++;
            if (nodes[indx] == -1) {
                return null;
            }
            Node newnode = new Node(nodes[indx]);
            newnode.left = BuildTree(nodes);
            newnode.right = BuildTree(nodes);

            return newnode;
        }
        public static int preorder (Node root){
            if (root == null) {
                return -1;
            }
            System.out.print(root.data+" ");
            preorder(root.left);
            preorder(root.right);

            return root.data;
        }
        public static void inorder (Node root){
            if (root == null) {
                return ;
            }
            inorder(root.left);
            System.out.print(root.data+" ");
            inorder(root.right);
        }
        
        public static void postorder(Node root){
            if (root == null) {
                return;
            }
            postorder(root.left);
            postorder(root.right);
            System.out.print(root.data+" ");
        }
    }
      
    public static void main(String[] args) {
        int nodes[] = {1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1};
        BinaryTree b = new BinaryTree();
        Node root = b.BuildTree(nodes);
       b.postorder(root);
     
    }
}