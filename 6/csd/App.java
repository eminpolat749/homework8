package csd;

class App {
	public static void main(String [] args)
	{
		IsIdentifierTest.run();
	}
}

class IsIdentifierTest {
	public static void run()
	{
		java.util.Scanner kb = new java.util.Scanner(System.in);
		
		for (;;) {
			System.out.print("Bir değişken ismi giriniz:");
			String s = kb.nextLine();
			
			if ("quit".equals(s))
				break;
			
			System.out.println(StringUtil.isIdentifier(s) ? "Geçerli değişken ismi..." : "Geçerli olmayan değişken ismi...");
		}
		System.out.println("Program sonu");
	}
}

class StringUtil {
	public static boolean isIdentifier(String s)
	{
		if (Character.isDigit(s.charAt(0)))
			return false;
		
		if (s.length() == 1 && "_".equals(s))
			return false;
		
		for (int i = s.length() - 1; i >= 0; --i) {
			char ch = s.charAt(i);
			
			if (Character.isWhitespace(ch))
				return false;
		}
		return true;
	}
}