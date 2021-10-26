import java.util.*;

class LearnThread
{
	void run(){
		System.out.println("In run state");
	}
	
	public static void main(String[] args)
	{
		//Thread created
		LearnThread d = new LearnThread();
		d.start(); //It will trigger run()  method
	}
}