
import org.junit.Test;
import static org.junit.Assert.*;

public class TestMain {

    @Test
    public void testPasses() {
        int expected = 33;
        int output = Main.reken(14,19);
        assertEquals(output, expected);
    }


}

