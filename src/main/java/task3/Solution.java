package task3;

import java.util.List;
import java.util.Set;
import java.util.TreeSet;
import java.util.stream.Collectors;

/**
 * Created by Lukasz on 2017-01-09.
 */
public class Solution {


    public int solution(int[] A) {
        Set<Integer> resultSet = new TreeSet<>();

        for (int i = 0; i < A.length - 1; i++)
            for (int j = i; j < A.length; j++)
                resultSet.add(getSumDistance(i, j, A));

        List<Integer> list = resultSet.stream().collect(Collectors.toList());

        return list.get(list.size() - 1);
    }

    private int getSumDistance(int p, int q, int[] A) {
        return A[p] + A[q] + q - p;
    }
}
