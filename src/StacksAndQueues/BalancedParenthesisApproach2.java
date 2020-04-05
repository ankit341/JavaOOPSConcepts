package StacksAndQueues;

public class BalancedParenthesisApproach2 {
    public static boolean isBalanced(String expression){
        int lengthOfString = expression.length();
        StacksBasicsOperation<Character> intermediateStack = new StacksBasicsOperation(lengthOfString);
        int indexCounter = 0;
        boolean isBalanced = false;

        while (indexCounter < lengthOfString){
            Character characterOfString = expression.charAt(indexCounter);
            if (characterOfString == '}' || characterOfString == ']' || characterOfString == ')'){
                if (intermediateStack.isEmpty())
                    isBalanced = false;
                if ((characterOfString == ')' && intermediateStack.popInStack() != '(') ||
                        (characterOfString == '}' && intermediateStack.popInStack() != '{') ||
                        (characterOfString == ']' && intermediateStack.popInStack() != '['))
                    isBalanced = false;
            } else
                intermediateStack.pushInStack(characterOfString);
            indexCounter++;
        }
        if (intermediateStack.isEmpty())
            isBalanced = true;
        else
            isBalanced = false;

        return isBalanced;
    }

    public static void main(String[] args) {
        String stringArgument = "{{{()}}}";
        boolean resultantAnswer = isBalanced(stringArgument);
        System.out.println(resultantAnswer);
    }
}
