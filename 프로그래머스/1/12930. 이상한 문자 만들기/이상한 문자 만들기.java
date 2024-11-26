class Solution {
    public String solution(String s) {
        StringBuilder answer = new StringBuilder();
        int start = 0;
        
        for(int i=0; i<=s.length(); i++){
            if(i == s.length() || s.charAt(i) == ' '){
                for(int j = start; j < i; j ++){
                    char c = s.charAt(j);
                    if((j-start) % 2 == 0){
                        answer.append(Character.toUpperCase(c));
                    }else {
                        answer.append(Character.toLowerCase(c));
                    }
                }
                
                if(i != s.length()){
                    answer.append(" ");
                }
                
                start = i +1;
            }
        }
        return answer.toString();
    }
}