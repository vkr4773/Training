
public class CountDigit {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x = 54321;
		int res = count(x);
		System.out.println("No of digits: " +res);
	}
	static int count(int n) {
		int count =0;
		while (n!=0) {
			n =n/10;
			++count;
		}
		return count;
	}
}
