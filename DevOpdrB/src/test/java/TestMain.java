import org.junit.Test;
import static org.junit.Assert.*;

public class TestMain {

    @Test
    public void test() {
        int uitkomst = Main.reken(9, 21);
        int expected = 30;
        assertEquals(uitkomst, expected);
    }
}