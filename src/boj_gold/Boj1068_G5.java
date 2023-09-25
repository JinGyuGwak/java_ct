package boj_gold;
import java.util.*;
import java.io.*;
public class Boj1068_G5 {

    static class Node{
        int index;
        List<Node> list = new ArrayList<>();
        public Node(int index){
            this.index=index;
        }
    }
    static int rootIndex;
    static Node[] nodes;
    static int dap=0;
    static int deleteNode;

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n=Integer.parseInt(br.readLine());
        nodes = new Node[n];
        for(int i=0;i<n;i++){
            nodes[i]=new Node(i);
        }
        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i=0;i<n;i++){
            int t=Integer.parseInt(st.nextToken());
            if(t==-1){
                rootIndex=i;
                continue;
            }
            nodes[t].list.add(new Node(i));
        }
        deleteNode=Integer.parseInt(br.readLine());
        deleteIndex(rootIndex);
        dap(rootIndex);
        System.out.println(dap);
    }
    static void deleteIndex(int d){
        for(Node no : nodes[d].list){
            if(no.index==deleteNode){
                nodes[d].list.remove(no);
                return;
            }
            deleteIndex(no.index);
        }
    }
    static void dap(int ind){
        for(Node no : nodes[ind].list){
            if(no.list.isEmpty()){
                dap+=1;
                return;
            }
            dap(no.index);
        }

        if(nodes[ind].list.isEmpty()){
            dap+=1;
            return;
        }
        for(Node no : nodes[ind].list){
            dap(no.index);
        }

    }

}