class Solution {
    public String[] solution(int n, int[] arr1, int[] arr2) {
        String[] answer = new String[n];
        
        for(int i = 0; i < n; i++){
            int map = arr1[i] | arr2[i];
            
            String result = "";
            
            for(int j = 0; j < n; j++){
                int a = map % 2;
                
                if(a == 1){
                    result = "#" + result;
                } else {
                    result = " " + result;
                }
                
                map = map / 2;
            }
            
            answer[i] = result;
        }
        
        return answer;
    }
}