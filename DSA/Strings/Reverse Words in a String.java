//! 151 LeetCode
class Solution {
    public String reverseWords(String s) {
        
        StringBuilder sb = new StringBuilder();
        String n =s.trim();
        for(int i=n.length()-1;i>=0;i--){
            sb.append(n.charAt(i));
        }
        //   System.out.println(sb.toString());
        return sb.toString();
    }
}

//!Hareesh Apporach 
    
class Solution {
    public String reverseWords(String s) {
        
        StringBuilder result = new StringBuilder();
        int n =s.length(), i=0;
        while(i<n){
            //Search the First non space Character
            while(i<n && s.charAt(i)==' ') i++;
            if(i>=n) break;
            int j =i+1;
            while(j<n && s.charAt(j)!= ' ') j++;

            String sub = s.substring(i,j);

            if(result.length() == 0){
                result.append(sub);
            }else{
                result.insert(0,sub + " ");
            }
            i = j+1;

        }
       return result.toString();
    }
}