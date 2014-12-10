import org.junit.Test;
import static org.junit.Assert.*;

public class TestMain {

    @Test
    public void test() {
        int uitkomst = Main.reken(9, 22);
        int expected = 31;
        assertEquals(uitkomst, expected);
    }
}