import java.util.Scanner;

public class String1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string: ");
		String st = sc.nextLine();
		int n = st.length();
		char first = st.charAt(0);
		char last = st.charAt(n-1);
		if (first == last) {
			System.out.println("Valid String");
		}
		else {
			System.out.println("Invalid");
		}
		sc.close();
	}

}
