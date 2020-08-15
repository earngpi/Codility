import java.util.Arrays;

class Solution {
    public int solution(int[] A) {
        if (A.length == 0) {
            return 1;
        }
        
        if (A.length == 1 && A[0] == 2) {
            return 1;
        }
        
        if (A.length == 1 && A[0] == 1) {
            return 2;
        }
        
        Arrays.sort(A);
        for (int i = 0; i < A.length - 1; i++) {
            if (A[i+1] != A[i] + 1) { 
                    return A[i] + 1; 
            }
        }
        
        if (A[0] != 1) {
            return 1;
        }
        
        return A[A.length - 1] + 1;
    }
}