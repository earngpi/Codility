 class Solution {
    public int solution(int[] A) {
        int minDiff = Integer.MAX_VALUE;
        int totalSum = sumArray(A);
        int firstHalfSum = 0;
        int secondHalfSum = 0;
        
        for (int i = 0; i < A.length - 1; i++) {
            firstHalfSum += A[i];
            secondHalfSum = totalSum - firstHalfSum;
            if (minDiff > Math.abs(secondHalfSum - firstHalfSum)) {
                minDiff = Math.abs(secondHalfSum - firstHalfSum);
            }
        }
        
        return minDiff;
    }
    
    private int sumArray(int[] A) {
        int sum = 0;
        for (int i = 0; i < A.length; i++) {
            sum += A[i];
        }
        
        return sum;
    }
}