package javalearning;

import java.util.Scanner;

public class ArmStrongNumber {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("enter number: ");
		
		int num = input.nextInt();
		
		int sum =0;
		
		int rem;
		
		while (num > 0)
		{
			rem = num % 10;
			
			int  i = rem * rem * rem;
			
			sum = sum + i;
			
			num = num / 10;
		}
		
		System.out.println(sum);
		
		if (sum != num)
			
		{
			System.out.println("The number is not armstrong");
		}
		else
		{
			System.out.println("Is Armstrong");
		}
	}

}
