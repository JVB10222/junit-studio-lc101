package test;

import main.BalancedBrackets;
import org.junit.Test;

import static org.junit.Assert.*;

public class BalancedBracketsTest {

    @Test
    public  void onlyBracketsReturnsTrue(){
        assertTrue(BalancedBrackets.hasBalancedBrackets("[]"));
    }
    @Test
    public void backwardsBracketsReturnFalse(){
        Boolean actual = BalancedBrackets.hasBalancedBrackets("][");
        Boolean expected = false;
        assertEquals(expected, actual);
    }
    @Test
    public void justOpeningReturnsFalse(){
        Boolean expected = false;
        Boolean actual = BalancedBrackets.hasBalancedBrackets("[");
        assertEquals(expected,actual);
    }
    @Test
    public void justClosingReturnsFalse(){
        Boolean expected = false;
        Boolean actual = BalancedBrackets.hasBalancedBrackets("]");
        assertEquals(expected,actual);
    }

    @Test
    public void balancedBracketsWithNonBracketsCharactersReturnsTrue(){
        Boolean expected = true;
        Boolean actual = BalancedBrackets.hasBalancedBrackets("[Launchcode]");
        assertEquals(expected,actual);
    }
    @Test
    public void twoSetsOfBalancedBracketsWithNonBracketsCharactersReturnsTrue(){
        Boolean expected = true;
        Boolean actual = BalancedBrackets.hasBalancedBrackets("[Launch][code]");
        assertEquals(expected,actual);
    }

    @Test
    public void twoNestedSetsOfBalancedBracketsWithNonBracketsCharactersReturnsTrue(){
        Boolean expected = true;
        Boolean actual = BalancedBrackets.hasBalancedBrackets("[lau[nchco]de]");
        assertEquals(expected,actual);
    }

    @Test
    public void extraOpeningBracketReturnsFalse(){
        Boolean expected = false;
        Boolean actual = BalancedBrackets.hasBalancedBrackets("[Launch[code]");
        assertEquals(expected,actual);
    }
    @Test
    public void extraClosingBracketReturnsFalse(){
        Boolean expected = false;
        Boolean actual = BalancedBrackets.hasBalancedBrackets("[Launch]code]");
        assertEquals(expected,actual);
    }

    @Test
    public void twoSetsBracketsMisNestedReturnsFalse(){
        Boolean expected = false;
        Boolean actual = BalancedBrackets.hasBalancedBrackets("]Laun[ch]code[");
        assertEquals(expected,actual);
    }


//"[LaunchCode]", "Launch[Code]", "[]LaunchCode", "", "[]"
}
