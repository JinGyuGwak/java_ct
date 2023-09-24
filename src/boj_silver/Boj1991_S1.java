package boj_silver;
import java.io.*;
import java.util.*;
public class Boj1991_S1 {

    static Node head = new Node('A');

    static class Node{
        char value;
        Node left;
        Node right;
        public Node(char value){
            this.value=value;
            this.left=null;
            this.right=null;
        }
        public Node(){}

        public static void insert(Node node, char root, char left, char right){
            if(node.value == root){
                node.left = (left == '.') ? null : new Node(left);
                node.right = (right == '.') ? null : new Node(right);
            } else{
                if(node.left != null) insert(node.left,root,left,right);
                if(node.right != null) insert(node.right,root,left,right);
            }
        }
        public static void first(Node node){
            if(node==null) return;
            System.out.print(node.value);
            first(node.left);
            first(node.right);

        }
        public static void second(Node node){
            if(node==null)return;
            second(node.left);
            System.out.print(node.value);
            second(node.right);
        }
        public static void right(Node node){
            if(node==null)return;
            right(node.left);
            right(node.right);
            System.out.print(node.value);


        }
    }
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        for(int i=0;i<n;i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            char root = st.nextToken().charAt(0);
            char left = st.nextToken().charAt(0);
            char right = st.nextToken().charAt(0);
            Node.insert(head,root,left,right);
        }
        Node.first(head);
        System.out.println();
        Node.second(head);
        System.out.println();
        Node.right(head);
        System.out.println();

    }
}