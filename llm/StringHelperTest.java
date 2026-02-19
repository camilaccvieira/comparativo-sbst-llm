import org.junit.Test;
import static org.junit.Assert.*;

public class StringHelperTest {

    @Test
    public void shouldReverseNormalString() {
        StringHelper helper = new StringHelper();
        assertEquals("olleh", helper.reverse("hello"));
    }

    @Test
    public void shouldReturnFalseForNullPalindrome() {
        StringHelper helper = new StringHelper();
        assertFalse(helper.isPalindrome(null));
    }

    @Test
    public void shouldTruncateLongString() {
        StringHelper helper = new StringHelper();
        assertEquals("Hello", helper.truncate("Hello World", 5));
    }

    @Test
    public void shouldNotTruncateIfShort() {
        StringHelper helper = new StringHelper();
        assertEquals("Hi", helper.truncate("Hi", 10));
    }
}
