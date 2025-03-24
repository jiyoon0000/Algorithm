class Solution {
    public int[] solution(int N, int[] stages) {
        
        int players = stages.length;
        int[] countStage = new int[N + 2];
        
        for (int stage : stages) {
            countStage[stage]++;
        }
        
        double[] fail = new double[N + 1];
        int remain = players;
        
        for (int i = 1; i <= N; i++) {
            if (remain > 0) {
                fail[i] = (double) countStage[i] / remain;
            } else {
                fail[i] = 0;
            }
            remain -= countStage[i];
        }
        
        int[] answer = new int[N];
        int[] stagesNum = new int[N];
        
        for (int i = 0; i < N; i++) {
            stagesNum[i] = i + 1;
        }
        
        for (int i = 0; i < N; i++) {
            int max = i;
            for (int j = i + 1; j < N; j++) {
                if (fail[stagesNum[j]] > fail[stagesNum[max]]) {
                    max = j;
                }
                else if (fail[stagesNum[j]] == fail[stagesNum[max]] && stagesNum[j] < stagesNum[max]) {
                    max = j;
                }
            }
            
            int a = stagesNum[i];
            stagesNum[i] = stagesNum[max];
            stagesNum[max] = a;
            answer[i] = stagesNum[i];
        }
        
        return answer;
    }
}