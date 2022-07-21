import java.util.Scanner;

public class String4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the string 1: ");
		String str1=sc.nextLine();
		
		System.out.println("Enter the string 2: ");
		String str2=sc.nextLine();
		String str3="";
		int n1,n2;
		n1=str1.length();
		n2=str2.length();
		if(n1==n2) {
			str3=str1+str2;
		}
		else if(n1>n2) {
			str1=str1.substring(n1-n2,n1);
			str3=str1+str2;
		}
		else {
			str2=str2.substring(n2-n1,n2);
	        str3=str1+str2;
		}

	
	System.out.println("New String: "+str3);
	sc.close();
}
}


