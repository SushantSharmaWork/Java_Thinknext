import java.util.*;

class VLC
{
public static void main(String[] args)
{
	Music m = new Music();
	Video v = new Video();
	m.start();
	try{
		m.join();
	}
	catch(Exception e){}
	
	v.start();
	try{
		v.join();
	}
	catch(Exception e){}
}
}

class Music extends Thread{
	public void run(){
		System.out.println("Music is playing");
		System.out.println(Thread.currentThread().getName());
		Thread.currentThread().setName("Thread01");
		System.out.println(Thread.currentThread().getName());
	}
}

class Video extends Thread{
	public void run(){
		System.out.println("Video is playing");
		System.out.println(Thread.currentThread().getName());
		Thread.currentThread().setName("Thread02");
		System.out.println(Thread.currentThread().getName());

	}
}