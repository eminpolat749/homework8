package csd;

class App {
	public static void main(String [] args)
	{
		PrintTest.run();		
	}
}

class PrintTest {
	public static void run()
	{
		java.util.Scanner kb = new java.util.Scanner(System.in);
		
		System.out.print("Bir yazı giriniz:");
		String s = kb.nextLine();
		
		StringUtil.print(s);		
	}
}

class StringUtil {
	public static void print(String s)
	{
		int len = s.length();
		
		for (int i = 1; i <= len; ++i) {
			for (int j = 0; j < i; ++j) {
				System.out.printf("%c", s.charAt(j));				
			}
			System.out.println();			
		}
	}
}

