import org.junit.Test;
import static org.junit.Assert.*;

public class StringHelper_ESTest {

    @Test
    public void testReverseWithNull() {
        StringHelper stringHelper = new StringHelper();
        String result = stringHelper.reverse(null);
        assertNull(result);
    }

    @Test
    public void testIsPalindromeWithSpaces() {
        StringHelper stringHelper = new StringHelper();
        boolean result = stringHelper.isPalindrome("A man a plan a canal Panama");
        assertTrue(result);
    }

    @Test
    public void testTruncateExactlyAtLimit() {
        StringHelper stringHelper = new StringHelper();
        String result = stringHelper.truncate("Java", 4);
        assertEquals("Java", result);
    }
}
