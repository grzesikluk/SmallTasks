package task4;

import java.util.OptionalDouble;
import java.util.stream.IntStream;

/**
 * Created by Lukasz on 2017-01-09.
 */
class Solution {

    public int solution(int[] A) {
        // write your code in Java SE 8
        double maxDev = 0.0;
        int resultIndex = 0;
        double extreme = 0.0;

        OptionalDouble average = IntStream.of(A).average();

        if (average.isPresent()) {

            for (int i = 0; i < A.length; i++) {
                extreme = Math.abs(average.getAsDouble() - (double) A[i]);

                if (maxDev < extreme) {
                    maxDev = extreme;
                    resultIndex = i;
                }
            }
        } else {
            return -1;
        }

        return resultIndex;

    }
}