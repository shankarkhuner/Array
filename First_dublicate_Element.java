package arrayPractice;

public class First_dublicate_Element {

	public static void main(String[] args) {
		int a[] = {1,2,4,8,7,3,7,5,9};
		int temp=0;
		// To find first duplicate element in array we have build
		//logic like i is always less then j so we have to write i-1 
		
		
		
		// Note:- if lacks of element is present in array then its not efficient way to solve 
		
		
		
		for(int i=0; i<a.length; i++) 
		{
			for(int j=i+1; j<a.length; j++) 
			{
				if(a[i]==a[j] && i!=j) 
				{
					temp=temp+1;
					System.out.println("First duplicate element is: "+a[j]);
					break;
				}
			}
			if(temp>0) 
			{
				
			}
		}
	}

}
