package javaprorams;

import java.util.Stack;

public class StackOpertaions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Stack <String> Stack_of_items=new Stack<>();
		Stack_of_items.push("kiran ");
		Stack_of_items.push("kiranpawar");	
		
		System.out.println("stack ->" + Stack_of_items );
		  
		String item_on_top =Stack_of_items.pop();
		System.out.println(item_on_top  );
		System.out.println("stack ->" + Stack_of_items );
		
		
		Stack_of_items.peek();/* r fetch the first element of the Stack or the element present at the top of the Stack.*/
	}

}
