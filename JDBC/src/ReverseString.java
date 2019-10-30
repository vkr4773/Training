
public class ReverseString {

	public static void main(String[] args) {
		String str = "Java Crash Course";
		reverse(str);
		count(str);
		// TODO Auto-generated method stub

	}

	static void  reverse(String str){
		for(int i = str.length()-1; i>=0;i--)
			System.out.print(str.charAt(i));
	}
	static void count(String str){
	    int consonant = 0 , vowels = 0;
	    for(int i= 0; i<str.length()-1; i++){
	        char ch = str.charAt(i);
	        if((ch>='A' && ch<='Z'))
	        {
	            ch = (char)(ch+32);
	        }
	        if (ch == 'a' || ch == 'e' || ch == 'i' || 
	                ch == 'o' || ch == 'u') 
	                vowels++; 
	            else
	                consonant++; 
	        } 
	    //System.out.println();
	    System.out.println("\nConsonants: " +consonant);
	    System.out.println("Vowels: " +vowels);
	     
	}

}
