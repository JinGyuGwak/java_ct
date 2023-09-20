package boj_gold;

public class Boj5052_G4_Trie {
    private TrieNode root;

    public Boj5052_G4_Trie() {
        root = new TrieNode();
    }

    // TrieNode 정의
    private class TrieNode {
        public TrieNode[] children;
        public boolean isEndOfWord;

        public TrieNode() {
            children = new TrieNode[26]; // 영어 알파벳 대상
            isEndOfWord = false;
        }
    }

    // 문자열 삽입
    public void insert(String word) {
        TrieNode node = root;
        for (char c : word.toCharArray()) {
            if (node.children[c - 'a'] == null) {
                node.children[c - 'a'] = new TrieNode();
            }
            node = node.children[c - 'a'];
        }
        node.isEndOfWord = true;
    }

    // 문자열 검색
    public boolean search(String word) {
        TrieNode node = root;
        for (char c : word.toCharArray()) {
            if (node.children[c - 'a'] == null) {
                return false;
            }
            node = node.children[c - 'a'];
        }
        return node.isEndOfWord;
    }

    // 주어진 접두사로 시작하는 단어가 있는지 검색
    public boolean startsWith(String prefix) {
        TrieNode node = root;
        for (char c : prefix.toCharArray()) {
            if (node.children[c - 'a'] == null) {
                return false;
            }
            node = node.children[c - 'a'];
        }
        return true;
    }


    public static void main(String[] args) {
        Boj5052_G4_Trie trie = new Boj5052_G4_Trie();
        trie.insert("apple");
        System.out.println(trie.search("apple"));   // true
        System.out.println(trie.search("app"));     // false
        System.out.println(trie.startsWith("app")); // true
        trie.insert("app");
        System.out.println(trie.search("app"));     // true
    }
}