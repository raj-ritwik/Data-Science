import java.util.Scanner;

public class String5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the string: ");
		String str=sc.nextLine();
		char ch[]=str.toCharArray();
		String str1="";
		int n=str.length();
		for(int i=0;i<n;i++){
			if(Character.isAlphabetic(ch[i])) {
				str1="";
			}
			else if(ch[i]==' ') {
				str1+="";
			}
			else {
				str1+=ch[i];
			}
			
		}
		System.out.println(str1);
		sc.close();

	}

}
