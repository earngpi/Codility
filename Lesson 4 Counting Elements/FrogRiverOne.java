import java.util.HashSet;

class Solution {
    public int solution(int X, int[] A) {
        HashSet<Integer> fallenLeafSet = new HashSet<>();
        
        for (int i = 0; i < A.length; i++) {
            if (fallenLeafSet.contains(A[i])) {
                continue;
            }
            
            fallenLeafSet.add(A[i]);
            if (fallenLeafSet.size() == X) {
                return i;
            }
        }
        
        return -1;
    }
}