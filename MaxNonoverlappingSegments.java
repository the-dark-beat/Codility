
class Solution {
    public int solution(int[] A, int[] B) {
        // write your code in Java SE 8
        int N =A.length;
        if(A.length == 0 && B.length == 0) {return 0;}

        int count = 1;
        int prev_end =B[0];

        int current;

        for(current = 1; current<N;current++){
            if(A[current] > prev_end){
                count++;
                prev_end = B[current];
            }
        }
        return count;
    }
}
