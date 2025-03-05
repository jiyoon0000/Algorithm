class Solution {
    public int solution(int[] ingredient) {
        int answer = 0;
        int[] stack = new int[ingredient.length];
        int top = -1;
        
        for(int i : ingredient){
            stack[++top] = i;
            
            if(top >= 3){
                if(stack[top - 3] == 1 &&
                  stack[top - 2] == 2 &&
                  stack[top - 1] == 3 &&
                  stack[top] == 1){
                    
                    top -= 4;
                    
                    answer++;
                }
            }
        }
        return answer;
    }
}