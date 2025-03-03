class Solution {
    public int solution(String[] babbling) {
        int answer = 0;
        
        String[] words = {"aya", "ye", "woo", "ma"};

        for(String s : babbling){
            if(speak(s,"",words)){
                answer++;
            }
        }
        return answer;
    }
        
        private boolean speak(String a, String last, String[] words){
            
            if(a.length() == 0){
                return true;
            }
            
            for(String word : words){
                if(word.equals(last)){
                    continue;
                }
                if(a.startsWith(word)){
                    if(speak(a.substring(word.length()), word, words)){
                        return true;
                    }
                }
            }
            return false;
        }
}