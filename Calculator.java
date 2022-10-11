package week1.day2;

public class Calculator
{
public void AddingTwoNumbers(int a,int b)
{
	int c=a+b;
	System.out.println(c);
}
public void SubtractingTwoNumbers(int e,int f) 
{
	int c=e-f;
	System.out.println(c);
}
public void MultiplyingTwoNumbers(int i,int j)
{
	int c=i*j;
	System.out.println(c);
}
public void DividingTwoNumbers(int x,int y)
{
	int c=x/y;
	System.out.println(c);
}

public static void main(String[] args)
{
	Calculator clc=new Calculator();
	clc.AddingTwoNumbers(25,20);
	clc.SubtractingTwoNumbers(10,15);
	clc.MultiplyingTwoNumbers(17,18);
	clc.DividingTwoNumbers(18,14);
}
	
	
	
}