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
			String s1 = kb.nextLine();
			
			System.out.print("Bir yazı daha giriniz:");
			String s2 = kb.nextLine();
			
			if ("quit".equals(s1))
				break;
			
			System.out.printf("(%s) yazısından (%s) yazısının karakterlerinin çıkartılmış hali:(%s))%n", s1, s2, StringUtil.changeCase(s1, s2));		
			
		}
		
		System.out.println("Program sonu");
	}
}

class StringUtil {
	public static String changeCase(String s1, String s2)
	{
		int len = s1.length();
		String temp = "";
		
		for (int i = 0; i < len; ++i) {
			char ch = s1.charAt(i);
			
			if ((s2.toLowerCase().indexOf(Character.toLowerCase(ch))) != -1)
				continue;
			
			temp += ch;			
		}
		
		return temp;
	}
}




