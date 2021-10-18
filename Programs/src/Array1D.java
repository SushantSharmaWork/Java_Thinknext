import java.util.*;

class Array1D
{

public static void main(String[] args)
{	
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter size of array");
	int size = sc.nextInt();
	int[] arr= new int[size];
	
	System.out.println("Enter values in array: ");
	for(int i=0; i<size; i++){
	int value = sc.nextInt();
	arr[i] = value;
	}
	System.out.println("Size of array:  " + arr.length);
	System.out.println("\nvalues in array:  ");
	for(int j=0; j< arr.length; j++)
	{
	System.out.println(arr[j]);
	}
	int evenCount =0;
	int[] even= new int[size];
	int[] odd= new int[size];
	int oddCount =0;
	for(int i =0; i<arr.length; i++)
	{
		if(arr[i]%2==0 && arr[i]!=0)
		{
		evenCount++;
		even[i]= arr[i];
		}
		else
		{
		oddCount++;
		odd[i]= arr[i];
		}
	}
	System.out.println("Even elements are:   ");
	for(int j=0; j<even.length; j++)
	{
	if(even[j]!=0){
	System.out.println(even[j]);
	}
	}
	System.out.println("Odd elements are:   ");
	for(int j=0; j<odd.length; j++)
	{
	if(odd[j]!=0){
	System.out.println(odd[j]);
	}
}
	
 	
}
}