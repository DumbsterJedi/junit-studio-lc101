package test;

import main.BalancedBrackets;
import org.junit.Test;

import static org.junit.Assert.*;

public class BalancedBracketsTest {

    //TODO: add tests here
    @Test
    public void emptyTest() {
        assertEquals(true, true);
    }

    @Test
    public void hasOnlyBrackets(){
        assertEquals(true, BalancedBrackets.hasBalancedBrackets("[]"));
    }

    @Test
    public void empytStringReturnsTrue(){
        assertTrue(BalancedBrackets.hasBalancedBrackets(""));
    }

    @Test
    public void testFalseIfBackwardsBrackets(){
        assertFalse(BalancedBrackets.hasBalancedBrackets("]["));
    }

    @Test
    public void testFalseIfUnbalancedBracketsWithCloseFirst(){
//        assertFalse(BalancedBrackets.hasBalancedBrackets("][]"));
        assertEquals(false,BalancedBrackets.hasBalancedBrackets("][]"));
    }

    @Test
    public void testTrueBracketsWithText(){
        assertEquals(true,BalancedBrackets.hasBalancedBrackets("[Launch]"));
    }

    @Test
    public void testTrueBracketsInsideText(){
        assertEquals(true,BalancedBrackets.hasBalancedBrackets("Launch[code]"));
    }

    @Test
    public void trueBracketsBeforeText(){
        assertEquals(true,BalancedBrackets.hasBalancedBrackets("[]LaunchCode"));
    }

    @Test
    public void trueBracketsAfterText(){
        assertEquals(true,BalancedBrackets.hasBalancedBrackets("LaunchCode[]"));
    }

    @Test
    public void falseIfUnbalancedBrackets(){
        assertEquals(false,BalancedBrackets.hasBalancedBrackets("[]["));
    }

    @Test
    public void falseUnclosedBrackets(){
        assertEquals(false,BalancedBrackets.hasBalancedBrackets("[Launch"));
    }

    @Test
    public void falseBalancedUnorderedBrackets(){
        assertEquals(false,BalancedBrackets.hasBalancedBrackets("[[[]]]"));
    }
}