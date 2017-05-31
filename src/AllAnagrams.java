import java.util.*;

/**
 * Created by theke on 5/25/2017.
 */
public class AllAnagrams {
    //https://leetcode.com/problems/find-all-anagrams-in-a-string
    public List<Integer> findAnagrams(String s, String p) {
        HashMap<Character, Integer> anagram = new HashMap<>();
        ArrayDeque<Character> deque = new ArrayDeque<>();
        for (int i = 0; i < p.length(); i++) {
            if (anagram.containsKey(p.charAt(i))) {
                anagram.put(p.charAt(i), anagram.get(p.charAt(i) + 1));
            } else {
                anagram.put(p.charAt(i), 1);
            }
        }
        int j = 0;
        List<Integer> anagramIdxs = new ArrayList<>();
        HashMap<Character, Integer> sMap = new HashMap<>();
        while (j < s.length()) {
            deque.add(s.charAt(j));
            if (sMap.containsKey(s.charAt(j))) {
                sMap.put(s.charAt(j), sMap.get(s.charAt(j)) + 1);
            } else {
                sMap.put(s.charAt(j), 1);
            }
            if (deque.size() > p.length()) {
                char pop = deque.pop();
                if (sMap.get(pop) == 1) {
                    sMap.remove(pop);
                } else {
                    sMap.put(pop, sMap.get(pop) - 1);
                }
            }

            if (sMap.equals(anagram)) {
                anagramIdxs.add(j + 1 - p.length());
            }
            j++;
        }
        return anagramIdxs;
    }
}