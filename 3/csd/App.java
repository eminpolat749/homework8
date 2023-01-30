package csd;

class App {
	public static void main(String [] args)
	{
		StripTest.run();		
	}
}

class StripTest {
	public static void run()
	{
		java.util.Scanner kb = new java.util.Scanner(System.in);
		
		System.out.print("Bir yazı giriniz:");
		String s = kb.nextLine();
		
		System.out.println(StringUtil.strip(s));	
	}
}

class StringUtil {
	public static String strip(String s)
	{
		int i = 0;
		
		while (Character.isWhitespace(s.charAt(i)))
			++i;
		
		int j = s.length() - 1;
		
		while (Character.isWhitespace(s.charAt(j)))
			--j;
		
		return "(" + s.substring(i, j + 1) + ")";
	}
}

