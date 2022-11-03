class Solution {
    public int[] solution(int[] A, int[] B) {
        // write your code in Java SE 8
       

        int L = A.length;
        int max = 0;

        for(int i = 0; i<L;i++){
            max = Math.max(A[i], max);
            }
        
        int [] fibby = new int[max+1]; 

        fibby[0] = 1;
        fibby[1] = 1;

        for(int i = 2; i<=max;i++){
            fibby[i] = (fibby[i-1] + fibby[i -2] % (1 << 30));
            }

        int [] results = new int [L];

        for(int i =0; i < L; i++){
            results[i] = fibby[A[i]] % (1<<B[i]);
            }
        return results;
    }
}
