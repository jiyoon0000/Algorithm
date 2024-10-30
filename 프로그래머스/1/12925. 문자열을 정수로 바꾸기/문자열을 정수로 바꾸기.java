class Solution {
    public int solution(String s) {
        int answer = 0;
        int sign = 1;
        int startText = 0;
        
        if(s.charAt(0) == '-'){
            sign = -1;
            startText = 1;
        } else if(s.charAt(0) == '+'){
            startText = 1;
        }
        
        for(int i = startText; i<s.length(); i++){
            answer = answer * 10 + (s.charAt(i) - '0');
        }
        return answer * sign;
    }
}