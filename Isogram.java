package javaPrograms;

public class Isogram {

    public static void main(String[] args) {
        String str = "background";

        char[] chars = str.toLowerCase().toCharArray();

        for (int i = 0; i < chars.length; i++) {
            if (!(chars[i] >= 'a' && chars[i] <= 'z')) {
                continue;
            }
            
            for (int j = i + 1; j < chars.length; j++) {
                if (chars[i] == chars[j]) {
                    System.out.println("is not an isogram.");
                    return; 
                }
            }
        }

        
        System.out.println("is an isogram.");
    }
}