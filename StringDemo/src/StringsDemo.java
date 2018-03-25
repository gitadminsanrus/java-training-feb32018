
public class StringsDemo {

	public static void main(String[] args) {

		String s = "four: " + (2 + 2);
		System.out.println(s.charAt(2));
		System.out.println(s);
		
		System.out.println("getChars(srcBegin, srcEnd, char[] targetArray, targetArrayStartIndex) demo------");
		char[] characters = new char[s.length()];
		s.getChars(0, s.length(), characters, 0);
		
		for (int index = 0; index < characters.length; index++) {
			System.out.println(characters[index]);
		}
		
		System.out.println("getBytes() demo------");
		byte[] bytes = s.getBytes();
		
		for (int index = 0; index < bytes.length; index++) {
			System.out.println(bytes[index]);
		}
		
		System.out.println("toCharArray() demo------");
		char[] chars = s.toCharArray();
		for (int index = 0; index < chars.length; index++) {
			System.out.println(chars[index]);
		}
		
		System.out.println("equals() method demo------");
		boolean isStringEqual = s.equals("Four: 4");
		System.out.println(isStringEqual);
		
		System.out.println("equalsIgnoreCase() method demo------");
		isStringEqual = s.equalsIgnoreCase("FoUr: 4");
		System.out.println(isStringEqual);
		
		String str1 = "ABCDBF";
		String str2 = "DEF";
		
		System.out.println("\"ABC\".compareTo(\"DEF\") => " + str1.compareTo(str2));
		
		System.out.println("\"ABC\".indexOf(\"B\") => " + "ABC".indexOf("B"));
		System.out.println("\"ABC\".lastIndexOf(\"B\") => " + "ABC".lastIndexOf("B"));
		
		System.out.println(str1.substring(1, 4));
		
		Person p1 = new Person("First", "Last", 25);
		Person p2 = new Person("First1", "Last1", 30);
		System.out.println(p1);
		System.out.println(p2);
		
		
		String str10 = new String("ABC");
		String str11 = "ABC";
		System.out.println(str10 == str11);
		System.out.println(str10.equals(str11));
		
		
		StringBuffer sb = new StringBuffer();
		sb.append("A");
		sb.append("B");
		sb.append("C");
		sb.reverse();
		
		System.out.println(sb.toString());
		
		StringBuilder sb1 = new StringBuilder();
		sb1.append("A");
		sb1.append("B");
		sb1.append("C");
		sb1.reverse();
		
		System.out.println(sb1.toString());

		

	}

}
