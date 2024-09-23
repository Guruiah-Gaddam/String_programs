package Strings.com;

public class InItCap {
	   public static void main(String[] args) {
		String s="Vikkel Is";
		char[] ch=s.toCharArray();
	  for(int i=0;i<ch.length;i++) {
		if(ch[i]>='a'&& ch[i]<='z') {
			ch[i]=(char)(ch[i]-32);
		 }
	  
	 System.out.println(ch[i]);
	}
	   }
}

