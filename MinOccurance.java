package Strings.com;
public class MinOccurance {
		    public static void main(String[] args) {
				String s="GuGuravs";
				int minCount=0;
				char minchar=' ';
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
					if(ch[i]!='\u0000'&&count>minCount) {
						minCount=count;
						minchar=ch[i];
						//System.out.println(ch[i]+" "+count);
						System.out.println(minchar+" "+minCount);
					}
				}
			}
		}




