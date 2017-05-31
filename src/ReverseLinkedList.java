/**
 * Created by kcurti205 on 5/31/2017.
 */
public class ReverseLinkedList {
    public ListNode reverseList(ListNode head) {
        ListNode curr = head;
        ListNode prev = null, next = null;
        while(curr != null){
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        head = prev;
        return head;
    }
    static class ListNode {
        int val;
        ListNode next;
        ListNode(int x){val = x;}
    }
}
