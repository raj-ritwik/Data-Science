import java.util.Scanner;

public class String2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String first, last,finalst;
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the string: ");
		String st = sc.nextLine();
		System.out.println("Enter n: ");
		int n = sc.nextInt();
		int len = st.length();
		first = st.substring(0,len);
		last = st.substring(len-n,len);
		finalst = first+last;
		System.out.println("The final string is: "+finalst);

	}

}
