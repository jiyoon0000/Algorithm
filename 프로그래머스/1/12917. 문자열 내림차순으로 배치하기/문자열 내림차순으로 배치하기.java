import java.util.Arrays;
import java.util.Collections;

class Solution {
    public String solution(String s) {
        Character[] arr = new Character[s.length()];
        for(int i=0; i<s.length(); i++){
            arr[i] = s.charAt(i);
        }
        
        Arrays.sort(arr,Collections.reverseOrder());
        
        String answer = "";
        for(char c : arr){
            answer += c;
        }
        return answer;
    }
}