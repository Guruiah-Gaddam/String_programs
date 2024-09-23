package com.string;

public class ArrangeCharacters {
public static void main(String[] args) {
	String s="DevaKumar 123358@#";
	String uc=" ";
	String lc=" ";
	String nc=" ";
	String sc=" ";
	String s1=" ";
	for(int i=0;i<s.length();i++) {
		char ch=s.charAt(i);
		if(ch>='A'&& ch<='Z') {
			uc+=ch;
		}
		else if(ch>='a'&&ch<='z') {
			lc+=ch;
		}
		else if(ch>='0'&&ch<='9') {
			nc+=ch;
		}
		else {
			sc+=ch;;
		}
	}
	s1=uc+lc+nc+sc;
	System.out.println(s1);
	}
	
}

