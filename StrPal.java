package TechSaksham;

public class StrPal { 
		public static boolean  Palindrome(String y)
		{
			int x=y.length();
			for(int i=0;i<x/2;i++)
			{
				char start=y.charAt(i);
				char end=y.charAt(x-1-i);
				if(start!=end)
				{
					return false;
				}
			}
			return true;
		}
		public static void main(String[] args)
		{
			String y="babbab";
			boolean ans=Palindrome(y);
			System.out.println(ans);
		}
	}


