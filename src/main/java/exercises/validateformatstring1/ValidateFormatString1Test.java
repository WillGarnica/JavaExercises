package exercises.validateformatstring1;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class ValidateFormatString1Test {

    @Test
    public void isValid() {
        ValidateFormatString1 validateFormatString = new ValidateFormatString1();
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
