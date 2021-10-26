import java.util.*;

abstract class Auto
{
	abstract void car();
	
	 int fun(){
	System.out.println("New State");
	return 1;
	}
}

class main1 extends Auto{
	
	@Override
	void car(){
		System.out.println("Ferrari");
	}
	
	public static void main(String[] args)
	{
		main1 car1 = new main1();
		car1.car();
	    System.out.println(car1.fun());
	}
}