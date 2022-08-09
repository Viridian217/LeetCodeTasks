package medium;

import java.util.HashSet;
import java.util.Hashtable;
import java.util.Set;

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
        Set set = new HashSet<>();
        while (head.next!=null){
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
