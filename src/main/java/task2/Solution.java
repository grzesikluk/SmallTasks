package task2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Created by Lukasz on 2017-01-09.
 */
public class Solution {

    public static int solution(int[] A) {
        // write your code in Java SE 8
        List<Integer> sortedList = new ArrayList<>();

        for (int i : A)
            sortedList.add(i);

        Collections.sort(sortedList);

        int prev = sortedList.get(0);
        int minimumDistance = sortedList.get(sortedList.size() - 1); // get highest value
        int distance = minimumDistance;

        for (int i = 1; i < sortedList.size(); i++) {
            distance = sortedList.get(i) - prev;

            if (distance < minimumDistance)
                minimumDistance = distance;
        }

        return minimumDistance;
    }




}
