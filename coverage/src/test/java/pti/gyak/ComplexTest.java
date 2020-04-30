package pti.gyak;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class ComplexTest {

    Complex complex = new Complex();
    @Test
    public void testBalAg() {
        assertEquals(354, complex.func(354, 400, 300));
    }

    @Test
    public void testBalKozepAg() {
        assertEquals(-698, complex.func(698, 450, 410));
    }

    @Test
    public void testJobbKozepAg() { assertEquals(456, complex.func(355, 752, 456)); }

    @Test
    public void testJobbAg() {
        assertEquals(200, complex.func(524, 200, 400));
    }
}