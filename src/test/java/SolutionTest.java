import org.junit.Assert;
import org.junit.Test;
import task1.Solution;

public class SolutionTest {
    @Test
    public void testSolution1() throws Exception {
        Assert.assertEquals(1, new Solution().solution(10, new int[]{1, 1, 1, 3, 3, 4, 4}));
    }

    @Test
    public void testSolution2() throws Exception {
        Assert.assertEquals(4, new Solution().solution(10, new int[]{1, 5, 5, 3, 3, 4, 4, 4}));
    }

    @Test
    public void testSolution3() throws Exception {
        Assert.assertEquals(3, new Solution().solution(10, new int[]{0, 1, 2, 3, 3, 4}));
    }

    @Test
    public void testSolution4() throws Exception {
        Assert.assertEquals(1, new Solution().solution(3, new int[]{1, 1, 1, 2, 2, 3, 3, 4, 4, 4, 4}));
    }

    @Test
    public void testSolution5() throws Exception {
        Assert.assertEquals(1, new Solution().solution(10, new int[]{1, 2, 3, 4, 5}));
    }

    @Test
    public void testSolution6() throws Exception {
        Assert.assertEquals(1, new Solution().solution(1, new int[]{1, 2, 3, 4, 5}));
    }


    @Test
    public void testSolution7() throws Exception {
        Assert.assertEquals(1, new Solution().solution(1, new int[]{1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2}));
    }

    @Test
    public void testSolution8() throws Exception {
        Assert.assertEquals(1, new Solution().solution(1, new int[]{1, 1, 1, 1, 2, 2, 2, 2, 2, 2}));
    }

    @Test
    public void testSolution9() throws Exception {
        Assert.assertEquals(2, new Solution().solution(2, new int[]{1, 1, 1, 1, 2, 2, 2, 2, 2, 2}));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSolution10() throws Exception {
        Assert.assertEquals(2, new Solution().solution(2, new int[]{}));
    }
}