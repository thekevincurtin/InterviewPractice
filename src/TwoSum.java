import java.util.HashMap;

public class TwoSum {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<Integer,Integer>();
        for(int i: nums){
            if(map.get(i) != null){
                return new int[]{i, map.get(i)};
            }
            else{
                map.put(target - nums[i], i);
            }
        }
        return new int[]{0,0};
    }
}