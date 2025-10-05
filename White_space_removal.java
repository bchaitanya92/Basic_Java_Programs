package javaPrograms;

public class White_space_removal {

	public static void main(String[] args) {
		
		String str ="  Hell0   My   Name is  Chaitanya.  ";
		char[] c = str.toCharArray();
		String res = "";
		boolean space = false;
		boolean start = false;
		
		for (int i = 0; i < c.length; i++) {
			if (c[i] != ' ') {
				res += c[i];
				start = true;
				space = false;
			} else if (start && !space){
				res = res + c[i];
				//res += ' ';
				space=true;
			}
		}
		System.out.println(res);
	}

}
