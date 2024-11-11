class Solution {
    public int[] solution(int[] arr) {
        if(arr.length == 1){
            return new int[]{-1};
        }
        
        int min = Integer.MAX_VALUE;
        
        for(int i : arr){
            min = Math.min(min,i);
        }
        
        int[] answer = new int[arr.length - 1];
        int num = 0;
        
        for(int i : arr){
            if(i != min){
                answer[num++] = i;
            }
        }
        return answer;
    }
}