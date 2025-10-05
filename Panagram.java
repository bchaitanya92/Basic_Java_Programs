package javaPrograms;

public class Panagram {

    public static void main(String[] args) {
        String str = "The quick brown fox jumps over the lazy dog";
        boolean isPangram = true;

        
        boolean[] alphabetChecklist = new boolean[26];

        
        String lowerCaseStr = str.toLowerCase();

        
        for (int i = 0; i < lowerCaseStr.length(); i++) {
            char ch = lowerCaseStr.charAt(i);

            if (ch >= 'a' && ch <= 'z') {
                alphabetChecklist[ch - 'a'] = true;
            }
        }

        for (boolean letterPresent : alphabetChecklist) {
            if (!letterPresent) {
                isPangram = false;
                break;
            }
        }

        if (isPangram) {
            System.out.println("The string is a pangram.");
        } else {
            System.out.println("The string is not a pangram.");
        }
    }
}