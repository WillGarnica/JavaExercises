package dataStructures.validate;

import java.util.Map;
import java.util.Stack;

public class ValidateFormatString {

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
            String currentLeter = text.charAt(i) + "";

            if (openCloseSymbols.values().contains(currentLeter)) {
                pendingOpenSymbols.add(currentLeter);
                continue;
            }

            if (openCloseSymbols.keySet().contains(currentLeter)) {
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
