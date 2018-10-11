import java.util.Map;

public class Brackets {


    private static Map<Character, Character> bracketsMap = Map.ofEntries(
            Map.entry('(', ')'),
            Map.entry('[', ']'),
            Map.entry('{', '}'),
            Map.entry('<', '>')
    );


    private static int checkBracketsInternal(String phrase, int openingIndex) {
        int closingIndex = openingIndex + 1;

        if (closingIndex < 0 || closingIndex >= phrase.length()) {
            return -1;
        }

        while (!Brackets.bracketsMap.containsValue(phrase.charAt(closingIndex))) {
            if (Brackets.bracketsMap.containsKey(phrase.charAt(closingIndex))) {
                closingIndex = checkBracketsInternal(phrase, closingIndex);
            } else {
                closingIndex++;
            }

            if (closingIndex < 0 || closingIndex >= phrase.length()) {
                return -1;
            }
        }

        if (phrase.charAt(closingIndex) != Brackets.bracketsMap.get(phrase.charAt(openingIndex))) {
            return -1;
        }

        return closingIndex + 1;
    }

    public static boolean checkBrackets(String phrase) {
        int openingIndex = 0;

        while (openingIndex < phrase.length()) {
            if (Brackets.bracketsMap.containsKey(phrase.charAt(openingIndex))) {
                openingIndex = checkBracketsInternal(phrase, openingIndex);

                if (openingIndex < 0) {
                    return false;
                }
            } else if (Brackets.bracketsMap.containsValue(phrase.charAt(openingIndex))) {
                return false;
            } else {
                openingIndex++;
            }
        }

        return openingIndex == phrase.length();
    }


//    public static boolean checkBrackets(String phrase) {
//        Stack stack = new Stack<Character>();
//
//        for (int i = 0; i < phrase.length(); i++) {
//            char current = phrase.charAt(i);
//
//            if(Brackets.bracketsMap.containsKey(current)) {
//                stack.push(current);
//            }
//            else if (Brackets.bracketsMap.containsValue(current)) {
//                if(stack.empty()) {
//                    return false;
//                }
//
//                char openingBracket = (char)stack.pop();
//
//                if(current != bracketsMap.get(openingBracket)) {
//                    return false;
//                }
//            }
//        }
//
//        return stack.empty();
//    }
}
