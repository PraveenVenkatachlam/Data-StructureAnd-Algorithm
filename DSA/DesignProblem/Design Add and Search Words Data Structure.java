//! 211. Design Add and Search Words Data Structure
class WordDictionary {
    private Node root;

    public WordDictionary() {
        root = new Node();
    }

    public void addWord(String word) {
        Node node = root;

        for (int i = 0; i < word.length(); i++) {
            char ch = word.charAt(i);

            if (!node.containsChar(ch)) {
                node.put(ch, new Node());
            }

            node = node.get(ch);
        }

        node.setEnd();
    }

    public boolean search(String word) {
        return dfs(word, 0, root);
    }

    private boolean dfs(String word, int index, Node node) {

        if (index == word.length()) {
            return node.isEnd();
        }

        char ch = word.charAt(index);

        if (ch == '.') {

            for (int i = 0; i < 26; i++) {
                if (node.list[i] != null &&
                    dfs(word, index + 1, node.list[i])) {
                    return true;
                }
            }

            return false;

        } else {

            if (!node.containsChar(ch)) {
                return false;
            }

            node = node.get(ch);

            return dfs(word, index + 1, node);
        }
    }
}

// class WordDictionary {
//      private Node root;

//     public WordDictionary() {
//         root=new Node();
//     }
//         public void insert(String word) {
//         Node node=root; //this is manipulating the global node to this function

//         for(int i=0;i<word.length();i++){ //these are the two red pointer in image

//             if(!node.containsChar(word.charAt(i))){
//                 node.put(word.charAt(i),new Node());
//             }

//             node=node.get(word.charAt(i));
//         }

//         node.setEnd();
//     }
    
//     public void addWord(String word) {
        
//     }
    
//     public boolean search(String word) {
//         return dfs(word,0,root);
//     }
//     private boolean dfs(String word,int index,Node node){
//         if(index==word.length()) return node.isEnd;
//         Char ch=word.charAt(index);
//         if(ch=='.'){
//             for(int i=0;i<26;i++){
//                 if(node.links[i]!=null && dfs(word,index+1,node.links[i])){
//                     return true;
//                 }
//             }
//             return false;
//         }else{
//             if(!node.containsChar(ch)) return false;
//             node=node.get(ch);
//             return dfs(word,index+1, node.get(ch));
//         }
//     }
// }


class Node{
    Node list[]=new Node[26];
    boolean flag;

    Node(){

    }

    boolean containsChar(char ch){
        return (list[ch-'a']!=null);
    }

    Node get(char ch){
        return list[ch-'a'];
    }

    void put(char ch,Node root){
        list[ch-'a']=root;
    }

    boolean isEnd(){
        return flag;
    }

    void setEnd(){
        flag=true;
    }

}

class Trie {
    Node root;

    public Trie() {
        root=new Node();
    }
    
    // public void insert(String word) {
    //     Node node=root; //this is manipulating the global node to this function

    //     for(int i=0;i<word.length();i++){ //these are the two red pointer in image

    //         if(!node.containsChar(word.charAt(i))){
    //             node.put(word.charAt(i),new Node());
    //         }

    //         node=node.get(word.charAt(i));
    //     }

    //     node.setEnd();
    // }
    
    public boolean search(String word) {
        Node node=root;

        for(int i=0;i<word.length();i++){

            if(!node.containsChar(word.charAt(i))){
                return false;
            }

            node=node.get(word.charAt(i));
        }

        return node.isEnd();
    }
    
    public boolean startsWith(String prefix) {
        Node node=root;

        for(int i=0;i<prefix.length();i++){

            if(!node.containsChar(prefix.charAt(i))){
                return false;
            }

            node=node.get(prefix.charAt(i));
        }

        return true;
    }

}
/**
 * Your WordDictionary object will be instantiated and called as such:
 * WordDictionary obj = new WordDictionary();
 * obj.addWord(word);
 * boolean param_2 = obj.search(word);
 */