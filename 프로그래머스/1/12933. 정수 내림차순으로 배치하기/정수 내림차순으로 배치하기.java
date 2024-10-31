import java.util.*;

class Solution {
    public long solution(long n) {
        long answer = 0;
        List<Long> answerList = new ArrayList<>();
        
        while(n>0){
            answerList.add(n%10);
            n /= 10;
        }
        
        answerList.sort(Collections.reverseOrder());
        
        for(long Answer : answerList){
            answer = answer * 10 + Answer;
        }
        return answer;
    }
}