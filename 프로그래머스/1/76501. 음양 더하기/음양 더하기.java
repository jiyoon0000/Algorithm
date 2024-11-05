class Solution {
    public int solution(int[] absolutes, boolean[] signs) {
        int answer = 0;
        int[] answerArray = new int[absolutes.length];
        
        for(int i=0; i< absolutes.length; i++){
            answerArray[i] = absolutes[i] * (signs[i] ? 1 : -1);
        }
        for(int j : answerArray){
            answer += j;
        }
        return answer;
    }
}