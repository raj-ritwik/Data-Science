import java.util.Scanner;

public class String8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);

		System.out.print("Enter the first string: ");

		String str1=input.next();

		int len1=str1.length();

		System.out.print("Enter the second string: ");

		String str2=input.next();

		int len2=str2.length();

		if(len1>len2)
		{

			System.out.println("Output string is: "+(str1.concat(str2.concat(str1))));

			}

			else if (len2>len1) {

			System.out.println("Output string is: "+(str2.concat(str1.concat(str2))));

			}

			else {

			System.out.println("Length of both strings are same");

			}

			input.close();

	}

}
