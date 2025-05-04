package stackRelated;

import java.util.*;

public class BracketValidator {

    /*

      { ( ) }  or   {} ()   or  { ( [  ]  ) }
      last in first out
    * the whole logic will be build on when we get a closing bracket "}" to put it in stack
    * we need to check that the last element in the stack should be  opening of that bracket "{"
    * */

    /*
    * each closer responds to most recently seen opener
    * at last if stack is empty then everything is in pair and in perfect order
    * */

    /*
    * early case to find out fault
    * at any point if the popped out (recent seen) does not match with the current closing
    * means there is some fault
    * */



    public static void main(String[] args) {
        String onlyBrackets="{{[]}}";
        String completeCode="{{[if]}else}";
        validate(onlyBrackets);

        String[] split = onlyBrackets.split("");
        char[] chars = onlyBrackets.toCharArray();

    }

    private static boolean validate(String str) {


        Map<Character, Character> openersToClosers = new HashMap<>();
        openersToClosers.put('(', ')');
        openersToClosers.put('[', ']');
        openersToClosers.put('{', '}');

        Set<Character> openers = new HashSet<>(openersToClosers.keySet());
        Set<Character> closers = new HashSet<>(openersToClosers.values());

        Deque<Character> openersStack = new ArrayDeque<>();// a empty stack

        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (openers.contains(c)) {
                openersStack.push(c);
            } else if (closers.contains(c)) {
                if (openersStack.isEmpty()) {
                    return false;
                } else {
                    char lastUnclosedOpener = openersStack.pop();

                    // if this closer doesn't correspond to the most recently
                    // seen unclosed opener, short-circuit, returning false
                    if (openersToClosers.get(lastUnclosedOpener) != c) {
                        return false;
                    }
                }
            }
        }
        return openersStack.isEmpty();

    }
}
