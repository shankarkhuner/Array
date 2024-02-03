package arrayPractice;

import java.util.Scanner;

public class prime_sum_count {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number");
		int n = sc.nextInt();
		int count = 0;
		int sum = 0;
		
		for(int i = 1; i <= n; i++) 
		{
			if(n % i ==0) 
			{
				System.out.println(i);
				count = count+1;
				sum = sum+i;
				
			}
		}
		System.out.println("count :"+ count);
		System.out.println("sum :"+sum);
		
		if(count == 2) {
			System.out.println("Prime");
		}else {
			System.out.println("Not Prime");

		}
		

	}

}
