package studio3;

import java.util.Scanner;

public class Sieve {

	public static void main(String[] args) {
		
		
		Scanner in = new Scanner(System.in);
		int n;  //maxiumNumber
		System.out.println("input the max number you need");
		n = in.nextInt();
		int i;       //initialize true and false
		int f;       //as the factor
		int j;		 //judge the number
		boolean[] primeNumber = new boolean[n+1];
		
		for(i = 0; i <= n; i++)
		{
			primeNumber[i] = true;
		}
		
		for(f = 2; f * f <= n; f++)
		{
			for(j = f * f; j <= n; j=j+f)
			{
				primeNumber[j] = false;
			}
		}
		
		for(i = 2; i <= n; i++)
		{
			if (primeNumber[i] == true)
					System.out.println(i + " is prime number!");
		}
		
		
		

	}

}
