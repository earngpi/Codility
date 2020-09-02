import java.util.*;

class Solution {
    public int solution(int[] A) {
        Arrays.sort(A);
        
        long P, Q, R;
        boolean cond1, cond2, cond3;
        
        for (int i = 2; i < A.length; i++) {
            P = A[i];
            Q = A[i - 1];
            R = A[i - 2];
            cond1 = (long) P + Q > R;
            cond2 = (long) Q + R > P;
            cond3 = (long) R + P > Q;
            if (cond1 && cond2 && cond3) {
                return 1;
            }
        }
        
        return 0;
    }
}