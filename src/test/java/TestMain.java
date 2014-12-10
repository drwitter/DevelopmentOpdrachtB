
import org.junit.Test;
import static org.junit.Assert.*;

public class TestMain {

    @Test
    public void testPasses() {
        int expected = 24;
        int output = Main.reken(14,10);
        assertEquals(output, expected);
    }


}

