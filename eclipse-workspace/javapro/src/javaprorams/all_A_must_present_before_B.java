package javaprorams;

public class all_A_must_present_before_B {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		System.out.println(checkString("aaab"));
		
		System.out.println(checkString("b"));
	}
	
	public static boolean checkString(String s) {
		int ans = 1;
		for(int i=0; i<s.length()-1; i++){
			if(s.charAt(i) == 'b' && s.charAt(i+1) == 'a'){
				ans = 0;
			}
		}
		return ans == 1;
	}   

}
