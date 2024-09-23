package Strings.com;
//check this is a plaindrom or not 
/*public class Palindrom {

	public static boolean isPalindrom(String s) 
		int i=0;
		int j=s.length()-1;
		while(i<=j)
		{
			if(s.charAt(i)!=s.charAt(j))
			{
				return false;
			}
			i++;
			j--;
		}
		return true;
	}
	public static void main(String[] args) {
	
		String s="tat";
		
	}*/
//check this is a reverse String 
/*public class Palindrom
{
  public static String rev (String s) {
	  int i=0;
	  int j=0;
	  int len=s.length();
	  String s1="";
	  while(j<len)
	  {
		  while(j<len && s.charAt(j)!=' ')
		  {
			  j++;
		  }
		  int k=j-1;
		  String temp=" ";
		  while(k>=i) {
			  temp+=s.charAt(k);
			  k--;
		  }
		  s1+=temp;
	  }
	  if(j<len)
	  {
		  s1+="";
		  j++;
		  i=j;
	  }
  
	  return s1;
  }
  public static void main(String[] args) {
	String s="Guru";
	System.out.println(rev(s));
}*/
  // check the string reverse the words in agiven string 
/*public class palindrom {
			public static void rev(String s)
			{
				String s1="";
				
				int len=s.length();
				int i=len-1;
				int j=len-1;
			
				while(i>=0)
				{
				while(i>=0 && s.charAt(i)!=' ')
				{
					i--;
				}
					int k=i+1;
				
					String temp="";
					while(k<=j)
					{
						temp+=s.charAt(k);
						
						k++;
					}
				
					s1+=temp;
					if(i>=0)
					s1+=" ";
					i--;
					j=i;
				}
				System.out.println(s1);
			}
			
				public static void main(String[] args) {
					String s="java is easy";
					System.out.println(s);
					rev(s);
				}
		}*/

// check the string the ANAGARAM OR NOT ?

/*public class palindrom {
	public static boolean isAnagaram(String s,String s1)
	{
		while(true)
		{
			if(s.length()!=s1.length())
			{
				return false;
			}
			if(s.length()==0&&s1.length()==0)
			{
				return true;
			}
			char ch=s.charAt(0);
			s=s.replace(ch+"", "");
			s1=s1.replace(ch+"","");
		}
	}
	
	public static void main(String[] args) {
		String s="silettnt";
		String s1="listen";
		if(isAnagaram(s,s1))
		{
			System.out.println("this is anagaram Strings");
		}else {
			System.out.println("this is not anagaram strings");
		}
	}
}*/

//CHECK THE REMOVE   CHARACTER DUPLICATES IN A GIVEN STRING
/*public class RemoveDuplicates{
	    public static void main(String[] args) {
	        String s = "jaahhhvvhha";
	        String s1="";
	        char ch[] = s.toCharArray();
	        
	        // Outer loop to iterate over characters
	        for (int i = 0; i < ch.length; i++) {
	            for (int j = i + 1; j < ch.length; j++) {
	                // If a duplicate is found, replace it with the null character '\u0000'
	                if (ch[i] == ch[j]) {
	                    ch[j] = '\u0000';
	                    ch[i] = '\u0000' ;// Set the duplicate character to '\u0000'
	                }
	            }
	            
	            // Print the character if it's not the null character
	            if (ch[i] != '\u0000') {
	               s1+=ch[i];
	            }
	        }
	        System.out.println(s1);
	    }
	}*/
//COUNTING THE WORDS IN STRING 
public class palindrom{
	public static void main(String[] args) {
		String s="java is easy";
		int count=0;
		for(int i=0;i<s.length();i++)
		{
			if(s.charAt(i)!=' ')
			{
				count++;
			}
		}
		System.out.println("counting the words in a given string"+"="+count);
	}
}


