import java.util.*;

class dArray
{

public static void main(String[] args)
{

Scanner sc = new Scanner(System.in);

System.out.println("Enter size of first matrix: ");
int first = sc.nextInt();
System.out.println("Enter size of second matrix: ");
int second = sc.nextInt();
int[][] a = new int[first][first];
int[][] b = new int[second][second];

System.out.println("Enter 1st matrix values: ");
for(int i=0; i<first; i++)
{
	for(int j=0; j<first; j++)
	{
	a[i][j] = sc.nextInt();
	}
}
System.out.println("Enter 2st matrix values: ");
for(int i=0; i<second; i++)
{
	for(int j=0; j<second; j++)
	{
	b[i][j] = sc.nextInt();
	}
}
int sum;
int big = 0;
int small = 0;
System.out.println("After adding: ");
if(first > second)
{
	big = first;
	small = second;
}
else{
big = second;
small = first;
}

for(int i=0; i<2; i++)
{
	for(int j=0; j<2; j++)
	{
	 sum = a[i][j] + b[i][j];
	System.out.print(sum + " ");
	}
	System.out.println();
}
}
}