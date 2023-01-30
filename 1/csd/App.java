package csd;

class App {
	public static void main(String [] args)
	{
		InnerMostTest.run();		
	}
}

class InnerMostTest {
	public static void run()
	{
		java.util.Scanner kb = new java.util.Scanner(System.in);
		
		for (;;) {
			System.out.print("Bir yazı giriniz:");
			String s1 = kb.nextLine();
			
			if ("quit".equals(s1))
				break;
			
			System.out.printf("en içteki yazı (%s)%n", StringUtil.innerMost(s1));
		}
	}
}

class StringUtil {
	public static String innerMost(String s1)
	{
		if (!isValid(s1)) {
			System.out.println("Yanlış bir giriş...");
			System.exit(1);
		}
		boolean flag = true;
		
		int len = s1.length();
		int firstidx = 0, lastidx = 0;
		
		for (int i = 0; i < len; ++i) {
			char ch = s1.charAt(i);
			
			if (ch == '{')
				firstidx = i;
			
			if (ch == '}' && flag) {
				lastidx = i;
				flag = false;
			}			
		}
		return s1.substring(firstidx, lastidx + 1);
	}
	
	public static boolean isValid(String s1)
	{
		int len = s1.length();
		int firstcnt = 0, lastcnt = 0;
		char ch;
		
		for (int i = 0; i < len; ++i) {
			if (s1.charAt(i) == '{')
				++firstcnt;
			
			if (s1.charAt(i) == '}')
				++lastcnt;			
		}
		
		if (firstcnt == lastcnt) {
			if (len % 2 == 0)
				return true;
			
			else {
				if ((ch = s1.charAt(len / 2)) != '{' && ch != '}')
					return true;
			}			
		}
		return false;
	}
}
