import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

class Solution {
    public int[] solution(int[] A, int K) {
        if (A.length == K || A.length == 0 || A.length == 1) {
            return A;
        }
        
        List<Integer> AList = Arrays.stream(A).boxed().collect(Collectors.toList());
        for (int i = 0; i < K; i++) {
            AList.add(0, AList.get(AList.size() - 1));
            AList.remove(AList.size() - 1);
        }
        
        return AList.stream().mapToInt(i->i).toArray();
    }
}