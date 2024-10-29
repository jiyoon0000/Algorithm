import java.util.*;

class Solution {
    public int[] solution(long n) {
        Queue<Integer> intQueue = new LinkedList<>();
        
        while(n>0){
            intQueue.add((int)(n%10));
            n /= 10;
        }

        int[] answer = new int[intQueue.size()];

        for(int i=0; i<answer.length; i++){
            answer[i] = intQueue.poll();
        }
        return answer;
    }
}