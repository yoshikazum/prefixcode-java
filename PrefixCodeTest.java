import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class PrefixCodeTest {

    protected PrefixCode solution;

    @Before
    public void setUp() {
        solution = new PrefixCode();
    }

    @Test(timeout = 2000)
    public void testCase0() {
        String[] words = new String[]{"trivial"};

        String expected = "Yes";
        String actual = solution.isOne(words);

        Assert.assertEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase1() {
        String[] words = new String[]{"10001", "011", "100", "001", "10"};

        String expected = "No, 2";
        String actual = solution.isOne(words);

        Assert.assertEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase2() {
        String[] words = new String[]{"no", "nosy", "neighbors", "needed"};

        String expected = "No, 0";
        String actual = solution.isOne(words);

        Assert.assertEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase3() {
        String[] words = new String[]{"1010", "11", "100", "0", "1011"};

        String expected = "Yes";
        String actual = solution.isOne(words);

        Assert.assertEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase4() {
        String[] words = new String[]{"No", "not"};

        String expected = "Yes";
        String actual = solution.isOne(words);

        Assert.assertEquals(expected, actual);
    }

}
