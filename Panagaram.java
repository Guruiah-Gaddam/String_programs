package com.string;

public class Panagaram {

		public static boolean Panagarams(String s){
			s.toLowerCase();
			if(s.length()<26)
			{
				return false;
			}
			for(int i='a';i<='z';i++)
			{
				if(s.indexOf(i)==-1)
				{
					return false;
				}
			
				return true;
			}
			return false;
	}
	public static void main(String[]args)
	{
		String s="a Quick brown fox jumps over the lazy dog";
		if(Panagarams(s))
		{
			System.out.println("panagaram");
		}
		else{
		System.out.println("Not Panagaram");
		}
	}
	}




