import java.util.Scanner;

public class Count {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int countP=0, countN=0, countZ=0, i,n;
	      int[] arr = new int[10];
	      Scanner scan = new Scanner(System.in);
	      System.out.print("Enter the count of Numbers: ");
	      n= scan.nextInt();
	      System.out.print("Enter Numbers: ");
	      for(i=0; i<n; i++)
	         arr[i] = scan.nextInt();
	      
	      for(i=0; i<n; i++)
	      {
	         if(arr[i]<0)
	            countN++;
	         else if(arr[i]>0)
	            countP++;
	         else
	            countZ++;
	      }
	      
	      System.out.println("\nTotal Positive Number: " +countP);
	      System.out.println("Total Negative Number: " +countN);
	      System.out.println("Total Zero: " +countZ);


	}

}
