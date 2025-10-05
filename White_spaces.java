package javaPrograms;

public class White_spaces {

	public static void main(String[] args) {
		
		String a = "";
		String str = " chaitanya ";
		
		for (int i=0;i<=str.length();i++) {
			if(str.charAt(i) != ' ') {
				a+=str.charAt(i);
			}
		}
		System.out.println("new: " +a);

	}

}
