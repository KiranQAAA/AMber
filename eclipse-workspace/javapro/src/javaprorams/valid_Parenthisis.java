package javaprorams;

import java.util.Stack;

public class valid_Parenthisis {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   boolean result =isvalidparenthisis("((");
   System.out.println("given string is valid parentheses" +" is :  " +result);
	}

	
	public static boolean isvalidparenthisis(String s) {
		 
	if(	s.length() % 2 !=0)
	{
		return false;
	}
	
	Stack <Character> stack_of_items= new Stack <>();
	
	for(char c :s.toCharArray())
	{
		if(c =='(' || c=='{'|| c=='[')
		{
			stack_of_items.push(c);
		}
		else if (c==')' && !stack_of_items.isEmpty() && stack_of_items.peek()=='(' ) {
			stack_of_items.pop();
		}
		
		else if (c=='}' && !stack_of_items.isEmpty() && stack_of_items.peek()=='}' ) {
			stack_of_items.pop();
		}
		
		else if (c==']' && !stack_of_items.isEmpty() && stack_of_items.peek()==']' ) {
			stack_of_items.pop();
		}
	}

	
	return  stack_of_items.isEmpty() ;
		
	}
}
