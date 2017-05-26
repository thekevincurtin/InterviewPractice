import java.util.*;
public class DequePractice {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Deque<Integer> deque = new ArrayDeque<Integer>();
        HashSet<Integer> set = new HashSet<Integer>();

        int n = in.nextInt();
        int m = in.nextInt();
        int maxUniques = 0;

        for (int i = 0; i < n; i++) {
            int num = in.nextInt();
            deque.add(num);
            set.add(num);
            if(deque.size() == m){
                if(set.size() > maxUniques){
                    maxUniques = set.size();
                }
                int remove = deque.pop();
                if (!deque.contains(remove)) {
                    set.remove(remove);
                }
            }
        }
        System.out.println(maxUniques);
    }
}
