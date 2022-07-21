import java.util.Scanner;

public class String9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum = 0;

		Scanner input = new Scanner(System.in); System.out.println("Enter the String: ");

		String str = input.next();

		char ch[]=str.toCharArray();

		int a;

		for (int i=0;i<str.length();i++) {

		if (ch[i]=='1' || ch[i]=='3' || ch[i]=='5' || ch[i]=='7' || ch[i]=='9') { a=ch[i]-'0';

		sum+=a;

		}

		}

		System.out.println("No of elements are "+sum);

		input.close();

	}

}
