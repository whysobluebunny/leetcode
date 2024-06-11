package may.d16;

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

    // simple approach: traverse linked list and remember elements on odd and even positions,
    // when second element in pair reached - swap them
    public static ListNode swapPairs(ListNode head) {
        ListNode newNode = head, a = null, b = null;
        for (int i = 1; newNode != null; i++, newNode = newNode.next) {
            if (i % 2 != 0)
                a = newNode;
            else {
                b = newNode;
                swap(a, b);
            }
        }
        return head;
    }

    public static void swap(ListNode a, ListNode b) {
        int temp = a.val; // swap values
        a.val = b.val;
        b.val = temp;
    }
}
