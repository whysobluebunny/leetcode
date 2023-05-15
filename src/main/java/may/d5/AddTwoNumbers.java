package may.d5;

import java.util.ArrayList;
import java.util.List;

public class AddTwoNumbers {
    public class ListNode {
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

    public static void main(String[] args) {
        // da v o4ko rukami kleit v leetcode srazu liu
    }

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode head = new ListNode();
        ListNode res = head;
        int sum = 0;
        while (l1 != null || l2 != null) {
            res.next = new ListNode();
            res = res.next;
            if (l1 != null) {
                sum += l1.val;
                l1 = l1.next;
            }
            if (l2 != null) {
                sum += l2.val;
                l2 = l2.next;
            }
            res.val += sum % 10;
            sum /= 10;
        }
        if(sum == 1)
            res.next = new ListNode(1);
        return head.next;
    }
}
