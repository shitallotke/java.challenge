package javachallenge;

public class Palindrome {
	
	public void plaindromeMethod(String inputStr) {
		String revstr = ""; 
		boolean Palindrome = true;
		boolean notPalindrome = false;
		
		String specialStr = inputStr.replaceAll("[^a-zA-Z0-9]", "");
	//	System.out.println("String after removing special char  : " +specialStr);
		
		String lowerStr = specialStr.toLowerCase();
	//	System.out.println("LowerCase String : " +lowerStr);
		
		for(int i = lowerStr.length()-1;i>=0;i--) {
			revstr = revstr + lowerStr.charAt(i);
		}
		//System.out.println("Reverse String : " + revstr);
		
		if(lowerStr.equals(revstr)){
			System.out.println("is " +inputStr +" Palindrome ? : " +Palindrome);
		}
		else {
			System.out.println("is " +inputStr +" Palindrome ? : " +notPalindrome);
		}
		
	}

	public static void main(String[] args) {
		
		Palindrome obj = new Palindrome();
		
		obj.plaindromeMethod("A man, a plan, a canal: Panama");
		obj.plaindromeMethod( "race a car");
		obj.plaindromeMethod(" ");
		
	}

}
