package Strings.com;

public class VowelGreaterthan3 {
  public static void main(String[] args) {
	String s="aieoulsfh";
	int count=0;
	char ch[]=s.toCharArray();
	for(int i=0;i<ch.length;i++)
	{
		if(ch[i]=='a'||ch[i]=='e'||ch[i]=='i'||ch[i]=='o'||ch[i]=='u')
		{
			count++;
		}
	}
	if(count>3) {
		for(int i=0;i<ch.length;i++)
		{
			if(ch[i]=='a'||ch[i]=='e'||ch[i]=='i'||ch[i]=='o'||ch[i]=='u')
			{
	          //  s.replace(ch[i], '-');
				ch[i]='-';
			}
			System.out.print(ch[i]);
		}
	}
	
  }
}
