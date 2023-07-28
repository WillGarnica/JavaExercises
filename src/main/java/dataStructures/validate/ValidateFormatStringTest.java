package dataStructures.validate;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class ValidateFormatStringTest {

    @Test
    public void isValid() {
        ValidateFormatString validateFormatString = new ValidateFormatString();
        assertEquals(true, validateFormatString.isValid(""));
        assertEquals(true, validateFormatString.isValid("()"));
        assertEquals(true, validateFormatString.isValid("[()]"));
        assertEquals(true, validateFormatString.isValid("{()}"));
        assertEquals(true, validateFormatString.isValid("[]{}()"));
        assertEquals(true, validateFormatString.isValid("[{()}]"));
        assertEquals(true, validateFormatString.isValid("[{{{[[([()])]]}}}]{()}"));

        assertEquals(false, validateFormatString.isValid(null));
        assertEquals(false, validateFormatString.isValid(")"));
        assertEquals(false, validateFormatString.isValid("())"));
        assertEquals(false, validateFormatString.isValid("{(})"));
        assertEquals(false, validateFormatString.isValid("{([)})]"));
    }
}
