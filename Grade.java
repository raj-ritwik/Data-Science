import java.util.Scanner;

public class Grade {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[];
		int i;
		float total=0, avg;
		Scanner scanner = new Scanner(System.in);
		System.out.println("enter marks in 5 subjects");
		a= new int[5];
		for (i = 0; i < 5; i++) {
			a[i] = scanner.nextInt();
			total = total + a[i];
		}
		
		avg = total/5;
        System.out.print("The Grade of university is: ");
        if(avg>80)
        {
            System.out.print("First Grade University");
        }
        else if(avg>60 && avg<80)
        {
           System.out.print("Second Grade University");
        } 
        else
        {
            System.out.print("Third Grade University");
        }

	}

}
