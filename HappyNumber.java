
/* Happy Number : a happy number is a number which eventually reaches 1
 *  when replaced by the sum of the square of each digit */
 
package javachallenge;

import java.util.Scanner;

public class HappyNumber {
		
		public static void main (String args[]) {
			 boolean happyNum = true;
			 boolean notHappyNum = false;
				
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter the Number : ");
			int num = sc.nextInt();
			
			HappyNumber obj = new HappyNumber();
			
			int temp = num ;
			while (temp > 9)
			{
				temp = obj.sumSqDigit(temp);
			}
			if(temp==1) {
				System.out.println("is " +num + " Happy Number? : " +happyNum);
			}
			if(temp!=1) {
				System.out.println("is " +num + " Happy Number? : " +notHappyNum);
			}
			
		
			
			
		}
		public int sumSqDigit(int num) {
			int sum =0;
			while(num!=0)
			{
				int digit = num % 10;
				 sum	  = digit * digit ;
				num = num/10;
			}
			return sum;
			
		}
}
