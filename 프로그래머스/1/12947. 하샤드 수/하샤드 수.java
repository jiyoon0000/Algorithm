class Solution {
    public boolean solution(int x) {
        boolean answer = true;
        int xSum = 0;
        int realX = x;
        
        while(x>0){
            xSum += (x % 10);
            x /= 10;
        }
        
        if((realX % xSum) != 0){
            answer = false;
        }
        return answer;
    }
}