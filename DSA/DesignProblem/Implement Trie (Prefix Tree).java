// class Node{
//     Node list[]=new Node[26];
//     boolean flag;
//     Node(){

//     }
//     boolean containsChar(char ch) {
//     return list[ch - 'a'] != null;
// }

//     // boolean containsChar(){
//     //     return (list[ch-'a']!=null);
//     // }
//     Node get(char ch){
//      return list[ch-'a'];
//     }
//     void put(char ch,Node root){
//     list[ch-'a']=root;
//     }
//     boolean isEnd(){
//         return flag;
//     }
//     void setEnd(){
//         flag=true;
//     }

// }
// class Trie {
//    Node root;
//     public Trie() {
//         root=new Node();
//     }
    
//     public void insert(String word) {
//         Node node= root; //this is manupalating the global node to this function
//         for(int i=0;i<word.length();i++){ // these are the two red pointern in image
//         if(!node.containsChar(word.charAt(i))){
//        node.put(word.charAt(i),new Node());
//         }
//         node=node.get(word.charAt(i));

//         }
//         node.setEnd();
//     }
    
//     public boolean search(String word) {
//         Node node=root;
//         for(int i=0;i<word.length();i++){
//             if(!node.containsChar(word.charAt(i))){
//                 return false;
//             }
//             node=node.get(word.charAt(i));
//         }
//         return node.isEnd();
//     }
    
//     public boolean startsWith(String prefix) {
//          Node node=root;
//         for(int i=0;i<word.length();i++){
//             if(!node.containsChar(word.charAt(i))){
//                 return false;
//             }
//             node=node.get(word.charAt(i));
//         }
//         return node.isEnd();
//     }
// //  return true;
// }

// /**
//  * Your Trie object will be instantiated and called as such:
//  * Trie obj = new Trie();
//  * obj.insert(word);
//  * boolean param_2 = obj.search(word);
//  * boolean param_3 = obj.startsWith(prefix);
//  */
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
    
    public void insert(String word) {
        Node node=root; //this is manipulating the global node to this function

        for(int i=0;i<word.length();i++){ //these are the two red pointer in image

            if(!node.containsChar(word.charAt(i))){
                node.put(word.charAt(i),new Node());
            }

            node=node.get(word.charAt(i));
        }

        node.setEnd();
    }
    
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