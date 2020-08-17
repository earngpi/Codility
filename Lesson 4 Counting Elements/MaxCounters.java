import java.util.Arrays;

class Solution {
    public int[] solution(int N, int[] A) {
        int [] counters = new int[N];
        int maxVal = 0;
        int ctIndex = 0;
        
        for (int k = 0; k < A.length; k++) {
            if (A[k] <= N) {
                ctIndex = A[k] - 1;
                counters[ctIndex] += 1;
                maxVal = (counters[ctIndex] > maxVal) ? counters[ctIndex] : maxVal;
            } else if (A[k] == N + 1) {
                Arrays.fill(counters, maxVal);
            }
        }
        
        return counters;
    }
}

