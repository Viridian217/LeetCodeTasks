package easy;


import java.util.List;

public class Task206 {
    public static class ListNode {
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

    public ListNode reverseList(ListNode head) {
        ListNode listNode = null;
        while (head != null) {
            ListNode nextNode = head.next;
            head.next = listNode;
            listNode = head;
            head = nextNode;
        }
        return listNode;
    }
}