import org.junit.Test;
import java.util.Arrays;
public class TestCharTask {

    String testString= "This is a string";
    String reversedString = "string a is This";
    @Test
    public void testReverse(){
        char[] input = testString.toCharArray();
        CharTasks.reverse(input);
        assert(Arrays.equals(input,reversedString.toCharArray()));
    }

}
