package javaPrograms;

public class Substrsearch {

	public static void main(String[] args) {
		String str="Hello World Program.";
		char str1[] = str.toCharArray();
		String substr="World";
		char substr1[] = substr.toCharArray();
		int count = 0;
		
		for (int i = 0; i < str1.length; i++) {
			if (str1[i]==substr1[i]) {
				count++;
			}
		}
		if (count==substr.length()) {
			System.out.println("sub array");
		}
		

	}

}
