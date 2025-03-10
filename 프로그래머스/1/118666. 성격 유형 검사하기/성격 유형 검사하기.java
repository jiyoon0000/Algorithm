class Solution {
    public String solution(String[] survey, int[] choices) {
        int[] scores = new int[128];
        
        for (int i = 0; i < survey.length; i++) {
            String sur = survey[i];
            int choice = choices[i];
            
            if (choice < 4) {
                scores[sur.charAt(0)] += (4 - choice);
            } else if (choice > 4) {
                scores[sur.charAt(1)] += (choice - 4);
            }
        }
        
        StringBuilder answer = new StringBuilder();
        answer.append(type(scores['R'], scores['T'], 'R', 'T'));
        answer.append(type(scores['C'], scores['F'], 'C', 'F'));
        answer.append(type(scores['J'], scores['M'], 'J', 'M'));
        answer.append(type(scores['A'], scores['N'], 'A', 'N'));
        
        return answer.toString();
    }
    
    private char type(int score1, int score2, char type1, char type2) {
        if (score1 >= score2){
            return type1;
        } else {
            return type2;
        }
    }   
}