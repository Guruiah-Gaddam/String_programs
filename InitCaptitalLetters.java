package Strings.com;

public class InitCaptitalLetters {
   public static void main(String[] args) {
	String s="Vikkel Is";
	int count =0;
	char[] ch=s.toCharArray();
  for(int i=0;i<ch.length;i++) {
	if(ch[i]>='a'&&ch[i]<='z' || ch[i]>='A'&& ch[i]<='Z') {
		 count++;
	 }
  }
 System.out.println(count);
}
}
