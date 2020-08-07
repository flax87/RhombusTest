import org.junit.Test;

import java.awt.geom.Area;
import java.lang.reflect.Array;

import static org.junit.Assert.*;

public class RhombusTest {

    @Test
    public void getArrea() {
        assertEquals(50, 12);

    }

    @Test
    public void getPerimeter() {
        assertEquals(50,3);
    }

    @Test
    public void getLongDiagonal() {
        assertEquals(30,10);
    }

    @Test
    public void getShortDiagonal() {
        assertEquals(20,4);
    }

    @Test
    public void isQuadrat() {
        assertEquals(10,10);
    }
}