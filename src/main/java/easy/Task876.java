package easy;



public class Task876 {
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

    public ListNode middleNode(ListNode head) {
        int i = 0;
        int val = 0;
        ListNode newHead = head;
        while (newHead!=null){
            newHead = newHead.next;
            i++;
        }
        if (i % 2 != 0){
            val = (int) Math.floor(i/2);

        }
        else {
            val = i/2;
        }

        ListNode firstNode = new ListNode();
        ListNode listNode = firstNode;
        int iter = 0;
        while (iter != i){
            if (iter >= val && iter < i - 1){
                listNode.val = head.val;
                listNode.next = new ListNode();
                listNode = listNode.next;
            } else if (iter == i - 1) {
                listNode.val = head.val;
            }
            head = head.next;
            iter++;
        }
        return firstNode;
    }
}
