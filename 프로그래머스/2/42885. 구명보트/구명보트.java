class Solution {
    public int solution(int[] people, int limit) {
        int[] count = new int[241];
        
        for (int w : people) {
            count[w]++;
        }
        
        int i = 0;
        for (int w = 40; w <= 240; w++) {
            while (count[w]-- > 0) {
                people[i++] = w;
            }
        }
        
        int light = 0;
        int heavy = people.length - 1;
        int boat = 0;
        
        while (light <= heavy) {
            if (people[light] + people[heavy] <= limit) {
                light++;
            }
            
            heavy--;
            boat++;
        }
        
        return boat;
    }
}