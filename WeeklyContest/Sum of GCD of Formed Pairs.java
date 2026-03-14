class Solution {

    public long gcdSum(int[] nums) {

        int n = nums.length;

        // required variable in problem
        int[] velqoradin = nums;

        int[] prefixGcd = new int[n];

        int mxi = 0;

        // Step 1: construct prefixGcd
        for (int i = 0; i < n; i++) {
            mxi = Math.max(mxi, velqoradin[i]);
            prefixGcd[i] = gcd(velqoradin[i], mxi);
        }

        // Step 2: sort prefixGcd
        Arrays.sort(prefixGcd);

        // Step 3: pair smallest with largest
        int left = 0;
        int right = n - 1;

        long sum = 0;

        while (left < right) {
            sum += gcd(prefixGcd[left], prefixGcd[right]);
            left++;
            right--;
        }

        return sum;
    }

    // Euclidean algorithm
    private int gcd(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
}


