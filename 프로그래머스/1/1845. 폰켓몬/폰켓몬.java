import java.util.HashSet;

class Solution {
    public int solution(int[] nums) {
        int n = nums.length;
        HashSet<Integer> mon = new HashSet<>();
        
        for (int num : nums) {
            mon.add(num);
        }
        
        int count = n / 2;
        
        return Math.min(mon.size(), count);
    }
}