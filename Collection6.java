import java.util.Scanner;

public class Collection6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a string : ");
		String str=sc.next();
		if(str.charAt(0)=='j') {
			if(str.charAt(1)=='b') {
				System.out.println("Answer : "+str);
			}
			else {
				System.out.println("Answer : "+str.substring(0,1).concat(str.substring(2,str.length())));
			}
		}
		else {
			if(str.charAt(1)=='b') {
				System.out.println("Answer:"+str.substring(1,str.length()));
			}
			else {
				System.out.println("Answer : "+str.substring(2,str.length()));
			}
		}
		sc.close();

	}

}
