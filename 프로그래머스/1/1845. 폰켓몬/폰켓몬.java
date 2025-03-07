class Solution {
    public int solution(int[] nums) {
        int count = nums.length / 2;
        boolean[] exist = new boolean[200001];
        int mon = 0;
        
        for (int num : nums) {
            if (!exist[num]){
                exist[num] = true;
                mon++;
            }
        }
        
        return Math.min(mon, count);
    }
}