package TechSaksham;

public class StrCont {
	public static boolean FormString(String y)
	{
		int x=y.length();
		int mid=x/2;
		for(int i=0;i<mid;i++)
		{
			char start=y.charAt(i);
			char end=y.charAt(x-mid+i);
			if(start!=end)
			{
				return false;
			}
		}
		return true;
	}
    public static void main(String[] args)
    {
    	String y="ww";
    	boolean ans=FormString(y);
    	System.out.println(ans);
    }
}
