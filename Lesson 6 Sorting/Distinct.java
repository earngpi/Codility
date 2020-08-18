import java.util.HashSet;
import java.util.Set;

class Solution {
    public int solution(int[] A) {
        Set<Integer> aSet = new HashSet<>();
        
        for (int i = 0; i < A.length; i++) {
            aSet.add(A[i]);
        }
        
        return aSet.size();
    }
}