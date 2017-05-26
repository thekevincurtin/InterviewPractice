import java.util.*;
public class LRUCache {

    LinkedHashMap<Integer, Integer> map;
    int capacity;

    public LRUCache(int capacity) {
        map = new LinkedHashMap<Integer,Integer>(capacity, .75f, true){
            protected boolean removeEldestEntry(Map.Entry  eldest) {
                return size() > capacity;
            }
        };
        this.capacity = capacity;
        }

    public int get(int key) {
        return map.get(key) == null ? -1 : map.get(key);
    }

    public void put(int key, int value) {
        if(map.get(key)!=null){
            map.remove(key);
            map.put(key,value);
        }
    }
}

/**
 * Your LRUCache object will be instantiated and called as such:
 * LRUCache obj = new LRUCache(capacity);
 * int param_1 = obj.get(key);
 * obj.put(key,value);
 */