package myPack;

public class FixedStack implements Stack {
	int myStack;
	int fixval;
	public FixedStack()
	{
		fixval=10;
	}
	
public void push(int I)
	{
		myStack=myStack+I;
		System.out.println(myStack);
		if(myStack<=fixval)
		{System.out.println("This is fine");}
	else
		{System.out.println("Stack Overflow");}
	}
public int pop()
	{
	fixval=fixval-1;
	if (fixval==0)
	{System.out.println("Stack is empty");
	return fixval;}
	else {return fixval;}
	}
	public static void main(String args[])
	{
		FixedStack obj=new FixedStack();
		obj.push(15);
		int b=obj.pop();
		System.out.println("After popping once the stack becomes: "+b);
	}
}
