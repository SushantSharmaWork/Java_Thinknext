import java.util.*;

class LearnDae extends Thread
{
	@Override
	public void run(){
		System.out.println("Inside run");
		if(Thread.currentThread().isDaemon()){
		System.out.println("Thread is daemon");
		}
		else {
		System.out.println("Thread is child");
		}
	}

	public static void main(String[] args){
		LearnDae d = new LearnDae();
		LearnDae d1 = new LearnDae();
		LearnDae d2 = new LearnDae();
		d.setDaemon(true);
		System.out.println("Inside main");
		d1.start();
		d.start();
		//d2.start();
	}
}
