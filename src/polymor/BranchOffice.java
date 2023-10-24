package polymor;

public class BranchOffice 
{
public void method1(int a,int b)
{
	System.out.println("starts with "+ a +b);
	
}public   void method1(String c,int d)
{
	System.out.println("starts with "+ c +d);
	
}
public static void main(String[] args) {
	BranchOffice b=new BranchOffice();
	
	b.method1(10, 200);
	
	b.method1("magesh", 30);
}

}
