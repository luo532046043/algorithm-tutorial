package io.github.dunwu.algorithm.array;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

/**
 * @author <a href="mailto:forbreak@163.com">Zhang Peng</a>
 * @since 2020-01-18
 */
public class ThreeSumTest {

    @Test
    public void threeSumTest() {
        List<List<Integer>> list = ThreeSum.threeSum(new int[] { -1, 0, 1, 2, -1, -4 });
        Assert.assertEquals(Arrays.asList(-1, 0, 1), list.get(1));
        Assert.assertEquals(Arrays.asList(-1, -1, 2), list.get(0));
    }

}
