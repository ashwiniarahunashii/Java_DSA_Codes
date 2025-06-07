package Java_DSA_Codes.arrays_problems;

import java.util.*;
public class ArmstrongNum {
	public static void main(String[] args) {
		
		//Armstrong number means for 
		//ex:153 --> add the cube of all 3 digits (1^3 + 5^3 +3^3)=153 if u get same number that is Armstrong number
		
		Scanner in=new Scanner(System.in);
//		System.out.println("Enter 3 digit number : ");
//		int n=in.nextInt();
//      System.out.println(isarmstrong(n));                // This will check whether entered number is Armstrong number or not               
		
		
		for(int i=100;i<1000;i++)                          // this will print all the 3-digit Armstrong numbers  
		{
			if(isarmstrong(i))
				System.out.println(i + " ");
		}		
	}
   
	static boolean isarmstrong(int n)
	{
		int original=n;
		int sum=0;
		while(n>0)
		{
			int rem=n%10;
			sum= sum +rem*rem*rem;                            //for 2-digit rem*rem;
			n=n/10;
			
		}
		return sum==original;
	}
	
}


