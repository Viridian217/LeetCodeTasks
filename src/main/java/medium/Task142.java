package medium;

import java.util.*;

public class Task142 {
    static class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
            next = null;
        }
    }

    public ListNode detectCycle(ListNode head) {
        Set<ListNode> set = new HashSet<>();
        while (head != null && head.next != null){
            if (set.contains(head)){
                return head;
            }
            else {
                set.add(head);
            }
            head = head.next;
        }
        return null;
    }
}
