import java.util.*;

class MultiArray
{
public void arrayPrint(int row, int column, int count)
{
	int[][] arr = new int[row][column];
	Scanner sc = new Scanner(System.in);
	for(int i=0; i<row; i++)
	{
		for(int j=0; j<column; j++)
		{
		arr[i][j] = sc.nextInt();
		}
	}
	//Priting matrix
	System.out.println("Matrix number "+ count+": ");
	for(int i=0; i<row; i++)
	{
		for(int j=0; j<column; j++)
		{
		System.out.print(arr[i][j]+" ");
		}
	System.out.println();
	}
	//diagonal elements
	System.out.print("Diagonal elements of matrix having size "+ arr.length+" are: ");
	
	for(int i=0; i<row; i++)
	{
		for(int j=0; j<column; j++){
	if(i==j){
	System.out.print(arr[i][j]+ " ");	
	}
		}
	}
	System.out.println();
}

public static void main(String[] args)
{
Scanner sc = new Scanner(System.in);
System.out.println("Enter number of matrix required:");
int num = sc.nextInt();
int row;
int column;
int count=0;
MultiArray n = new MultiArray();
	for(int i=0; i<num; i++)
	{
	System.out.println("Enter rows for "+ (i+1) +" matrix");
	row = sc.nextInt();
	System.out.println("Enter column for "+ (i+1) +" matrix");
	column = sc.nextInt();
	System.out.println("Enter values for "+(i+1) + " matrix");
	n.arrayPrint(row, column,count++);
	}
}
}
