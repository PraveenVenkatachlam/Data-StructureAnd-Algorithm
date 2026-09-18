//! 295. Find Median from Data Stream
class MedianFinder {
    private Queue<Integer> maxheap =
        new PriorityQueue<>(Collections.reverseOrder());

    private Queue<Integer> minheap =
        new PriorityQueue<>();

    private boolean even = true;

    public MedianFinder() {
    }

    public void addNum(int num) {
        if (even) {
            minheap.offer(num);
            maxheap.offer(minheap.poll());
        } else {
            maxheap.offer(num);
            minheap.offer(maxheap.poll());
        }

        even = !even;
    }

    public double findMedian() {
        if (even) {
            return (maxheap.peek() + minheap.peek()) / 2.0;
        } else {
            return maxheap.peek();
        }
    }
}


/**
 * Your MedianFinder object will be instantiated and called as such:
 * MedianFinder obj = new MedianFinder();
 * obj.addNum(num);
 * double param_2 = obj.findMedian();
 */