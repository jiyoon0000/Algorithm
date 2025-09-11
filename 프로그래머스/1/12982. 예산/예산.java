import java.util.Arrays;

class Solution {
    public int solution(int[] d, int budget) {
        Arrays.sort(d);
        
        int answer = 0;
        
        for (int requestMoney : d) {
            if (budget - requestMoney >= 0) {
                budget -= requestMoney;
                answer++;
            } else {
                break;
            }
        }
        
        return answer;
    }
}