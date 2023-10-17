package easy.tasks_201_to_300;


public class Task206 {
    public static class ListNode {
        public int val;
        public ListNode next;

        public ListNode() {
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