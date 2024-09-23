package Strings.com;

public class ReverseString {
	public static void main(String[] args) {
		 String s="avaj";
		 String reversed=" ";
		 for(int i=s.length()-1;i>=0;i--) {
			 reversed+=s.charAt(i);
			
		 }
		 System.out.println(s+" == "+reversed);
	}
	
}
