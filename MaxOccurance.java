package Strings.com;
public class MaxOccurance {
	    public static void main(String[] args) {
			String s="GuGuravss";
			int maxCount=0;
			char maxchar=' ';
			char ch[]=s.toCharArray();
			for(int i=0;i<ch.length;i++)
			{
				int count =0;
				for(int j=i+1;j<ch.length;j++) {
					if(ch[i]==ch[j]) 
					{
						count++;
						ch[j]='\u0000';
						
					}
				}
				if(ch[i]!='\u0000'&&count>maxCount) {
					maxCount=count;
					maxchar=ch[i];
					//System.out.println(ch[i]+" "+count);
					System.out.println(maxchar+" "+maxCount);
				}
			}
		}
	}


