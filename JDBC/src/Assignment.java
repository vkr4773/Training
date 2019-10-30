
interface MobileNumber{
	boolean numberFormat(String str);
}
abstract class Country implements MobileNumber{
	boolean isNumber(String d) {
		for (int i =0 ;i<d.length();i++) {
			char ch = d.charAt(i);
			if(!(ch>='0'&&ch<='9')) {
				return false;
			}
		}
		return true;
	}
}


class India extends Country{
	public boolean numberFormat(String str) {
		if(str.length()!=14) {
			return false;
		}
		if((str.charAt(0)!='+')||(str.charAt(3)!='-')||(str.charAt(1)!='9')||(str.charAt(2)!='1')||(!isNumber(str.substring(4)))) {
			return false;
		}
		return true;
	}
}

public class Assignment {

	public static void main(String[] args) {
		India In = new India();
		String num = "+91-9696147417";
		System.out.println(In.numberFormat(num));
		// TODO Auto-generated method stub

	}

}
