class Solution {
    public int solution(String s) {
        
        String[] words = {"zero", "one", "two", "three", "four", "five",
                         "six", "seven", "eight", "nine"};
        
        StringBuilder answer = new StringBuilder();
        StringBuilder numCard = new StringBuilder();
        
        for(int i = 0; i < s.length(); i++){
            char c = s.charAt(i);
            
            if(Character.isDigit(c)){
                answer.append(c);
            } else{
                numCard.append(c);
                
                for(int j = 0; j < words.length; j++){
                    if(numCard.toString().equals(words[j])){
                        answer.append(j);
                        numCard.setLength(0);
                        break;
                    }
                }
            }
        }
        return Integer.parseInt(answer.toString());
    }
}