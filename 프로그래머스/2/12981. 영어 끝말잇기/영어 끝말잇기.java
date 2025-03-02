import java.util.HashSet;

class Solution {
    public int[] solution(int n, String[] words) {
        
        HashSet<String> duplication = new HashSet<>();
        duplication.add(words[0]);
        
        for(int i = 1; i < words.length; i++) {
            char last = words[i - 1].charAt(words[i - 1].length() - 1);
            char first = words[i].charAt(0);
            
            if(first != last || duplication.contains(words[i])) { 
                int human = (i % n) + 1;
                int turn = (i / n) + 1;
                
                return new int[]{human, turn};
            }
            
            duplication.add(words[i]);
        }

        return new int[]{0,0};
    }
}