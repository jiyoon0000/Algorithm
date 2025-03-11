import java.util.HashMap;
import java.util.Map;

class Solution {
    public String solution(String[] survey, int[] choices) {
        
        Map<Character, Integer> scores = new HashMap<>();
        
        char[][] types = {
            {'R','T'},
            {'C','F'},
            {'J','M'},
            {'A','N'}
        };
        
        for (char[] type : types) {
            scores.put(type[0], 0);
            scores.put(type[1], 0);
        }
        
        for (int i = 0; i < survey.length; i++) {
            String sur = survey[i];
            int choice = choices[i];
            
            int score = Math.abs(choice - 4);
            
            if (choice < 4) {
                char disagree = sur.charAt(0);
                scores.put(disagree, scores.get(disagree) + score);
            } else if (choice > 4) {
                char agree = sur.charAt(1);
                scores.put(agree, scores.get(agree) + score);
            }
        }
        
        StringBuilder answer = new StringBuilder();
        for (char[] type : types) {
            answer.append(scores.get(type[0]) >= scores.get(type[1]) ? type[0] : type[1]);
        }
        
        return answer.toString();
    }
}