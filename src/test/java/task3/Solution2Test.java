package task3;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by Lukasz on 2017-01-09.
 */
public class Solution2Test {
    @Test
    public void testSolution1() throws Exception {
        Assert.assertEquals(6, new Solution2().solution(new int[]{1,3,-3}));
    }

    @Test
    public void testSolution2() throws Exception {
        Assert.assertEquals(14, new Solution2().solution(new int[]{-8,4,0,5,-3,6}));
    }

    @Test
    public void testSolution3() throws Exception {
        Assert.assertEquals(100, new Solution2().solution(new int[]{-8,4,0,50,-3,6}));
    }

    @Test
    public void testSolution4() throws Exception {
        Assert.assertEquals(148, new Solution2().solution(new int[]{-8,4,0,50,-3,6,-8,4,0,50,-3,6,-8,4,0,50,-3,6,-8,4,0,
                50,-3,6,-8,4,0,50,-3,6,-8,4,0,50,-3,6,-8,4,0,50,-3,6,-8,4,0,50,-3,6,-8,4,0,50,-3,6}));
    }

    @Test
    public void testSolution5() throws Exception {
        Assert.assertEquals(12, new Solution2().solution(new int[]{1,1,1,1,1,1,1,1,1,1,1}));
    }

    @Test
    public void testSolution6() throws Exception {
        Assert.assertEquals(11, new Solution2().solution(new int[]{5,4,3,1,1,1}));
    }

}