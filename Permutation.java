package com.string;

public class Permutation {
  public static void permutation(String s,int st,int end) {
	  if(st==end) {
		  System.out.println(s);
		  return;
	  }
  
  for(int i=st;i<end;i++) {
	  String s1=swap( s,st,i);
	  permutation(s1,st+1,end);
  }
}
  public static String swap(String s,int i,int j) {
	  char[]ch=s.toCharArray();
	  char temp=ch[j];
	  ch[j]=ch[i];
	  ch[i]=temp;
  
	return new String(ch);
}
  
  public static void main(String[] args) {
	String s="abc";
	permutation(s,0,s.length());
}
}