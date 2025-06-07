package Java_DSA_Codes.arrays_problems;

public class FactorsOfN {
    
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//factors means all numbers that divides num n
		int n=15;
		for(int i=1;i<=n;i++)
		{
			if(n%i==0)
			   System.out.println(i);
			
		}

	}

}
