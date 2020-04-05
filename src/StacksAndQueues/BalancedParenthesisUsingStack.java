package StacksAndQueues;

public class BalancedParenthesisUsingStack {
    public static boolean isBalanced(String exp) {
        boolean isBalanced = false;
        int lengthOfString = exp.length();
        StacksBasicsOperation parenthesisStack = new StacksBasicsOperation(lengthOfString);
        int indexCounter = 0;
        while (indexCounter <lengthOfString){
            int intermediateCharacterASCII = exp.charAt(indexCounter);
            if (parenthesisStack.isEmpty())
                parenthesisStack.pushInStack(intermediateCharacterASCII);
            else if(intermediateCharacterASCII == 41 || intermediateCharacterASCII == 93 || intermediateCharacterASCII == 125){
                switch (intermediateCharacterASCII){
                    case 41:
                        if ((Integer) parenthesisStack.topElementInStack() == 40)
                            parenthesisStack.popInStack();
                        else
                            parenthesisStack.pushInStack(intermediateCharacterASCII);
                        continue;
                    case 93:
                        if ((Integer) parenthesisStack.topElementInStack() == 91)
                            parenthesisStack.popInStack();
                        else
                            parenthesisStack.pushInStack(intermediateCharacterASCII);
                        continue;
                    case 125:
                        if ((Integer) parenthesisStack.topElementInStack() == 123)
                            parenthesisStack.popInStack();
                        else
                            parenthesisStack.pushInStack(intermediateCharacterASCII);
                        continue;
                }
            } else
                parenthesisStack.pushInStack(intermediateCharacterASCII);
            indexCounter++;
        }
        isBalanced = parenthesisStack.isEmpty();
        return isBalanced;
    }
    public static void main(String[] args) {
        String stringArgument = "{{{()}}}";
        boolean resultantAnswer = isBalanced(stringArgument);
        System.out.println(resultantAnswer);
    }
}
