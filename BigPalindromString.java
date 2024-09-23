package Strings.com;

public class BigPalindromString {
   public static void main(String[] args) {
	String s="malayalam";
	String big=" ";
	for(int i=0;i<s.length();i++)
	{
		for(int j=i+3;j<s.length();j++) 
		{
			String s1=s.substring(i, j);
			if(isPalindrom(s1))
				if(s1.length()>big.length()) {
					big=s1;
			}
		}
	}
	System.out.println(big);
}
   public static boolean isPalindrom(String s)
   {
	   int i=0;
	   int j=s.length()-1;
	   while(i<=j) {
		   if(s.charAt(i)!=s.charAt(j)) {
			   return false;
		   }
		   i++;
		   j--;
	   }
	   return true;
   }
}
