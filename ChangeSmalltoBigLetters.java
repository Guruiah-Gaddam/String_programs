package Strings.com;

public class ChangeSmalltoBigLetters {
   public static void main(String[] args) {
	 String s="g guravaiah";
	 char[]ch=s.toCharArray();
	 for(int i=0;i<ch.length;i++)
	 {
		 if(ch[i]>='a'&& ch[i]<='z')
		 {
			 ch[i]=(char) (ch[i]-32);
		 }else if(ch[i]>='A'&& ch[i]<='Z')
		 {
			 ch[i]=(char) (ch[i]+32);
		 }
  
	  }
	 System.out.println(ch);
	}
}
