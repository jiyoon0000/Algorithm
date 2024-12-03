class Solution {
    public int solution(String t, String p) {
        int answer = 0;
        int pLength = p.length();
        long pValue = Long.parseLong(p);
        
        for(int i=0; i <= t.length()-pLength; i++){
            String subString = t.substring(i, i+pLength);
            
            if(Long.parseLong(subString) <= pValue){
                answer++;
            }
        }
        return answer;
    }
}