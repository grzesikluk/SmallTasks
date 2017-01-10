package task3;

import java.util.*;

/**
 * Created by Lukasz on 2017-01-09.
 */
public class Solution2 {


    /*
    *
    * Algorithm is based on two step conversion of the values. Instead of values we need to use pairs holding both value
    * and index - because distance is calculated from both, this is first step. Second step is to convert all pairs to
    * find maximum distance.
    *
    * It works as follows:
    *
    * 1. basing on input array create list of pairs IntPair(index,value)
    * 2. the list listOfPairs contains all values and must be sorted by value
    * 3. pick the maximum element from the list - maxValuePair
    * 4. for each element of the list calculate converted pair (relative to maxValuePair) as in IntPair::getConvertedPair
    * 5. for each converted element calculate distance as in IntPair::calculateConvertedDistance
    * 6. return maximum value from all calculated distances from #5.
    *
    * The important part of implementation is inner class IntPair. Note it needs to implement Comparable for sorting reasons as
    * well as other overwritten methods.
    *
    *
    *
    * */
    public int solution(int[] A) {
        List<IntPair> listOfPairs = new LinkedList<>();

        for (int i = 0; i < A.length; i++)
            listOfPairs.add(new IntPair(i, A[i]));  //sorted when adding

        Collections.sort(listOfPairs);

        IntPair maxValuePair = listOfPairs.get(listOfPairs.size() - 1);

        //some java8 below.
        return listOfPairs.stream().parallel().map(s->s.getConvertedPair(maxValuePair)).
                map(s->s.calculateConvertedDistance()).mapToInt(s->s).max().getAsInt();
    }


    class IntPair implements Comparable {
        int index;
        int value;

        IntPair(int i, int v) {
            index = i;
            value = v;
        }


        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            IntPair intPair = (IntPair) o;

            if (index != intPair.index) return false;
            return value == intPair.value;

        }

        @Override
        public int hashCode() {
            int result = index;
            result = 31 * result + value;
            return result;
        }

        @Override
        public int compareTo(Object o) {

            if (value == ((IntPair) o).value)
                return index - ((IntPair) o).index;

            return value - ((IntPair) o).value;
        }

        @Override
        public String toString() {
            return "IntPair{" +
                    "index=" + index +
                    ", value=" + value +
                    '}';
        }

        IntPair getConvertedPair(IntPair other) {
            return new IntPair(Math.abs(other.index - index), other.value + value);
        }

        int calculateConvertedDistance() {
            return value + index;
        }
    }
}
