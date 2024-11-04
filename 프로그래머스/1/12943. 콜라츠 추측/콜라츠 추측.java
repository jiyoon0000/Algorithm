class Solution {
    public int solution(int num) {
        int answer = 0;
        long longNum = Long.valueOf(num);
        
        while(true){
            if(longNum == 1 || answer >= 500)
                break;
                answer++;
            
            if((longNum%2) == 0){
                longNum /= 2;
            }else if((longNum%2) != 0){
                longNum = longNum * 3 + 1;
            }
        }
        if(longNum == 1){
            return answer;
        }else{
            return -1;
        }
    }
}