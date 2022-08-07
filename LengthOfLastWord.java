package javachallenge;

import java.io.InputStream;

public class LengthOfLastWord {
	

	public int lengthOfLastWordFunction( String a)
    {
        int count = 0;
        
        String str = a.trim();
        int len = str.length();
       // System.out.println("Length of the String after trim : " +len);
 
        for (int i = 0; i <len; i++) {
            if (str.charAt(i) == ' ')
            	count = 0;
            else
            	count++;
        }
 
        return count;
    }
 
    public static void main(String[] args)
    {
        String inputStr = "   fly me   to   the moon  ";
        	//int   strlen = inputStr.length();
        	//System.out.println("length of original String :" +strlen);
        LengthOfLastWord obj = new LengthOfLastWord();
        System.out.println("The length of last word is : " + obj.lengthOfLastWordFunction(inputStr));
    }
    
}





