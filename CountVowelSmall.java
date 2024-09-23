package com.string;

public class CountVowelSmall {

	public static void main(String[] args) {
		String s="JIEOULS";
		int count=0;
		for(int i=0;i<s.length();i++)
		{
			char ch1=s.charAt(i);
			if(ch1=='A'||ch1=='E'||ch1=='I'||ch1=='U'||ch1=='O') {
			count++;
			//ch1+=32;
			}
			if(ch1=='a'||ch1=='e'||ch1=='i'||ch1=='o'||ch1=='u') {
			//ch1-=32;
		count++;
			}
		}
			System.out.println(count);
		
		
	}

}
