
import org.junit.Test;
import static org.junit.Assert.*;

public class TestMain {

    @Test
    public void testPasses() {
        int expected = 25;
        int output = Main.reken(15,10);
        assertEquals(output, expected);
    }


}

