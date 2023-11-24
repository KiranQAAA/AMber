package javaprorams;
import java.util.ArrayList;
import java.util.List;
public class SubstringRemoval {

	public static void main(String[] args) {
		

	
		
		        String str1 = "aabbaa";
		      //  String str2 = "abbacca";
		     //   String str3 = "Aabbacaada";

		        List<String> output1 = findSubstrings(str1);
		      //  List<String> output2 = findSubstrings(str2);
		     //   List<String> output3 = findSubstrings(str3);

		        System.out.println("Input: " + str1);
		        printOutput(output1);
		      //  System.out.println("Input: " + str2);
		    //    printOutput(output2);
		     //   System.out.println("Input: " + str3);
		     //   printOutput(output3);
		    }

		    public static List<String> findSubstrings(String input) {
		        List<String> substrings = new ArrayList<>();

		        for (int i = 0; i < input.length(); i++) {
		            StringBuilder current = new StringBuilder(input);
		            current.deleteCharAt(i);
		            substrings.add(current.toString());
		        }

		        return substrings;
		    }

		    public static void printOutput(List<String> output) {
		        if (output.isEmpty()) {
		            System.out.println("No valid substrings found.");
		        } else {
		            for (int i = 0; i < output.size(); i++) {
		                System.out.println((i + 1) + "output . " + output.get(i));
		            }
		        }

		        System.out.println();
		    }
		

	}


