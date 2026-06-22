 //! 739 LeetCode
 class Solution {
    public int[] dailyTemperatures(int[] temperatures) {

        int len = temperatures.length;
        int[] rez = new int[len];

        int[] stack = new int[len];
        int top = 0;

        for (int i = 0; i < len; i++) {
            int temp = temperatures[i];

            while (top > 0 && temp > temperatures[stack[top - 1]]) {

                int idx = stack[--top];
                rez[idx] = i - idx;
            }

            stack[top++] = i;
        }

        return rez;
    }
}

//? Hareesh Solution 

class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        Stack<Integer> stack = new Stack<>();
        int n = temperatures.length;
        int res[] = new int[n];

        for (int i = n-1 ;i >= 0; i--) {
            while (!stack.isEmpty() && temperatures[i] >= temperatures[stack.peek()]) {
                stack.pop();
            }
            if(!stack.isEmpty()) {
                res[i] = stack.peek() - i;
            }
            stack.push(i);
        }
        return res;
    }
}