import java.util.ArrayList;

class Solution {
    public int[] solution(int n, String[] words) {

        ArrayList<String> duplicaition = new ArrayList<>();
        
        duplicaition.add(words[0]);
        
        for (int i = 1; i < words.length; i++) {
            String prevWord = words[i - 1];

            String currWord = words[i];
            
            char last = prevWord.charAt(prevWord.length() - 1);
            char first = currWord.charAt(0);
            
            if (first != last || duplicaition.contains(currWord)) {

                int human = (i % n) + 1;
                int turn = (i / n) + 1;
                
                return new int[] {human, turn};
            }
            
            duplicaition.add(currWord);
        }
        
        return new int[] {0, 0};
    }
}
