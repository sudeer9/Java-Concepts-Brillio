package com.brillio;

public class DemoConditionalStatements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int grade=45;
		
		if(grade>=90)
		{
			System.out.println("A");
		}
		
		else if(grade>=80 && grade<=89)
		{
			System.out.println("B");
		}
		
		else if(grade>=60 && grade<=79)
		{
			System.out.println("C");
		}
		
		else if(grade>=45 && grade<=59)
		{
			System.out.println("D");
		}
		
		else
		{
			System.out.println("E");
		}
		

	}

}
