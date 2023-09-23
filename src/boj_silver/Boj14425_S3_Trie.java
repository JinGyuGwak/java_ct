package boj_silver;
import java.util.*;
import java.io.*;

public class Boj14425_S3_Trie {
    static class Node{
        Map<Character,Node> map = new HashMap<>();
        boolean last = false;
    }
    public static class Trie{
        Node node = new Node();

        void insert(String a){
            Node node=this.node;
            for(int i=0;i<a.length();i++){
                node=node.map.computeIfAbsent(a.charAt(i), key -> new Node());
            }
            node.last=true;

        }
        boolean search(String a){
            Node node = this.node;
            for(int i=0;i<a.length();i++){
                node=node.map.getOrDefault(a.charAt(i),null);
                if(node == null) return false;
            }
            return node.last;
        }
    }



    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        Trie trie = new Trie();
        for(int i=0; i<n;i++){
            trie.insert(br.readLine());
        }
        int count=0;
        for(int i=0;i<m;i++){
            if(trie.search(br.readLine())) count+=1;
        }
        System.out.println(count);

    }


}
