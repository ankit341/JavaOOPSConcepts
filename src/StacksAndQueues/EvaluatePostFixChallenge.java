package StacksAndQueues;

public class EvaluatePostFixChallenge {
    public static int evaluatePostFix(String expression){
        StacksBasicsOperation stackToSolvePostfixToInFix = new StacksBasicsOperation(expression.length());
        int resultantInteger = Integer.MIN_VALUE;
        int index = 0;
        while (index != expression.length()){
            char intermediateChar = expression.charAt(index);
            int intermediateCharacterASCIICode = intermediateChar;
            if (intermediateCharacterASCIICode >= 48 && intermediateCharacterASCIICode <= 57)
                stackToSolvePostfixToInFix.pushInStack(intermediateChar);
            else {
                int number2 = Integer.parseInt(String.valueOf(stackToSolvePostfixToInFix.popInStack()));
                int number1 = Integer.parseInt(String.valueOf(stackToSolvePostfixToInFix.popInStack()));

                switch (intermediateChar) {
                    case '+':
                        stackToSolvePostfixToInFix.pushInStack(number1 + number2);
                        break;
                    case '-':
                        stackToSolvePostfixToInFix.pushInStack(number1 - number2);
                        break;
                    case '*':
                        stackToSolvePostfixToInFix.pushInStack(number1 * number2);
                        break;
                    case '/':
                        stackToSolvePostfixToInFix.pushInStack(number1 / number2);
                        break;
                }
            }
            index++;
        }
        resultantInteger = (Integer) stackToSolvePostfixToInFix.topElementInStack();
        return resultantInteger;
    }
    public static void main(String[] args) {
        String argumentString = "921*-8-4+";
        System.out.println(evaluatePostFix(argumentString));
    }
}