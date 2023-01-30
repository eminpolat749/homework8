package csd;

class App {
	public static void main(String [] args)
	{
		ChangeCaseTest.run();		
	}
}

class ChangeCaseTest {
	public static void run()
	{
		java.util.Scanner kb = new java.util.Scanner(System.in);
		
		for (;;) {
			System.out.print("Bir yazı giriniz:");
			String s = kb.nextLine();
			
			if ("quit".equals(s))
				break;
			
			System.out.println(StringUtil.changeCase(s));
		}		
		System.out.println("Program sonu...");
	}
}

class StringUtil {
	public static String changeCase(String s1)
	{
		String tmp = "";
		int len = s1.length();
		
		for (int i = 0; i < len; ++i) {
			char ch = s1.charAt(i);
			
			if (!Character.isLetter(ch))
				tmp += ch;
			
			if (Character.isLowerCase(ch))
				tmp += Character.toUpperCase(ch);
			
			if (Character.isUpperCase(ch))
				tmp += Character.toLowerCase(ch);
		}
		return tmp;		
	}
}