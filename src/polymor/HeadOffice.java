package polymor;

public class HeadOffice extends  BranchOffice
{
public  void method1(int a,int b)
{
System.out.println("starts with "+ a +b);
}

public   void method1(String c,int d)
{
	System.out.println("starts with "+ c +d);
	
}
public void method1(int accno , String name)
{
	System.out.println("account number is "+accno +name);
}
public void method1(long accno , String name)
{
	System.out.println("account number is "+accno +name);
}



}
