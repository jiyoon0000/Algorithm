class Solution {
    boolean solution(String s) {
        int pCount = 0;
        int yCount = 0;
        
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            
            if (ch == 'p' || ch == 'P') {
                pCount++;
            } else if (ch == 'y' || ch == 'Y') {
                yCount++;
            }
        }

        return pCount == yCount;
    }
}