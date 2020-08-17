import java.util.Arrays;

class Solution {
    public int solution(int[] A) {
        int allNumberSize = A.length + 1;
        int allNumberSum = sumIntArray(createIntArray(allNumberSize));
        // Commented - gave incorrect "output" on some Codility "performance" test cases. cannot accurately reproduce as cannot see Codility test inputs. still tryna reproduce locally and it worked fine
        // int allNumberSum = (allNumberSize * (allNumberSize + 1)) / 2;
        int missingNumberSum = sumIntArray(A);

        return allNumberSum - missingNumberSum;
    }

    private int sumIntArray(int[] A) {
        int sum = 0;
        for (int i = 0; i < A.length; i++) {
            sum += A[i];
        }

        return sum;
    }
    
    private int[] createIntArray(int size) {
        int[] A = new int[size];
        for (int i = 0; i < size; i++) {
            A[i] = i + 1;
        }
        
        return A;
    }
}
