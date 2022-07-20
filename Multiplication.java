import java.util.Scanner;

public class Multiplication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num, row;
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the number");
		num = scan.nextInt();
		System.out.println("Enter the rows");
		row = scan.nextInt();
        for(int i = 1; i <= row; ++i)
        {
            System.out.printf("%d * %d = %d \n", num, i, num * i);
        }

	}

}
