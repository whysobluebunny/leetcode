package may.d15;

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
    // 1721. Swapping Nodes in a Linked List
    public static void main(String[] args) {
    }

    public static ListNode swapNodes(ListNode head, int k) {
        ListNode newNode, a = null, b = null;
        int n = 0; // size of list
        for (newNode = head; newNode != null; newNode = newNode.next, n++) ; // eval size of list
        newNode = head;
        for (int i = 1; i <= n; i++, newNode = newNode.next) { // remember items on k and n-k+1 places
            if (i == k)
                a = newNode;
            if (i == n - k + 1)
                b = newNode;
        }
        int temp = a.val; // swap values
        a.val = b.val;
        b.val = temp;

        return head;
    }

    // решение, которое лучше по времени - только один раз проходимся по списку
    // при нахождении элемента n-k+1 (k-й элемент с конца) в качестве счётчика используется лист,
    // с помощью которого мы нашли k-й элемент (в нём нам как раз осталось пройти k-n+1 элементов)
//    public ListNode swapNodes(ListNode head, int k) {
//        ListNode itr=head;
//        int count=1;
//        while(count++<k){
//            itr=itr.next;
//        }
//        ListNode first=itr;
//        ListNode second=head;
//
//        while(itr.next!=null){
//            itr=itr.next;
//            second=second.next;
//        }
//
//        int temp=first.val;
//        first.val=second.val;
//        second.val=temp;
//
//        return head;
//    }
}
