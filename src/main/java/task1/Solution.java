package task1;

public class Solution {

    public int solution(int M, int[] A) {
        int N = A.length;
        if(N == 0) throw new IllegalArgumentException("This function doesn't accept empty arrays"); //this must be checked
        int[] count = new int[M + 1];
        for (int i = 0; i <= M; i++)
            count[i] = 0;
        int maxOccurence = 0;         // 1; this line causes wrong counting
        int index = 0;                //-1; this line causes ArrayIndexOutOfBound excetion when there is equal number of numbers
        for (int i = 0; i < N; i++) {
            if (A[i] <= M)            //this assures not counting numbers out of 0..M range
                if (count[A[i]] > 0) {
                    int tmp = count[A[i]];
                    if (tmp > maxOccurence) {
                        maxOccurence = tmp;
                        index = i;
                    }
                    count[A[i]] = tmp + 1;
                } else {
                    count[A[i]] = 1;
                }
        }
        return A[index];
    }
}