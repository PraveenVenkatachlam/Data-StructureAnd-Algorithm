class Solution {
public int hammingWeight(int n) {
int count = 0;
while (n != 0) {
count += (n & 1);// AND Operator
n >>= 1; //Right Sift
}
return count;
}
}
O(n)
TC:O(1)