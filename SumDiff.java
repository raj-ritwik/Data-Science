import java.util.Scanner;

public class SumDiff {
	public static int Square_Diff(int n){
		 
		int l, k, m;
		    
		    l = (n * (n + 1) * (2 * n + 1)) / 6;
		     
		    k = (n * (n + 1)) / 2;
		 
		    k = k * k;
		     
		    m = Math.abs(l - k);
		     
		    return m;
		 
		}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n;
		Scanner sc = new Scanner(System.in);		
		System.out.println("\n Please Enter any Number: ");
		n = sc.nextInt();
	    System.out.println(Square_Diff(n));    
	     

	}

}
