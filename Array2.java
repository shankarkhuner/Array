package CSJ29Demo;

import java.util.Scanner;

public class Array2 {
	void display(int arr[])
	{
		for(int i=0; i<arr.length;i++) {
			System.out.println(arr[i]+" ");	
		}
	}
	int[] sort_Asc(int arr[]) {
		for(int i = 0; i<arr.length; i++) {
			for(int j = i+1; j<arr.length; j++) {
				if(arr[i] > arr[j]) {   // we can use this code as a asending order by changing the arrow as > to <
					int temp = arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
		return arr;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter size");
		int size = scan.nextInt();
		int arr[]= new int[size];
		System.out.println("Plz Enter Element Of An Array");
		for(int i =0;i<size;i++)
		{
			arr[i]=scan.nextInt();
		}
		Array2 ob = new Array2();
		System.out.println("Element of an array");
		ob.display(arr);
		System.out.println("After sorting ");
		int arr1[]=ob.sort_Asc(arr);
		ob.display(arr1);
	}
}
