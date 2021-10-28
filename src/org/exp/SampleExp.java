package org.exp;

public class SampleExp {
	public static void main(String[] args) {
		
		try
		{
		
			System.out.println("1");
			int sum = 9 / 0;
			System.out.println("2");
		}
		
		catch (ArithmeticException e) 
		{
				System.out.println("3");
				
			}
		
		 catch (Exception e) 
		{
				System.out.println("4");
			}
		
		 finally 
		 {
			 System.out.println("5");
			
		}
		System.out.println("Adding new line in program");
		System.out.println("Adding new line in vini branch");
		
	}
	

}
