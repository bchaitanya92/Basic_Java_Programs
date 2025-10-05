package javaPrograms;

public class SpecialChar {

	public static void main(String[] args) {
		
//		String sc="";
//		
//		String str = new String("ABCabc@#$123");
//		char[] a= str.toCharArray();
//		for(int i=0;i<a.length;i++) {
//			if(!(a[i]>=65 && a[i]<=90 || a[i]>=97 && a[i]<=121 || a[i]>=48 && a[i]<=57)) {
//				sc=sc+str.charAt(i);
//			}
//		}
//		System.out.println(sc);
		
		
		
//		String str = "ABCabc@#$123";
//
//        String upperCase = "";
//        String lowerCase = "";
//        String numbers = "";
//        String specialChars = "";
//
//        for (int i = 0; i < str.length(); i++) {
//            char ch = str.charAt(i);
//
//            if (ch >= 'A' && ch <= 'Z') {
//                upperCase += ch;
//            } 
//            else if (ch >= 'a' && ch <= 'z') {
//                lowerCase += ch;
//            } 
//            else if (ch >= '0' && ch <= '9') {
//                numbers += ch;
//            } 
//            else {
//                specialChars += ch;
//            }
//        }
//
//        System.out.println("Uppercase Letters: " + upperCase);
//        System.out.println("Lowercase Letters: " + lowerCase);
//        System.out.println("Numbers: " + numbers);
//        System.out.println("Special Characters: " + specialChars);
		
		String str = "ABCxyz@#$123";

        String upperCase = "";
        String lowerCase = "";
        String numbers = "";
        String specialChars = "";

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            if (ch >= 'A' && ch <= 'Z') {
                upperCase += ch;
            } 
            else if (ch >= 'a' && ch <= 'z') {
                lowerCase += ch;
            } 
            else if (ch >= '0' && ch <= '9') {
                numbers += ch;
            } 
            else {
                specialChars += ch;
            }
        }

        String upperToLower = "";
        for (int k = 0; k < upperCase.length(); k++) {
            char ch = upperCase.charAt(k);
            upperToLower += (char)(ch + 32);
        }

        String lowerToUpper = "";
        for (int k = 0; k < lowerCase.length(); k++) {
            char ch = lowerCase.charAt(k);
            lowerToUpper += (char)(ch - 32);
        }

        System.out.println("Uppercase Letters: " + upperCase);
        System.out.println("Lowercase Letters: " + lowerCase);
        System.out.println("Numbers: " + numbers);
        System.out.println("Special Characters: " + specialChars);
        System.out.println("Uppercase converted to Lowercase: " + upperToLower);
        System.out.println("Lowercase converted to Uppercase: " + lowerToUpper);
		
	}

}
