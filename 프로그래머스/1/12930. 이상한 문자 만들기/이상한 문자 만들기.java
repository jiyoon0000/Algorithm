class Solution {
    public String solution(String s) {
        String[] words = s.split(" ", -1);
        StringBuilder answer = new StringBuilder();
        
        for(int i=0; i<words.length; i++){
            String word = words[i];
            StringBuilder trans = new StringBuilder();
                        
            for(int j=0; j<word.length(); j++){
                char c = word.charAt(j);
                if(j%2 == 0){
                    trans.append(Character.toUpperCase(c));
                }else{
                    trans.append(Character.toLowerCase(c));
                }
            }
            
            answer.append(trans);
            
            if(i != words.length-1){
                answer.append(" ");
            }
        }
        return answer.toString();
    }
}