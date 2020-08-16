class Solution {
    public int solution(int N) {
        String binRep = Integer.toBinaryString(N);
        int maxZeroCount = 0;
        int currZeroCount = 0;
        
        for (int i = 0; i < binRep.length(); i++) {
            if (Character.toString(binRep.charAt(i)).equals("0")) {
                currZeroCount++;
            } else {
                maxZeroCount = (currZeroCount > maxZeroCount) ? currZeroCount : maxZeroCount;
                currZeroCount = 0;
            }
        }
        
        return maxZeroCount;
    }
}