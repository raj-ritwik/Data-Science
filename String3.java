import java.util.Scanner;

public class String3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the string: ");
		String str=sc.nextLine();
		int n=str.length();
		String str1="";
		for(int i=0;i<n;i++) {
			if(i%2!=0) {
				if(str.charAt(i)=='a'||str.charAt(i)=='a'||str.charAt(i)=='A'||str.charAt(i)=='e'||str.charAt(i)=='E'||str.charAt(i)=='i'||str.charAt(i)=='I'||str.charAt(i)=='o'||str.charAt(i)=='O'||str.charAt(i)=='u'||str.charAt(i)=='U') {
					str1+="";
				}
				else {
					str1+=str.charAt(i);
				}
			}
			else {
				str1+=str.charAt(i);
			}
		}
		System.out.println(str1);
		sc.close();

	}

}
