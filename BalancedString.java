package com.string;

import java.util.Stack;

public class BalancedString {
public static void main(String[] args) {
	System.out.println(isBalanced("{}{}"));
}
public static boolean isBalanced(String s)
{
	Stack<Character>stack=new Stack<Character>();
	for(int i=0;i<s.length();i++) 
	{
		char ch=s.charAt(i);
	if(ch=='['||ch=='{'||ch=='(') {
		stack.push(ch);
	}
	else if(ch==']'||ch=='}'||ch==')') {
		if(stack.isEmpty()||!pair(stack.pop(),ch))
			return false;
	}
	}
	return stack.isEmpty();
}
public static boolean pair(char c1,char c2) {
	if(c1=='['&& c2==']')return true;
	if(c1=='{'&& c2=='}')return true;
	if(c1=='('&& c2==')')return true;
	return false;
}
}