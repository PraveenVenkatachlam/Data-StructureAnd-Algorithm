class Solution {
public int findDuplicate(int[] nums) {
int answer=0;
int n=nums.length;
for(int i=0;i<n;i++){
answer=answer^nums[i];
}
System.out.println(answer);
for(int i=0;i<n;i++){
answer=answer^i;
}
return answer;
}
}