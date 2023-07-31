package exercises.validateformatstring1;


import org.junit.Test;

import static org.junit.Assert.*;

public class ValidateFormatString1Test {

    @Test
    public void isValid() {
        ValidateFormatString1 validateFormatString = new ValidateFormatString1();
        assertTrue( validateFormatString.isValid(""));
        assertTrue( validateFormatString.isValid("()"));
        assertTrue( validateFormatString.isValid("[()]"));
        assertTrue( validateFormatString.isValid("{()}"));
        assertTrue( validateFormatString.isValid("[]{}()"));
        assertTrue( validateFormatString.isValid("[{()}]"));
        assertTrue( validateFormatString.isValid("[{{{[[([()])]]}}}]{()}"));

        assertFalse( validateFormatString.isValid(null));
        assertFalse( validateFormatString.isValid(")"));
        assertFalse( validateFormatString.isValid("())"));
        assertFalse( validateFormatString.isValid("{(})"));
        assertFalse( validateFormatString.isValid("{([)})]"));
    }
}