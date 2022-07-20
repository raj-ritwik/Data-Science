import java.util.Scanner;

public class drive {
	int productDigits(int a) {
		int product = 1;
        
        while(a>0){
            int digit = a%10;
            
            product *= digit;
            
            a/=10;
        }
		return product;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		drive d = new drive();
		int num;
		Scanner sc=new Scanner(System.in);
		System.out.println("Distance travelled");
		num=sc.nextInt();
		
		System.out.println("win amount="+d.productDigits(num));

	}

}
