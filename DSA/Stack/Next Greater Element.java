 //! GFG Amazon, Meta, oracle , uber
//  https://www.geeksforgeeks.org/problems/next-larger-element-1587115620/1
class Solution {
    public ArrayList<Integer> nextLargerElement(int[] arr) {
        // code here
     
        Stack<Integer> stack=new Stack<>();
      ArrayList <Integer> res= new ArrayList<>(Collections.nCopies(arr.length, -1));
        // ArrayList <Integer> res=new ArrayList<>(Collection.nCopies(arr.length,-1));
        for(int i=arr.length-1;i>=0;i--){
        //     stack.push(n);
        //     if(n.contains()>n+1){
        //     stack.pop(n);
        // } 
        while(!stack.isEmpty() && stack.peek()<=arr[i]){
            stack.pop();
        }
        if(!stack.isEmpty()){
            res.set(i,stack.peek());
        }
        stack.push(arr[i]);
        }
        return res;
     
    }
}