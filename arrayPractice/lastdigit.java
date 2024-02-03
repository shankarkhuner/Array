package arrayPractice;

public class lastdigit {
	// if we wont to get last two digit of the N number then we (n%100), if three digit then  (n%1000)
	// It will give you just last digit if we divide by 10

	public static void main(String[] args) {
		int n =12345;
		//System.out.println(n%100); to get last digit



// to remove last digit
  n = n/10;
 System.out.println(n);
	}

}