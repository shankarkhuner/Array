package arrayPractice;

import java.util.Arrays;
import java.util.Scanner;


// To fine missing element 

public class Missing_Element_In_array {
	/*
	static void display(int [] arr)
	{
		for(int i=0; i<arr.length; i++)
		{
			Arrays.sort(arr);
			System.out.println(arr[i]);
		}		
	}
	
	static int secLarge(int[] arr)
	{
		int n=arr.length;
		int secLar=arr[n-1];
		int count=1;
		
		for(int i=n-2; i>=0; i--)
		{
			if(arr[i] != secLar)
			{
				secLar=arr[i];
				count++;
			}
			if(count==2)
			{
				break;
			}
		}
		return secLar;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Enter arr size");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int [] arr=new int[n];
		System.out.println("Enter element");
	    for(int i=0; i<arr.length; i++)
	    {
	    	arr[i]=sc.nextInt();
	    }
	    
	    display(arr);
	    
	    int ele=secLarge(arr);
	    System.out.println("Second large element is "+ele);

	}
*/
	
	
	

	    public static int findMissingInteger(int[] arr) {
	        int n = 100; // highest number in the range
	        int expectedSum = (n * (n + 1)) / 2; // sum of integers from 1 to 100

	        int actualSum = 0;
	        for (int num : arr) {
	            actualSum += num; // sum of elements in the array
	        }

	        int missingInteger = expectedSum - actualSum;
	        return missingInteger;
	    }

	    public static void main(String[] args) {
	        int[] myArray = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12,13,14,15,16,17,18,19,20,21,22,23,24,25,26,27,28,29,30,31,32,33,34,35,36,37,38,39,40,41,42,43,44,45,46,47,48,49,50,51,52,53,54,55,56,57,58,59,60,61,62,63,64,65,66,68,69,70,71,72,73,74,75,76,77,78,79,80,81,82,83,84,85,86,87,88,89,90,91,92,93,94,95,96,97,98,99, 100};
	        int missingNumber = findMissingInteger(myArray);
	        System.out.println("The missing integer is: " + missingNumber);
	    }
	}


