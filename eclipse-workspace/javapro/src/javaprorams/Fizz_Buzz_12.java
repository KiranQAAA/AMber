package javaprorams;

import java.util.ArrayList;
import java.util.List;

/*Given an integer n, return a string array answer (1-indexed) where:

answer[i] == "FizzBuzz" if i is divisible by 3 and 5.
answer[i] == "Fizz" if i is divisible by 3.
answer[i] == "Buzz" if i is divisible by 5.
answer[i] == i (as a string) if none of the above conditions are true.

/*Example 1:

Input: n = 3
Output: ["1","2","Fizz"]
Example 2:

Input: n = 5
Output: ["1","2","Fizz","4","Buzz"]*/

public class Fizz_Buzz_12 {

	public static void main(String[] args) {
		
		System.out.println(Fizz_Buzz(6));
		
	}
		public static List<String> Fizz_Buzz(int n) {
			
		
		  List<String> s = new ArrayList<>();
		  
				for(int i=1;i<=n;i++){
            if( ( i%3==0 ) && ( i%5==0 ) ){
                s.add("FizzBuzz");
            }else if( i%3 ==0){
                s.add("Fizz");
            }else if( i % 5 ==0 ){
                s.add("Buzz");
            }else{
                s.add(i + "");
            }
        }
        return s;
	}

}
