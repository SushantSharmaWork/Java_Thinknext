import java.util.*;

class Bank 
{
	float interest(){
		
		return (0.0F);
	}
}

class SBI extends Bank
{
	float interest()
	{
	return (5.5F);	
	}
}

class ICICI extends Bank
{
	float interest()
	{
		return (4.5F);
	}
}

class HDFC extends Bank
{
	float interest()
	{
		return (6.8F);
	}
	
	public static void main(String[] args)
	{
		Bank in1 = new Bank();
		System.out.println("Bank "+in1.interest());
		SBI in2 = new SBI();
		System.out.println("SBI "+ in2.interest());
		ICICI in3 = new ICICI();
		System.out.println("ICICI "+in3.interest());
		HDFC in4 = new HDFC();
		System.out.println("HDFC "+in4.interest());
	}
}
