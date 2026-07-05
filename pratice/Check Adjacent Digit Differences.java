class Solution {
    public boolean isAdjacentDiffAtMostTwo(String s) {

        char [] ch=s.toCharArray();
        // int leng=ch.length;
        for(int i=0;i<ch.length-1;i++){
            if(Math.abs(ch[i] - ch[i+1])>2){
             // if(s[i][-i+1]>i ){
                 return false;
             }
        }
          return true;
    }
}