class Solution {
    public int[] solution(int n, int m) {
        int max = Math.max(n,m);
        int min = Math.min(n,m);
        
        int gcd = getGCD(max,min);
        int lcm = getLCM(max,min,gcd);
        
        int[] answer = new int[]{gcd,lcm};
        return answer;
    }
    
    private int getGCD(int a, int b){
        while(b != 0){
            int c = b;
            b = a % b;
            a = c;
        }
        return a;
    }
    
    private int getLCM(int a, int b, int gcd){
        return (a * b) / gcd;
    }
}