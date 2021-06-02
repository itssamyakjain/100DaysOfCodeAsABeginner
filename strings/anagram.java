public class Anagram{
	// method 1
  // using sorting techinique
	static void anagram(String s, String s2) {
		if(s.length()!=s2.length())
			System.out.println("No");
		else {
			char[] arr1 = s.toCharArray();
			char[] arr2 = s2.toCharArray();
			
			Arrays.sort(arr1);
			Arrays.sort(arr2);
			
			if(Arrays.equals(arr1, arr2))
				System.out.println("Anagram");
			else
				System.out.println("Not.");
		}
	}
  
  // method 2
  // counting the character occurrences
  
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String s = new String("geeKs");
		String s2 = new String("egkes");
		
    // removes whitespaces from string and converts to lowercase
		s = s.replace(" ","").toLowerCase();
		s2 = s2.replace(" ","").toLowerCase();
		
		anagram(s,s2);
		sc.close();
	}
}
