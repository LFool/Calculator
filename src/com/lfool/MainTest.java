package com.lfool;

import org.junit.Assert;
import org.junit.Test;

/**
 * @ClassName: MainTest
 * @Description: TODO
 * @Author: LFool
 * @Date: 2019/9/12 10:25
 * @Version: 1.0
 */
public class MainTest {

    @Test
    public void solve() {
        String sum = Main.Solve("11+22");
        Assert.assertEquals("11+22=33", sum);
    }

}
