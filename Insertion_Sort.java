package arrayPractice;

public class Insertion_Sort {

	public static void main(String[] args) {
		int a []= {5,2,4,1,3,6,10,7,9,8};
		int temp;
		int j;
		for(int i = 0; i<a.length; i++) 
		{
			temp = a[i];
			j=i;
			while(j>0 && a[j-1] > temp) 
			{
				a[j]=a[j-1];
				j=j-1;	
			}
			a[j]=temp;
		}
		for(int i =0; i<a.length; i++) 
		{
			System.out.print(a[i]+" ");
		}
	}

}
