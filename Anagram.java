package javaPrograms;

public class Anagram {

    public static void main(String[] args) {
        
        String str1 = "EARTH";
        String str2 = "HEART";
        
        System.out.println("String 1: " + str1);
        System.out.println("String 2: " + str2);

        if (str1.length() != str2.length()) {
            System.out.println("NOT Anagrams");
            return; 
        }

        char[] a1 = str1.toCharArray();
        char[] a2 = str2.toCharArray();
        
        int n1 = a1.length;
        for (int i = 0; i < n1 - 1; i++) {
            for (int j = 0; j < n1 - i - 1; j++) {
                if (a1[j] > a1[j + 1]) {
                    char temp = a1[j];
                    a1[j] = a1[j + 1];
                    a1[j + 1] = temp;
                }
            }
        }
        
        int n2 = a2.length;
        for (int i = 0; i < n2 - 1; i++) {
            for (int j = 0; j < n2 - i - 1; j++) {
                if (a2[j] > a2[j + 1]) {
                    char temp = a2[j];
                    a2[j] = a2[j + 1];
                    a2[j + 1] = temp;
                }
            }
        }
        
        boolean areEqual = true;
        for (int i = 0; i < a1.length; i++) {
            if (a1[i] != a2[i]) {
                areEqual = false;
                break; 
            }
        }
        
        if (areEqual) {
            System.out.println("Anagrams");
        } else {
            System.out.println("NOT Anagrams");
        }
    }
}
