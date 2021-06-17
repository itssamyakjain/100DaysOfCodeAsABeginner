// other file contains the stack operations push and pop
// TC : O(n) ( number of characters in stack) and SC : O(n) (stack's space)
// A string can also be reversed without using any stack and with no extra space by swapping
public class ReverseString {
	
	public static void reverseString(String str) {
		Stack s = new Stack();
		int n = str.length();
		
		System.out.println("Original String : "+str);
		for(int i=0;i<n;i++) {
			s.push(str.charAt(i));
		}
		
		str="";
		for(int i=0;i<n;i++) {
			str+=s.pop();
			
		}
		System.out.println("Reversed String : "+str);

	}


	public static void main(String[] args) {
		
		String str = "eshasamyak";
		reverseString(str);
	}
}
