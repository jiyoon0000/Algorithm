class Solution {
    public int[] solution(int[] array, int[][] commands) {
        int[] answer = new int[commands.length];
        
        for (int i = 0; i < commands.length; i++) {
            int start = commands[i][0];
            int end = commands[i][1];
            int k = commands[i][2];
            
            int[] count = new int[101];
            
            for (int j = start - 1; j < end; j++) {
                count[array[j]]++;
            }
            
            int a = 0;
            int result = 0;
            
            for (int num = 1; num <= 100; num++) {
                a += count[num];
                
                if (a >= k) {
                    result = num;
                    break;
                }
            }
            
            answer[i] = result;
        }
        return answer;
    }
}