package StacksAndQueues;

//Problem can be solved in an easier possible way, and that too doing it with stack is a compulsion. And also if there are more than 1 celebrity in the party then this algorithm fail

public class CelebrityProblemUsingStack {
    public static boolean acquaintanceCelebrity(int arr[][], int x, int y){
        if (arr[x][y] == 1)
            return true;
        else
            return false;
    }
    public static int findCelebrity(int arr[][], int numberOfPerson){
        StacksBasicsOperation celebrityIntermediateStack = new StacksBasicsOperation(arr.length);
        int celebrity = -1;
        for (int i = 0; i < numberOfPerson; i++){
            celebrityIntermediateStack.pushInStack(i);
        }
        while (!celebrityIntermediateStack.isEmpty()){
            int xPerson = (Integer) celebrityIntermediateStack.popInStack();

            if (celebrityIntermediateStack.isEmpty()){
                celebrity = xPerson;
                break;
            }
            int yPerson = (Integer) celebrityIntermediateStack.popInStack();
            if (acquaintanceCelebrity(arr,xPerson,yPerson))
                celebrityIntermediateStack.pushInStack(yPerson);
            else
                celebrityIntermediateStack.pushInStack(xPerson);
        }
        return 0;
    }
}
