class Solution {
public int[] countBits(int n) {
int res[] = new int[n + 1];
for (int i = 1; i <= n; i++) {
if (i % 2 != 0) { //odd
res[i] = res[i / 2] + 1;
} else {//even
res[i] = res[i / 2];
}
}
return res;
}
}