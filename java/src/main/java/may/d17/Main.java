package may.d17;

import java.util.ArrayList;
import java.util.Arrays;

class ListNode {
    int val;
    ListNode next;

    ListNode() {
    }

    ListNode(int val) {
        this.val = val;
    }

    ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }
}

public class Main {
    public static void main(String[] args) {

    }
    // straight forward solution
    public static int pairSum(ListNode head) {
        int max = 0;
        ArrayList<Integer> list = new ArrayList<>();
        for(ListNode temp = head; temp != null; temp = temp.next)
            list.add(temp.val);
        for (int i = 0, j = list.size() - 1; i <= j; i++, j--) {
            max = Math.max(max, list.get(i) + list.get(j));
        }
        return max;
    }
}
