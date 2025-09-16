class Solution {
    public int[] solution(String s) {
        int n = s.length();
        int[] answer = new int[n];
        
        for (int i = 0; i < n; i++) {
            boolean found = false;
            
            for (int j = i - 1; j >= 0; j--) {
                if (s.charAt(i) == s.charAt(j)) {
                    answer[i] = i - j;
                    found = true;
                    break;
                }
            }
            
            if (!found) {
                answer[i] = -1;
            }
        }
        return answer;
    }
}