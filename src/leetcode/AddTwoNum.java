package leetcode;

class ListNode {
    int val;
    ListNode next;

    public ListNode(int var) {
        this.val = var;
    }

    public ListNode(int var, ListNode next) {
        this.val = var;
        this.next = next;
    }
}

public class AddTwoNum {

    public static void main(String[] args) {

        ListNode l1 = new ListNode(8);
        ListNode l2 = new ListNode(8, l1);
        ListNode l3 = new ListNode(8, l2);

        ListNode l4 = new ListNode(2);
        ListNode l5 = new ListNode(2, l4);
        ListNode l6 = new ListNode(2, l5);

        ListNode result = addTwoNum(l3, l6);
        while (result != null) {
            System.out.print(result.val);
            result = result.next;
        }

    }

    public static ListNode addTwoNum(ListNode l1, ListNode l2) {

        ListNode head = null;
        ListNode tail = null;
        int carry = 0;

        while (l1 != null || l2 != null) {
            int val1 = (l1 != null ? l1.val : 0);
            int val2 = (l2 != null ? l2.val : 0);

            int sum = val1 + val2 + carry;
            if (head == null) {
                tail = new ListNode(sum % 10);
                head = tail;
            } else {
                tail.next = new ListNode(sum % 10);
                tail = tail.next;
            }

            if (l1 != null) {
                l1 = l1.next;
            }

            if (l2 != null) {
                l2 = l2.next;
            }

            carry = sum / 10;
        }

        if (carry != 0) {
            tail.next = new ListNode(carry);
        }

        return head;


    }

}
