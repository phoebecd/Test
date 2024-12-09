import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class MainTest {

    @Test
    public void testAdd() {
        Main main = new Main();
        assertEquals(5, main.add(2, 3), "2 + 3 should equal 5");
        assertEquals(0, main.add(-1, 1), "-1 + 1 should equal 0");
        assertEquals(-3, main.add(-1, -2), "-1 + -2 should equal -3");
    }
}
