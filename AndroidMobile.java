package week1.day2;

public class AndroidMobile 
{
	public void SendMessage()
	{
		System.out.println("SendMessage");
	}
public void call()
{
	System.out.println("call");
}
public void sharedocument()
{
	System.out.println("Share Document");
}
public static void main(String[] args)
{
	AndroidMobile act=new AndroidMobile();
	act.SendMessage();
	act.call();
	act.sharedocument();
}
}
