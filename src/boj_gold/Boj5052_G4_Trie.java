package boj_gold;

import java.util.HashMap;
import java.util.Map;

public class Boj5052_G4_Trie {
    static class Node {
        // 자식노드
        Map<Character, Node> childNode = new HashMap<Character, Node>();
        // 단어의 끝인지 아닌지 체크
        boolean endOfword;
    }
    static class CodingNojam_Trie {

        // Trie자료구조를 생성할 떄 rootNode는 기본적으로 생성
        Node rootNode = new Node();

        // Trie에 문자열 저장
        void insert(String str) { //busy
            // Trie자료구조는 항상 rootNode부터 시작
            Node node = this.rootNode;

            // 문자열의 각 단어마다 가져와서 자식노드 중에 있는지 체크
            // 없으면 자식노드 새로 생성
            for(int i=0; i<str.length(); i++) {
                node = node.childNode.computeIfAbsent(str.charAt(i), key -> new Node()); //만약 자식노드가 없으면
            // node.childNode.put(key,new Node())
                // node = node.childNode.get(key)  -> 빈 객체임
            }
            // 저장 할 문자열의 마지막 단어에 매핑되는 노드에 단어의 끝임을 명시
            node.endOfword = true;
        }

        // Trie에서 문자열 검색
        boolean search(String str) {
            // Trie자료구조는 항상 rootNode부터 시작
            Node node = this.rootNode;

            // 문자열의 각 단어마다 노드가 존재하는지 체크
            for(int i=0; i<str.length(); i++) {//card
                // 문자열의 각 단어에 매핑된 노드가 존재하면 가져오고 아니면 null
                node = node.childNode.getOrDefault(str.charAt(i), null);
                if(node == null) {
                    // node가 null이면 현재 Trie에 해당 문자열은 없음
                    return false;
                }
            }
            // 문자열의 마지막 단어까지 매핑된 노드가 존재한다고해서 무조건 문자열어 존재하는게 아님
            // busy를 Trie에 저장했으면, bus의 마지막 s단어에 매핑 된 노드는 존재하지만 Trie에 저장된건 아님
            // 그러므로 현재 노드가 단어의 끝인지 아닌지 체크하는 변수로 리턴
            return node.endOfword;
        }
    }
    public static void main(String[] args) {
        // Trie 자료구조 생성
        CodingNojam_Trie trie = new CodingNojam_Trie();

        // Trie에 문자열 저장
        trie.insert("kakao");
        trie.insert("busy");
        trie.insert("card");
        trie.insert("cap");

        // Trie에 저장 된 문자열 확인
        System.out.println(trie.search("card"));		// false
        System.out.println(trie.search("busys"));    // true
        System.out.println(trie.search("kakao"));   // true
        System.out.println(trie.search("cap"));     // true
    }
}
