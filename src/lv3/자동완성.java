package lv3;

import boj_silver.Boj14425_S3_Trie;

import java.util.HashMap;
import java.util.Map;

public class 자동완성 {
    static class Node{
        Map<Character,Node> map = new HashMap<>();
        boolean last = false;
        int pro=0;
    }
    static class Trie{
        Node node = new Node();
        void insert(String a){
            Node node=this.node;
            for(int i=0;i<a.length();i++){
                if(node.map.get(a.charAt(i)) == null){
                    node.map.put(a.charAt(i),new Node());
                }
                node=node.map.get(a.charAt(i));
                node.pro+=1;


            }
            node.last=true;
        }
        int search(String a){
            Node node = this.node;
            for(int i=0;i<a.length();i++){
                node = node.map.getOrDefault(a.charAt(i),null);
                if(node.pro==1)return i+1;
            }
            return a.length();

        }
    }
    public static int solution(String[] words) {
        int answer = 0;
        Trie trie = new Trie();
        for(String a : words){
            trie.insert(a);
        }
        for(String a : words){
            answer+=trie.search(a);
        }
        return answer;
    }

    public static void main(String[] args){
        System.out.println(자동완성.solution(new String[]{"go","gone","guild"}));

    }


}
