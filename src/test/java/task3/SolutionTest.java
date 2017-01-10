package task3;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by Lukasz on 2017-01-09.
 */
public class SolutionTest {
    @Test
    public void testSolution1() throws Exception {
        Assert.assertEquals(6, new Solution().solution(new int[]{1,3,-3}));
    }

    @Test
    public void testSolution2() throws Exception {
        Assert.assertEquals(14, new Solution().solution(new int[]{-8,4,0,5,-3,6}));
    }


}