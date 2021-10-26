import java.util.*;

class LearnThread extends Thread //Used to extend thread class
{
	public void run(){
		System.out.println("In run state");
		try{
			for(int i=0; i<10; i++){
			System.out.println(i);
		    sleep(1000);			
		}
		
		}
		catch(Exception e){
		}
	} 

	public static void main(String[] args)
	{
		//Thread created
		LearnThread d = new LearnThread();
		d.start(); //It will trigger run()  method
	}
}