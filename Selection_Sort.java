package arrayPractice;

public class Selection_Sort {

	public static void main(String[] args) {
		/*swap 38 to 6
		 * 38,52,9,18,6,62,13
		 * again next 52 chick smallest in all element is 9 so its replace it by 52 yo 9 
		 * 6,52,9,18,38,62,13
		 * again chick for 52 means 3rd index and the smallest in remaining element is 13 so 52 to 13
		 * 6,9,52,18,38,62,13
		 * 6,9,13,18,38,62,52
		 * 6,9,13,18,38,62,52
		 * 6,9,13,18,38,62,52
		 * 6,9,13,18,38,52,62
		 * 
		 * 
		 * 
		 * */
		
		int[] a = {38,52,9,18,6,62,13};
		int min = 0;
		int temp =0;
		for(int i=0; i<a.length; i++) 
		{
			min=i;// for original value of i 
			for(int j=i+1; j<a.length;j++) 
			{
				if(a[j] < a[min]) 
				{
					min=j; // min=2
				}
			}
			temp =a[i];
			a[i] = a[min];
			a[min] = temp;
		}
		for(int i=0; i<a.length; i++) 
		{
			System.out.print(a[i] +" ");
		}

	}

}
