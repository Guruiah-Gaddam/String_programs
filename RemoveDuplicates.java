package Strings.com;

public class RemoveDuplicates {
  public static void main(String[] args) {
	String s="java ";
	String s1=" ";
	char ch[]=s.toCharArray();
	for(int i=0;i<ch.length;i++) {
		for(int j=i+1;j<ch.length;j++) {
		   if(ch[i]==ch[j])
		   {
			   ch[j]='\u0000';
			   ch[i]='\u0000';
		   }
		}
		if(ch[i]!='\u0000') {
			s1+=ch[i];
		}
	}
		System.out.println(s1);
	
  }
}
