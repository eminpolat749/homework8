package csd;

class App {
	public static void main(String [] args)
	{
		PalindromeTest.run();
	}
}

class PalindromeTest {
	public static void run()
	{
		java.util.Scanner kb = new java.util.Scanner(System.in);
		
		GetLastLongestPalindromeTest.run(kb);
		GetLastShortestPalindromeTest.run(kb);
		GetFirstLongestPalindromeTest.run(kb);
		GetFirstShortestPalindromeTest.run(kb);
		
	}
	
}

class GetLastLongestPalindromeTest {
	public static void run(java.util.Scanner kb)
	{		
		for (;;) {
			System.out.print("Bir yazı giriniz:");
			String s = kb.nextLine();
			
			if ("quit".equals(s))
				break;
			
			System.out.printf("Sondan en uzun palindrom:%s%n", StringUtil.getLastLongestPalindrome(s));			
		}		
	}
}

class GetLastShortestPalindromeTest {
	public static void run(java.util.Scanner kb)
	{		
		for (;;) {
			System.out.print("Bir yazı giriniz:");
			String s = kb.nextLine();
			
			if ("quit".equals(s))
				break;
			
			System.out.printf("Sondan en kısa palindrom:%s%n", StringUtil.getLastShortestPalindrome(s));			
		}		
	}
}

class GetFirstLongestPalindromeTest {
	public static void run(java.util.Scanner kb)
	{		
		for (;;) {
			System.out.print("Bir yazı giriniz:");
			String s = kb.nextLine();
			
			if ("quit".equals(s))
				break;
			
			System.out.printf("Baştan en uzun palindrom:%s%n", StringUtil.getFirstLongestPalindrome(s));			
		}		
	}
}

class GetFirstShortestPalindromeTest {
	public static void run(java.util.Scanner kb)
	{		
		for (;;) {
			System.out.print("Bir yazı giriniz:");
			String s = kb.nextLine();
			
			if ("quit".equals(s))
				break;
			
			System.out.printf("Baştan en kısa palindrom:%s%n", StringUtil.getFirstShortestPalindrome(s));			
		}		
	}
}

class StringUtil {
	public static String getFirstLongestPalindrome(String s)
	{
		String result = "";		
				
		int len = s.length();
		int begin = 0;
		
		while (begin != len - 1) {
			int end = len - 1;
			
			while (begin != end) {
				String str = s.substring(begin, end--);
				
				if (str.length() > result.length() && isPalindrome(str) && str.length() > 1)
					result = str;				
				
			}
			++begin;
		}
		return result;		
	}	
	
	public static String getFirstShortestPalindrome(String s)
	{
		String result = "";		
				
		result = s;
		
		int len = s.length();
		int begin = 0;
		
		while (begin != len - 1) {
			int end = len - 1;
			
			while (begin != end) {
				String str = s.substring(begin, end--);
				
				if (str.length() < result.length() && isPalindrome(str) && str.length() > 1)
					result = str;				
				
			}
			++begin;
		}
		return result;		
	}
	
	
	public static String getLastLongestPalindrome(String s)
	{
		String result = "";		
				
		int end = s.length();
		
		while (end != 0) {
			int begin = 0;
			
			while (begin != end) {
				String str = s.substring(begin++, end);
				
				if (str.length() > result.length() && isPalindrome(str) && str.length() > 1)
					result = str;				
				
			}
			--end;
		}
		return result;		
	}
	
	public static String getLastShortestPalindrome(String s)
	{
		String result = "";		
				
		result = s;
		
		int end = s.length();
		
		while (end != 0) {
			int begin = 0;
			
			while (begin != end) {
				String str = s.substring(begin++, end);
				
				if (str.length() < result.length() && isPalindrome(str) && str.length() > 1)
					result = str;				
				
			}
			--end;
		}
		return result;		
	}
		
	public static boolean isPalindrome(String s)
	{
		int left = 0;
		int right = s.length() - 1;
		
		while (left < right) {
			char cLeft = Character.toLowerCase(s.charAt(left));
			
			if (!Character.isLetter(cLeft)) {
				++left;
				continue;
			}
			
			char cRight = Character.toLowerCase(s.charAt(right));
			
			if (!Character.isLetter(cRight)) {
				--right;
				continue;
			}
			
			
			if (cLeft != cRight)
				return false;
			
			++left;
			--right;
		}
		
		return true;
	}
}



