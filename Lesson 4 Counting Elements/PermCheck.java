import java.util.HashSet;
import java.util.Set;

class Solution {
    public int solution(int[] A) {
        int n = A.length;
        int permutationSum = (n*(n+1))/2;
        int aSum = 0;
        Set<Integer> aSet = new HashSet<>();
        
        for (int i = 0; i < A.length; i++) {
            aSum += A[i];
            aSet.add(A[i]);}
        }
        
        if (permutationSum == aSum && A.length == aSet.size()) {
            return 1;
        } else {
            return 0;
        }
    }
}