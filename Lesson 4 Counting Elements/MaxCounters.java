import java.util.Arrays;

class Solution {
    public int[] solution(int N, int[] A) {
        int [] counters = new int[N];
        int currMaxVal = 0;
        int prevMaxVal = 0;
        int ctIndex = 0;
        
        for (int k = 0; k < A.length; k++) {
            if (A[k] <= N) {
                ctIndex = A[k] - 1;
                counters[ctIndex] += 1;
                currMaxVal = (counters[ctIndex] > currMaxVal) ? counters[ctIndex] : currMaxVal;
            } else if (A[k] == N + 1) {
                if (currMaxVal == 0) { continue; }
                counters = new int[N];
                prevMaxVal += currMaxVal;
                currMaxVal = 0;
            }
        }
        
        addMaxValToCounters(counters, prevMaxVal);
        
        return counters;
    }
    
    private void addMaxValToCounters(int[] counters, int maxVal) {
        if (maxVal == 0) { return; }

        for (int i = 0; i < counters.length; i++) {
            counters[i] += maxVal;
        }
    }

    private void printCounterArray(int[] counters) {
        for (int i = 0; i < counters.length; i++) {
            System.out.print(counters[i] + " ");
        }
        
        System.out.println();
    }
}

