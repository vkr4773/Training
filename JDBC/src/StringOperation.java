
public class StringOperation {

	public static void main(String[] args) {
		String str = "Java Crash Course";
		String str1 = "Java Has 2 Weeks 8 Hours Class";
		String str3 = "Gllks for Gllks";
		System.out.println("Has Any Upper case: " +hasUpper(str));
		System.out.println("Has any number: " +hasNumber(str1));
		System.out.println("isCapsOnly: " +isCapsOnly(str));
		System.out.println("No of Uppercase Char: " +countCaps(str1));
		System.out.println("Replace All Old character by new charr: " +replace(str3,'l','e'));
		System.out.println("Replace All Old character by new charr At First Place only: " +myReplace(str3,'l','e'));
		System.out.println("Replace All Old character by new charr At First Place only: " +LastReplace(str3,'l','e'));
		System.out.println("Comparing two strings: "+compare("helLo" , "hello"));
		System.out.println("Reverse_Cap: " +reverse_Cap(str));
	}
	static String hasUpper(String str) {
		char[] charr = str.toCharArray();
		for(char ch:charr) {
	        if((ch>='A' && ch<='Z')) {
	        	return "Yes";
	        }
	        
		}
		return "No";
	}
	
	static String hasNumber(String str) {
		char[] charr = str.toCharArray();
		for(char ch:charr) {
			if (ch >= '0' && ch <= '9') {
				return "Yes";
			}
		}
		return "No";
		
	}
	static String isCapsOnly(String data) {
		char[] charr = data.toCharArray();
		for(char ch:charr) {
			if((ch>='a' && ch<='z')) {
	        	return "False";
	        }
		}
		return "True";
	}
	
	static  int countCaps(String data) {
		char[] charr = data.toCharArray();
		int count = 0;
		for(char ch:charr) {
			if((ch>='A' && ch<='Z')) {
				count++;
			}
		}
		return count;
	}
	//replace All occurrence of character
	static String replace(String s,  char oldChar, char newChar) {
		int length = s.length();
		char[] str = s.toCharArray();
		for(int i = 0; i<length ; i++) {
			if(str[i] == oldChar) {
				str[i]=newChar;
			}
		}
		return new String(str);
	}
	//replace first occurrence of character
	static String myReplace(String s,  char oldChar, char newChar) {
		int length = s.length();
		char[] str = s.toCharArray();
		for(int i = 0; i<length ; i++) {
			if(str[i] == oldChar) {
				str[i]=newChar;
				break;
			}
		}
		return new String(str);
	}
	//replace last occurrence of character
	static String LastReplace(String s,  char oldChar, char newChar) {
		int length = s.length();
		char[] str = s.toCharArray();
		for(int i = length -1; i>0 ; i--) {
			if(str[i] == oldChar) {
				str[i]=newChar;
				break;
			}
		}
		return new String(str);
	}
	
	//compare two string-----------------------------------------------------------
	public static boolean compare(String x, String y){
        if(x==null || y==null){
            return false;
        }
        //compare lengths
        if(x.length()!=y.length())
            return false;
        
        char[] str1 = x.toCharArray();
        char[] str2 = y.toCharArray();
        for(int i =0; i<x.length();i++) {
        	if(str1[i]>='A' && str1[i]<='Z') {
        		str1[i]=(char)(str1[i]+32);
        	}
        }
        
        for(int i =0; i<x.length();i++) {
        	if(str2[i]>='A' && str2[i]<='Z') {
        		str2[i]=(char)(str2[i]+32);
        	}
        }
        //compare all characters
       for (int i = 0; i <x.length() ; i++) {
           if(str1[i]!=str2[i])
               return false;
        }
        //if here, means both strings are equal
        return true;
    }
	//reverse a given string and maintain its caps position-------------------
	static String reverse_Cap(String s) {
		int l = s.length();
		int j= 0;
		char[] str = s.toCharArray();
		char[] temp = new char[l];
		for(int i=l-1;i>=0;i--) {
			temp[j]=str[i];
			if((temp[j]>'a' && temp[j]<'z') && (str[j]>'A' && str[j]<'Z')) {
				temp[j]-=32;
			}
			else if((temp[j]>'A' && temp[j]<'Z') && (str[j]>'a' && str[j]<'z')) {
				temp[j]+=32;
			}
			j++;
		}
		return new String(temp);
	}
	
}
