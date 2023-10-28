import org.junit.Assert;
import org.junit.Test;

public class SolutionTest {
    @Test
    public void countVowelPermutationTest1(){
        int n = 1;
        int expected = 5;
        int actual = new Solution().countVowelPermutation(n);

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void countVowelPermutationTest2(){
        int n = 2;
        int expected = 10;
        int actual = new Solution().countVowelPermutation(n);

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void countVowelPermutationTest3(){
        int n = 5;
        int expected = 68;
        int actual = new Solution().countVowelPermutation(n);

        Assert.assertEquals(expected, actual);
    }
    @Test
    public void countVowelPermutationTest4(){
        int n = 144;
        int expected = 18208803;
        int actual = new Solution().countVowelPermutation(n);

        Assert.assertEquals(expected, actual);
    }
}
