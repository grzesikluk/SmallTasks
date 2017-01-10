package task4;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by Lukasz on 2017-01-09.
 */
public class SolutionTest {
    @Test
    public void testSolution1() throws Exception {
        Assert.assertEquals(3, new Solution().solution(new int[]{9,4,-3,-10}));
    }

    @Test
    public void testSolution2() throws Exception {
        Assert.assertEquals(-1, new Solution().solution(new int[]{}));
    }

}