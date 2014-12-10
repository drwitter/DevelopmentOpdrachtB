/**
 * Created by rik on 12/9/14.
 */
import org.junit.Test;
import static org.junit.Assert.*;

public class TestMain {

    @Test
    public void testPasses() {
        int expected = 5;
        int output = Main.reken(2,3);
        assertEquals(output, expected);
    }


}

