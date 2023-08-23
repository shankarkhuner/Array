package CSJ29Demo;

public class Array1 {

	private static int length;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = {15,10,20,45,16};
		for(int i = 0; i<a.length; i++) {
			
			for(int j = i+1; j<a.length; j++) {
				int temp=0;
				if(a[i]>a[j]) {
					temp = a[i];
					a[j]=temp;
					a[i]=a[j];
					
				}
			}
			}
				for(int k=0;k<a.length;k++)
				{
					System.out.print(a[k]+" ");
				}
				}
				
				//return a;
			}
			
			
		

	


