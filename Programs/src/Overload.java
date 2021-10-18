import java.util.*;

class Overload
{
	//overloading
	int Add(int a, int b)
	{
	return a+b;	
	}
	int Add(int a, int b, int c)
	{
	return a+b+c;	
	}
	//overriding
	String Add(String a, String b)
	{
	return a+b;	
	}
	
	public static void main(String[] args)
	{
		Overload obj = new Overload();
		System.out.println(obj.Add(2,3));
		System.out.println(obj.Add(2,3,5));
		System.out.println(obj.Add("Sushant ","Sharma"));
	}
}