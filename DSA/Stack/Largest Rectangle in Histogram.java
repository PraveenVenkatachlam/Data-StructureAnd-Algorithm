//! 84. Largest Rectangle in Histogram
// Asked in Apple, meta etc


class Solution {
    public int largestRectangleArea(int[] heights) {
        int n = heights.length;
        int[] pse = getpse(heights, n);
        int[] nse = getnse(heights, n);
        // nse(height);
        int maxheight = 0;
        for (int i = 0; i < n; i++) {
            int width = nse[i] - pse[i] - 1;
            int area = heights[i] * width;
            maxheight = Math.max(maxheight, area);
        }
        return maxheight;

    }

    // int[] pse= getpse(heigth,n);
    private int[] getpse(int[] heights, int n) {
        Stack<Integer> stack = new Stack<>();
        int[] pse = new int[n];
        for (int i = 0; i < n; i++) {
            while (!stack.isEmpty() && heights[stack.peek()] >= heights[i])
                stack.pop();
            pse[i] = stack.isEmpty() ? -1 : stack.peek();
            stack.push(i);

        }
        return pse;
    }

    private int[] getnse(int[] heights, int n) {
        Stack<Integer> stack = new Stack<>();
        int[] gse = new int[n];
        for (int i = n - 1; i >= 0; i--) {
            while (!stack.isEmpty() && heights[stack.peek()] >= heights[i])
                stack.pop();
            gse[i] = stack.isEmpty() ? n : stack.peek();

            stack.push(i);
        }
        return gse;
    }
}