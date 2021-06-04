import java.util.Arrays;
import java.util.Scanner;

public class AnagramCountMethod{
	// total characters possible 256 
	static int NO_OF_CHARS = 256;
	
  // returns if string is anagram or not
	static boolean anagram(String s, String s2) {
	  
    // if lengths are not equal strings are not anagrams
		if(s.length()!=s2.length())
			return false;
		
    // create count arrays of size 256 for both strings & all values are initialized with zeroes
		int[] count1 = new int[NO_OF_CHARS];
		int[] count2 = new int[NO_OF_CHARS];
		
    // iterate through every character of both strings & increment the count of character in the count array
		for(int i=0;i<s.length();i++) {
			count1[s.charAt(i)]++;
			count2[s2.charAt(i)]++;
		}
		
    // compare the count arrays
		for(int i=0;i<NO_OF_CHARS;i++) {
			if(count1[i]!=count2[i])
				return false;
		}
		return true;
		
	}
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
    //take input string
		String s = sc.nextLine();
		String s2 = sc.nextLine();
		// if required remove whitespaces and convert them to lowercase
		s = s.replace(" ","").toLowerCase();
		s2 = s2.replace(" ","").toLowerCase();
		
		System.out.println("Strings are anagram or not : "+anagram(s,s2));
		sc.close();
	}
}
