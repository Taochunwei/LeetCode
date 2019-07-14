package leetcode211;

import java.util.TreeMap;

/**
 * @author Taochunwei
 * @date 2019/7/13 - 14:37
 */
public class WordDictionary {
    /** Initialize your data structure here. */
    private class Node{
        public boolean isword;
        public TreeMap<Character,Node> next;

        public Node(boolean isword){
            this.isword=isword;
            next=new TreeMap<>();
        }
        public Node(){
            this(false);
        }
    }
    private Node root;
    public WordDictionary() {
        root=new Node();
    }

    /** Adds a word into the data structure. */
    public void addWord(String word) {
        Node cur=root;
        for (int i = 0; i <word.length() ; i++) {
            char c=word.charAt(i);
            if(cur.next.get(c)==null)
                cur.next.put(c,new Node());
            cur=cur.next.get(c);
        }
        if(cur.isword==false) {
            cur.isword = true;
        }
    }

    /** Returns if the word is in the data structure. A word could contain the dot character '.' to represent any one letter. */
    public boolean search(String word) {
        return match(root,word,0);
    }
    private boolean match(Node node,String word,int index){
        if(index==word.length())
            return node.isword;

        char c=word.charAt(index);
        if(c!='.'){
            if(node.next.get(c)==null)
                return false;
            return match(node.next.get(c),word,index+1);
        }
        else{
            for(char nextChar:node.next.keySet())
                if(match(node.next.get(nextChar),word,index+1))
                    return true;
            return false;
        }

    }


}
