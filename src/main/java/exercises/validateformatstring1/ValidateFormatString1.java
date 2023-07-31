package exercises.validateformatstring1;


import java.util.Map;
import java.util.Stack;

/**
 * Given a string that only contains the symbols ()[]{}, make a method that
 * returns true if the format is correct or false if it is not correct.
 * example:
 * () = true
 * (() = false
 * ()[]{} = true
 * ([{)]} = true
 * ([)] = false
 */
public class ValidateFormatString1 {

    Map<String, String> openCloseSymbols = Map.of(
            // keys are close symbols
            // values are open symbols

            ")", "(",
            "]", "[",
            "}", "{");

    boolean isValid(String text) {
        if (null == text)
            return false;

        if (text.trim().equals(""))
            return true;

        Stack<String> pendingOpenSymbols = new Stack<>();
        for (int i = 0; i < text.length(); i++) {
            String currentLeter = String.valueOf(text.charAt(i));

            if (openCloseSymbols.containsValue(currentLeter)) {
                pendingOpenSymbols.add(currentLeter);
                continue;
            }

            if (openCloseSymbols.containsKey(currentLeter)) {
                if (pendingOpenSymbols.empty())
                    return false;

                if (openCloseSymbols.get(currentLeter).equals(pendingOpenSymbols.peek()))
                    pendingOpenSymbols.pop();

                else
                    return false;
            }

            else {
                // symbol no allowed
                return false;
            }
        }
        return pendingOpenSymbols.empty();
    }
}