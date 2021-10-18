import java.util.*;

class Pattern
{
//----------Name---------------------------------------
	public void one()
	{
	for(int a=0; a<6; a++)
	{
		System.out.print("-"+"-");
	}
	System.out.println("-");
	}

	public void two()
	{
	for(int a=0; a<6; a++)
	{
		System.out.println("|");
	}
	System.out.println("|");
	}

	public void three()
	{
	for(int a=0; a<6; a++)
	{
		for(int b=0; b<6; b++)
		{
		System.out.print("  ");
		}
	System.out.println("|");
	}
	}
	
	public void twoThree()
	{
	for(int a=0; a<6; a++)
	{
	System.out.print("|");
		for(int b=0; b<5; b++)
		{
		System.out.print("  ");
		}
	System.out.println(" |");
	}
	}

	public void n()
	{
	for( int a=0; a<12; a++)
	{
	System.out.print("|");
		for(int b=0; b<a; b++)
		{
		System.out.print(" ");
		}
	System.out.print("\\");
		for(int c=10; c>(a-1); c--)
		{
		System.out.print(" ");
		}
	System.out.println("|");
	}
	}

	public void t()
	{
	for(int a=0; a<6; a++)
	{
	System.out.print("--");
	}
	System.out.println("-");
	for(int b=0; b<10; b++)
	{
		for(int c=0; c<3; c++)
		{
		System.out.print("  ");
		}
	System.out.println("|");
	}
	}
	
	


//------------main-----------------------------------------------
	public static void main(String[] args){
	System.out.println("First Triangle :\n");

	for(int i=0; i<6; i++)
	{
		for(int j=0; j<i; j++)
		{
		System.out.print("*" + " ");
		}
	System.out.println("*");
	}
//----------------------------------------------------
	System.out.println("\nSecond Triangle :\n");
	for(int k=0; k<6; k++)
	{
		for(int l=5; l>k; l--)
		{
		System.out.print("  ");
		}
		for(int m=0; m<k; m++)
		{
		System.out.print("*" +" ");
		}
	System.out.println("*");
	}
//-----------------------------------------------------
	System.out.println("\nDiamond :\n");
	for(int n=0; n<5; n++)
	{
		for(int o=5; o>n; o--)
		{
		System.out.print("  ");
		}
		for(int p=0; p<(n); p++)
		{
		System.out.print("*" +" "+ "*" +" ");
		}
	System.out.println("*");
	}
	for(int q=0; q<6; q++)
	{
		for(int r=0; r<q; r++)
		{
		System.out.print("  ");
		}
		for(int s=5; s>q; s--)
		{
		System.out.print("*"+" "+"*"+" ");
		}
	System.out.println("*");
	}
//------------------------------------------------------
	System.out.println("\nMy name :\n");	
	Pattern p = new Pattern();
	//s
	p.one();
	p.two();
	p.one();
	p.three();
	p.one();
	System.out.println("\n\n");
	//u
	p.twoThree();
	p.twoThree();
	p.one();
	System.out.println("\n\n");
	//s
	p.one();
	p.two();
	p.one();
	p.three();
	p.one();
	System.out.println("\n\n");
	//h
	p.twoThree();
	p.one();
	p.twoThree();
	System.out.println("\n\n");
	//a
	p.one();
	p.twoThree();
	p.one();
	p.twoThree();
	System.out.println("\n\n");
	//n
	p.n();
	System.out.println("\n\n");
	//t
	p.t();
}
}