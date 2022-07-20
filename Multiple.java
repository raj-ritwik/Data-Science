import java.util.Scanner;

public class Multiple {
	public static int AvgMultiple(int num) {
		int m = num / 5;
		 
	    // sum of first m natural numbers
	    int sum = m * (m + 1) / 2;
	 
	    // sum of multiples
	    int ans = 5 * sum;
	 
	    return (ans/m);
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int number,Avg=0;
		Scanner scan =  new Scanner(System.in);

	      System.out.print("Enter an integer number::");
	      number = scan.nextInt();
	      
	      Avg = AvgMultiple(number);
	      System.out.println("The average="+ Avg);

	}

}
