package exercises.validateformatstring1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class ValidateFormatString1Test {

    @Test
    public void isValid() {
        ValidateFormatString1 validateFormatString = new ValidateFormatString1();
        assertTrue(validateFormatString.isValid(""));
        assertTrue(validateFormatString.isValid("()"));
        assertTrue(validateFormatString.isValid("[()]"));
        assertTrue(validateFormatString.isValid("{()}"));
        assertTrue(validateFormatString.isValid("[]{}()"));
        assertTrue(validateFormatString.isValid("[{()}]"));
        assertTrue(validateFormatString.isValid("[{{{[[([()])]]}}}]{()}"));

        assertFalse(validateFormatString.isValid(null));
        assertFalse(validateFormatString.isValid(")"));
        assertFalse(validateFormatString.isValid("())"));
        assertFalse(validateFormatString.isValid("{(})"));
        assertFalse(validateFormatString.isValid("{([)})]"));
    }
}