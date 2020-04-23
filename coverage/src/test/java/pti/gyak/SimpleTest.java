package pti.gyak;

import static org.junit.Assert.*;

import org.junit.Test;

public class SimpleTest {

    Simple simple = new Simple();
    @Test
    public void testBalAg() {
        assertEquals(354, simple.func(354, 400, 300));
    }

    @Test
    public void testKozepAg() {
        assertEquals(-698, simple.func(698, 486, 543));
    }

    @Test
    public void testJobbAg() {
        assertEquals(200, simple.func(512, 200, 202));
    }
}