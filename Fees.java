import java.util.Scanner;

public class Fees {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		float marks =0;
		double fees=5000;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 10th marks");
		marks = sc.nextInt();
		
		if(marks>90)
		{
			fees = fees-(fees*0.5);
		}
		else if(marks>81 && marks<90)
		{
			fees = fees-(fees*0.25);
		}
		else if(marks>70 && marks<80)
		{
			fees = fees-(fees*0.1);
		}
		
		System.out.println("The fees is"+fees);

	}

}
