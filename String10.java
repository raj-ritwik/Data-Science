import java.util.Scanner;

public class String10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int m=0;

		Scanner input = new Scanner(System.in); 
		System.out.println("Enter the String: "); 
		String str = input.nextLine(); 
		String[] strArray = str.split(" ");

		int n = strArray.length;

		if (strArray[0].length()==strArray[n-1].length()) { 
			m = strArray[0].length();

		}

		else {

		m = strArray[0].length()+strArray[n-1].length(); }

		System.out.println("No of elements are "+m); input.close();

		}

	}

