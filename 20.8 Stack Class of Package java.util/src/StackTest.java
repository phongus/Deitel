import java.util.Stack;
import java.util.EmptyStackException;

public class StackTest {
    public static void main(String[] args)
    {
        Stack< Number > stack = new Stack< Number >();  //  create a Stack

        //  use push method
        stack.push(12L);    //  push lang value 12L
        System.out.println("Pushed 12L");
        printStack(stack);
        stack.push( 34567 );    //  push int value 34567
        System.out.println("Pushed 34567");
        printStack(stack);
        stack.push( 1.0F ); //  push float value 1.0F
        System.out.println("Pushed 1.0F");
        printStack(stack);
        stack.push(1234.5678);  //  push double value 1234.5678
        System.out.println("Pushed 1234.5678");
        printStack(stack);

        //  remove items from stack
        try
        {
            Number removedObject = null;
            //  pop elements from stack
            while (true)
            {
                removedObject = stack.pop();    //  use pop method
                System.out.printf("Popped %s\n", removedObject);
                printStack(stack);
            }   //  end while
        }   //  end try
        catch (EmptyStackException emptyStackException)
        {
            emptyStackException.printStackTrace();
        }   //  end catch
    }   //  end main

    //  display Stack contents
    private static void printStack(Stack <Number> stack)
    {
        if (stack.isEmpty())
            System.out.println("stack is empty\n"); //  the stack is empty
        else    //  stack is not empty
            System.out.printf("stack contains: %s (top)\n", stack);
    }   //  end method printStack
}   //  end class StackTest
