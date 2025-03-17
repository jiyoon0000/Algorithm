class Solution {
    public int solution(int[] schedules, int[][] timelogs, int startday) {
        int answer = 0;
        int n = schedules.length;
        
        int[] weekday = getWeekday(startday);
        int weekdayCount = weekday.length;
        
        for (int i = 0; i < n; i++) {
            int allow = work(schedules[i]);
            
            boolean onTime = true;
            
            for (int j = 0; j < weekdayCount; j++) {
                int day = weekday[j];
                
                if (timelogs[i][day] > allow) {
                    onTime = false;
                    break;
                }
            }
            if (onTime) {
                answer++;
            }
        }
        
        return answer;
    }
    
    private int[] getWeekday(int startday) {
        int[] temp = new int[7];
        int count = 0;
        
        for (int i = 0; i < 7; i++) {
            int day = (startday - 1 + i) % 7 + 1;
            
            if (day >= 1 && day <= 5) {
                temp[count++] = i;
            }
        }
        
        int[] weekday = new int[count];
        
        for (int j = 0; j < count; j++) {
            weekday[j] = temp[j];
        }
        return weekday;
    }
    
    private int work(int time) {
        int addTenMinutes = (time / 100) * 60 + (time % 100) + 10;
        return (addTenMinutes / 60) * 100 + (addTenMinutes % 60);
    }
}