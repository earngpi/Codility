import java.util.HashSet;
import java.util.Set;

class Solution {
    public int solution(int[] A) {
        int minMissingVal = 0;
        int maxVal = 0;
        Set<Integer> aSet = new HashSet<>();
        
        for (int i = 0; i < A.length; i++) {
            if (A[i] < 0) {
                continue;
            }
            
            if (A[i] > maxVal) {
                maxVal = A[i];
            }
            
            aSet.add(A[i]);
        }
        
        
        for (int i = 1; i <= maxVal; i++) {
            if (!aSet.contains(i)) {
                return i;
            }
        }
        
        return maxVal + 1;
    }
}