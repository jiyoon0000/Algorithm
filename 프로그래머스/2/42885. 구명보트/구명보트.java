import java.util.Arrays;

class Solution {
    public int solution(int[] people, int limit) {
        Arrays.sort(people);
        
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