package myPack;
import java.util.*;

public class VariableStack implements Stack{
int myStack;
	public VariableStack()
	{
		myStack=10;
	}
public void push(int I)
	{
	myStack=myStack+I;
	System.out.println(myStack);
	}
public int pop()
	{
		myStack=myStack-1;
		return myStack;
	}
public static void main(String args[])
{
	VariableStack obj=new VariableStack();
	obj.push(10);
	int b=obj.pop();
	System.out.println("After popping once the stack becomes: " +b);
}	
}
