import java.util.HashMap;
import java.util.Map;

class Solution {
    public String solution(String[] participant, String[] completion) {
        Map<String, Integer> count = new HashMap<>();
        
        for (String p : participant) {
            if (count.containsKey(p)) {
                count.put(p, count.get(p) + 1);
            } else {
                count.put(p, 1);
            }
        }
        
        for (String c : completion) {
            count.put(c, count.get(c) - 1);
        }
        
        for (String key : count.keySet()) {
            if (count.get(key) != 0) {
                return key;
            }
        }
        
        return "";
    }
}