package Java_DSA_Codes.arrays_problems;
import java.util.Scanner;
// Fibonacci Series in Java
public class FibonacciSeries {

  public static void main(String[] args){
	  Scanner sc=new Scanner(System.in);
      int n=sc.nextInt();
	  int first_num=0;
	  int sec_num=1;
	  for (int i=1;i<=n;i++)
	  {
		int next_num= first_num +sec_num;  
		first_num=sec_num;
		sec_num=next_num;
		System.out.println(next_num);
	  }
	  
	  
	  
	 // To know the nth fibbo digit this is program
//	  Scanner sc=new Scanner(System.in);
//	  int n=sc.nextInt();
//	  int a=0;
//	  int b=1;
//	  int count=2;
//	  while(count<=n)
//	  {
//	  	int temp=b;
//	  	b=b+a;
//	  	a=temp;
//	  	count++;
//	  }
//	  System.out.println(b);       

	  
  }
}

