package com.string;

public class IndexOfString {
public static void main(String[] args) {
	String s="java";
	System.out.println(indexof(s,'j'));
}
public static int indexof(String s,char ch) {
	for(int i=0;i<s.length();i++) {
		if(s.charAt(i)==ch) {
	     return i;
		}
	}
		return-1;
	
}
}