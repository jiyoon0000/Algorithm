import java.util.ArrayList;

class Solution {
    public int[] solution(int[] answers) {

        int[] arr1 = {1,2,3,4,5};
        int[] arr2 = {2,1,2,3,2,4,2,5};
        int[] arr3 = {3,3,1,1,2,2,4,4,5,5};
        
        int score1 = 0;
        int score2 = 0;
        int score3 = 0;
        
        for(int i = 0; i < answers.length; i++){
            
            if(answers[i] == arr1[i % arr1.length]){
                score1++;
            }
            
            if(answers[i] == arr2[i % arr2.length]){
                score2++;
            }
            
            if(answers[i] == arr3[i % arr3.length]){
                score3++;
            }
        }
        
        int maxScore = Math.max(score1, Math.max(score2, score3));
        
        ArrayList<Integer> list = new ArrayList<>();
        if(score1 == maxScore){
            list.add(1);
        }
        
        if(score2 == maxScore){
            list.add(2);
        }
        
        if(score3 == maxScore){
            list.add(3);
        }
        
        int[] answer = new int[list.size()];
        for(int i = 0; i < list.size(); i++){
            answer[i] = list.get(i);
        }
        
        return answer;
    }
}