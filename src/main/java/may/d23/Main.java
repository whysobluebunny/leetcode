package may.d23;

import java.util.*;

// slow straight - forward
//class KthLargest {
//    ArrayList<Integer> stream = new ArrayList<>();
//    int k;
//
//    public KthLargest(int k, int[] nums) {
//        this.k = k;
//        for (int num : nums)
//            stream.add(num);
//    }
//
//    public int add(int val) {
//        stream.add(val);
//        Collections.sort(stream, Collections.reverseOrder());
//        return stream.get(k-1);
//    }
//}

// 703. Kth Largest Element in a Stream
// Priority queue keeps elements sorted
class KthLargest {
    PriorityQueue<Integer> stream = new PriorityQueue<>();
    int k;

    public KthLargest(int k, int[] nums) {
        this.k = k;
        for (int num : nums)
            add(num);
    }

    public int add(int val) {
        stream.offer(val);
        if (stream.size() > k) stream.poll();
        return stream.peek();
    }
}

public class Main {
    public static void main(String[] args) {

    }
}
