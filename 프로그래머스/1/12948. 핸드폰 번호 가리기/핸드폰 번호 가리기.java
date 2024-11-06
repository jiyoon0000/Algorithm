class Solution {
    public String solution(String phone_number) {
        String answer = "";
        int length = phone_number.length();
        
        String stars = "*".repeat(length-4);
        answer = stars + phone_number.substring(length-4);
        return answer;
    }
}