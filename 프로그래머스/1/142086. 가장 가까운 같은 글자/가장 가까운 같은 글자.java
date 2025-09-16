import java.util.Map;
import java.util.HashMap;

class Solution {
    public int[] solution(String s) {
        int n = s.length();
        int[] answer = new int[n];
        
        Map<Character, Integer> recent = new HashMap<>();
        
        for (int i = 0; i < n; i++) {
            char ch = s.charAt(i);
            
            if (recent.containsKey(ch)) {
                answer[i] = i - recent.get(ch);
            } else {
                answer[i] = -1;
            }
            
            recent.put(ch, i);
        }
        return answer;
    }
}