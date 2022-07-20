import java.util.Scanner;

public class SumOfOddDigits {

  public static int findOddDigitSum(int number) {

     int lastDigit = 0;
     int oddDigitSum = 0;

     while(number!=0) {

         lastDigit = number%10;

         if(lastDigit % 2 != 0) {
            oddDigitSum += lastDigit;
         }

         number = number / 10;
      }

      return oddDigitSum;
  }

  public static void main(String[] args) {

      int number = 0;
      int sumOf = 0;

      Scanner scan =  new Scanner(System.in);

      System.out.print("Enter an integer number::");
      number = scan.nextInt();

      sumOf = findOddDigitSum(number);

      System.out.println("The sum of odd digits of"+" the number "+number+" = "+ sumOf);

      // close Scanner class object
      scan.close();
  }
}
