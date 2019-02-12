package cn.huang.leetcode;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class LC_0990_SatisfiabilityofEqualityEquationsTest {

    @Test
    public void equationsPossible() {
        LC_0990_SatisfiabilityofEqualityEquations s = new LC_0990_SatisfiabilityofEqualityEquations();

        boolean res = s.equationsPossible(new String[]{"b==b", "b==e", "e==c", "d!=e"});

        Assert.assertEquals(true, res);
    }

    @Test
    public void equationsPossible2() {
        LC_0990_SatisfiabilityofEqualityEquations s = new LC_0990_SatisfiabilityofEqualityEquations();

        boolean res = s.equationsPossible(new String[]{"a==b", "b!=c", "c==a"});

        Assert.assertEquals(false, res);
    }

    @Test
    public void equationsPossible3() {
        LC_0990_SatisfiabilityofEqualityEquations s = new LC_0990_SatisfiabilityofEqualityEquations();

        boolean res = s.equationsPossible(new String[]{"e!=c", "b!=b", "b!=a", "e==d"});

        Assert.assertEquals(false, res);
    }

    @Test
    public void equationsPossible4() {
        LC_0990_SatisfiabilityofEqualityEquations s = new LC_0990_SatisfiabilityofEqualityEquations();

        boolean res = s.equationsPossible(new String[]{"b!=f", "c!=e", "f==f", "d==f", "b==f", "a==f"});

        Assert.assertEquals(false, res);
    }

    @Test
    public void equationsPossible5() {
        LC_0990_SatisfiabilityofEqualityEquations s = new LC_0990_SatisfiabilityofEqualityEquations();

        boolean res = s.equationsPossible(new String[]{"g==c", "f!=e", "e==b", "j==b", "g!=a", "e==c", "b!=f", "d!=a", "j==g", "f!=i", "a==e"});

        Assert.assertEquals(false, res);
    }
}