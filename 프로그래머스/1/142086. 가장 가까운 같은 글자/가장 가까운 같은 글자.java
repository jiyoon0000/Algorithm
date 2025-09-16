class Solution {
    public int[] solution(String s) {
        int n = s.length();        
        int[] answer = new int[n];
        
        int[] recent = new int[26];
        
        for (int i = 0; i < 26; i++) {
            recent[i] = -1;
        }
        
        for (int i = 0; i < n; i++) {
            char ch = s.charAt(i);
            int alphabet = ch - 'a';
            
            if (recent[alphabet] == -1) {
                answer[i] = -1;
            } else {
                answer[i] = i - recent[alphabet];
            }
            
            recent[alphabet] = i;
        }
        return answer;
    }
}