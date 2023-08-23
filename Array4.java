package CSJ29Demo;
import java.util.Scanner;
public class Array4 {
	
	void display(int arr[][], int row, int col)
	{
		for(int i=0;i<row;i++)
		{
		for(int j=0; j<col;j++) 
		{
			System.out.print(arr[i][j]+" ");	
		}
		System.out.println();
		}
	}
	int[] sort_Asc(int arr[]) {
		for(int i = 0; i<arr.length; i++) {
			for(int j = i+1; j<arr.length; j++) {
				if(arr[i] < arr[j]) {
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
		System.out.println("Enter row");
		int row = scan.nextInt();
		System.out.println("Enter col");
		int col = scan.nextInt();
		int arr[][]= new int[row][col];
		System.out.println("Plz Enter Element Of An Array");
		for(int i =0;i<row;i++)
		{
		for(int j=0;j<col;j++) {
			arr[i][j]=scan.nextInt();
		}
		}
		Array4 ob = new Array4();
		System.out.println("Element of an array");
		ob.display(arr, row, col);
	}
}
