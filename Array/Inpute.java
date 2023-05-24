/*import java.util.Scanner;

class Demo
{
	public static void main(String[] args)
	{
		System.out.println("Enter Value");
		Scanner sc = new Scanner(System.in);
		float a = sc.nextFloat();
		System.out.println(a+5);
	}
}
*/
// this way to gate inpute from useres.

import java.util.Scanner;

class Demo1
{
	public static void main(String[] args)
	{
		System.out.println("Enter Vlaid Number");
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		for(int i = 0;i<=a; i++){
			if(i % 2 == 0){
			System.out.println(i);
			}
		
		else{
			System.out.println();
		}
	
		}
		
	}
}