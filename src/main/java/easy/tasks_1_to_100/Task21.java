package easy.tasks_1_to_100;

public class Task21 {
    public static class ListNode {
        public int val;
        public ListNode next;

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

    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode firstNode = new ListNode();
        ListNode currentNode = firstNode;
        if (list1 == null) {
            return list2;
        }
        if (list2 == null){
            return list1;
        }
        while (list1 != null && list2 != null){
            if (list1.val >= list2.val){
                currentNode.next = list2;
                list2 = list2.next;
            }
            else {
                currentNode.next = list1;
                list1 = list1.next;
            }
            currentNode = currentNode.next;

        }
        while (list1 != null){
            currentNode.next = list1;
            currentNode = currentNode.next;
            list1 = list1.next;
        }
        while (list2 != null){
            currentNode.next = list2;
            currentNode = currentNode.next;
            list2 = list2.next;
        }
        return firstNode.next;
    }
}
