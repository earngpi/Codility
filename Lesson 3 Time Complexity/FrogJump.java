class Solution {
    public int solution(int X, int Y, int D) {
        double distance = Y - X;
        return (int) Math.ceil(distance/D);
    }
}