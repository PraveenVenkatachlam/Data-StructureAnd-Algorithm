Weekly Contest 502


class Solution {
    public boolean isAdjacentDiffAtMostTwo(String s) {

        char [] ch=s.toCharArray();
        int leng=ch.length;
        for(int i=0;i<leng;i++){
             if(i>i+1 && leng(1+2) ){
                 return true;
             }else{
                return false;
             }
        }
        // return;
    }
}

//! Solution 
class Solution {
    public boolean isAdjacentDiffAtMostTwo(String s) {

        char[] ch = s.toCharArray();
        int leng = ch.length;

        for (int i = 0; i < leng - 1; i++) {

            int diff = Math.abs(ch[i] - ch[i + 1]);

            if (diff > 2) {
                return false;
            }
        }

        return true;
    }
}