class Solution {
    public int solution(int[] bandage, int health, int[][] attacks) {
        int t = bandage[0];
        int x = bandage[1];
        int y = bandage[2];
        
        int currentHealth = health;
        int success = 0;
        
        int attack = attacks.length;
        int countAttack = 0;
        int finalAttack = attacks[attack - 1][0];
        
        for (int currentTime = 1; currentTime <= finalAttack; currentTime++) {
            
            if (countAttack < attack && attacks[countAttack][0] == currentTime) {
                currentHealth -= attacks[countAttack][1];
                success = 0;
                countAttack++;
                
            } else {
                success++;
                currentHealth += x;
                
                if (currentHealth > health) {
                    currentHealth = health;
                }
                
                if (success == t) {
                    currentHealth += y;
                    if (currentHealth > health) {
                        currentHealth = health;
                    }
                    success = 0;
                }
            }
            
            if (currentHealth <= 0) {
                return -1;
            }
        }
        
        return currentHealth;
    }
}