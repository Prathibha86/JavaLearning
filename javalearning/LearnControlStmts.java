package javalearning;

public class LearnControlStmts {

	public static void main(String[] args) {
		
		
		int age = 61;
		
		if( age < 18)
		{
			System.out.println("Minor");
		}
		else if(age>18 && age < 60)
		{
			System.out.println("Adult");
		}
		
		else
		{
			System.out.println("Senior Citizen");
		}

	}

}
