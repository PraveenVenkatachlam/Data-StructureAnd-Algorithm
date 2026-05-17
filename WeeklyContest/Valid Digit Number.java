class Solution {
    public boolean validDigit(int n, int x) {

        String str=String.valueOf(n);
        if(str.charAt(0)-'0'==x){
            return false;
        }
        List<Integer> list=new ArrayList<>(); 
        for(char c:str.toCharArray()){
            
            list.add(c-'0');
        }
        
       //  for (int i = 0; i < n; i++) {
       //      digit = n % 10;
       
       //      list.add(n);
       //      if (list.contains(x)) {
       //          return true;
       //      }
       //  }
        // return false;
        return list.contains(x);

    }
}