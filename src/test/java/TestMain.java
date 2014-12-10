
import org.junit.Test;
import static org.junit.Assert.*;

public class TestMain {

    @Test
    public void testPasses() {
        int expected = 23;
        int output = Main.reken(14,9);
        assertEquals(output, expected);
    }


}

