class Solution {
    public int solution(int[] numbers) {
        int answer = 0;
        int[] arr = new int[10];
        
        for(int i=0; i<numbers.length; i++){
            arr[numbers[i]]++;
        }
        
        for(int j=0; j<arr.length; j++){
            if(arr[j] == 0){
                answer += j;
            }
        }
        return answer;
    }
}