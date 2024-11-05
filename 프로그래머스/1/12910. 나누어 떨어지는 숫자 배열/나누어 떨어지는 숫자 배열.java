import java.util.*;
class Solution {
    public int[] solution(int[] arr, int divisor) {
        ArrayList<Integer> answerList = new ArrayList<>();
        
        for(int i : arr){
            if(i % divisor == 0){
                answerList.add(i);
            }
        }
            
            if(answerList.isEmpty()){
                return new int[] {-1};
            }else{
                Collections.sort(answerList);

                int[] answer = new int[answerList.size()];
                
                for(int i=0; i<answerList.size();i++){
                    answer[i] = answerList.get(i);
                }
                return answer;
            }
    }
}