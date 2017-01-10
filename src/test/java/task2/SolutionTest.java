package task2;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by Lukasz on 2017-01-09.
 */
public class SolutionTest {
    @Test
    public void testSolution1() throws Exception {
        Assert.assertEquals(2, Solution.solution(new int[]{8, 24, 3, 20, 1, 17}) );
    }

    @Test
    public void testSolution2() throws Exception {
        Assert.assertEquals(0, Solution.solution(new int[]{7, 21, 3, 42, 3, 7}) );
    }

    @Test
    public void testSolution3() throws Exception {
        Assert.assertEquals(2, Solution.solution(new int[]{5,1,7,10}) );
    }

    @Test
    public void testSolution4() throws Exception {
        Assert.assertEquals(2, Solution.solution(new int[]{11,2,7,13,16}) );
    }
}