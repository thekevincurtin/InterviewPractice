import java.util.List;

/**
 * Created by kcurti205 on 5/26/2017.
 */
public class Main {
    public static void main(String[] args){

        //ReverseLinkedList();
        //ExecutePhoneNumbers();
    }
    public static void ReverseLinkedList(){
        ReverseLinkedList.ListNode head = new ReverseLinkedList.ListNode(1);
        ReverseLinkedList.ListNode next = new ReverseLinkedList.ListNode(2);
        ReverseLinkedList.ListNode last = new ReverseLinkedList.ListNode(3);
        head.next = next;
        next.next = last;
        ReverseLinkedList rll = new ReverseLinkedList();
        head = rll.reverseList(head);
        while(head!=null){
            System.out.println("hi " + head.val);
            head = head.next;
        }
    }
    public static void ExecutePhoneNumbers(){
        List<String> result = new PhoneNumberLetters().letterCombinations("123");
        for(String s:result){
            System.out.println("string: " + s);
        }
    }
    public static void ExecuteAnagrams(){
        System.out.println(new AllAnagrams().findAnagrams("hehehe", "he"));
        System.out.println("expected 0 1 2 3 4");
        System.out.println(new AllAnagrams().findAnagrams("cbaebabacd", "abc"));
        System.out.println("expected 0 6");
        System.out.println(new AllAnagrams().findAnagrams("abab", "ab"));
        System.out.println("expected 0 1 2");
    }
}
