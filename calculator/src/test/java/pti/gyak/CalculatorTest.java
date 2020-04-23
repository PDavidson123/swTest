package pti.gyak;

import static org.junit.Assert.*;

import org.junit.Test;

public class CalculatorTest {

    @Test
    public void testResult() {
        assertEquals(6.0, (new Calculator()).enter(5).enter(Operation.ADD).enter(1).result);
    }

    @Test
    public void testHistory() {
        assertEquals("5 + 1 = 6", (new Calculator()).enter(5).enter(Operation.ADD).enter(1).getHistory());
    }

    @Test
    public void testAdd() {
        assertEquals(3.0, new Calculator().enter(1).enter(Operation.ADD).enter(2).result);
    }

    @Test
    public void testMultiply() {
        assertEquals(4.0, (new Calculator()).enter(2).enter(Operation.MULTIPLY).enter(2).result);
    }

    @Test
    public void testSubtract() {
        assertEquals(1.0, new Calculator().enter(23).enter(Operation.SUBSTRACT).enter(22).result);
    }

    @Test
    public void testRemainder() {
        assertEquals(2.0, (new Calculator()).enter(10).enter(Operation.REMAINDER).enter(4).result);
    }

    @Test
    public void testDivide() {
        assertEquals(0.0, (new Calculator()).enter(0).enter(Operation.DIVIDE).enter(20).result);
        assertEquals(Double.NEGATIVE_INFINITY, (new Calculator()).enter(-1).enter(Operation.DIVIDE).enter(0).result);
        assertEquals(Double.POSITIVE_INFINITY, (new Calculator()).enter(1).enter(Operation.DIVIDE).enter(0).result);
    }

    @Test
    public void testPow() {
        assertEquals(16.0, (new Calculator()).enter(2).enter(Operation.POWER).enter(4).result);
    }

    @Test
    public void testEnterClear() {
        assertEquals(0, (new Calculator()).enter(Operation.clear).result);
    }
}