package javaPrograms;

public class Panagram1 {

	public static void main(String[] args) {
		String str="The Quick Brown Fox Jumps Over Lazy Dog";
		str=str.replace(" ","");
		str=str.toLowerCase();
		char[] c= str.toCharArray();
		int size=str.length();
		int[] arr= {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0};
		System.out.println(arr.length);
		int i=0;
		while(i!=size) {
			int index=c[i]-97;
			arr[index]=1;
			++i;
		}
		i=0;
		while(i!=arr.length) {
			if(arr[i]==1) {
				++i;
			}else {
				System.out.println("not panagram");
				System.exit(0);
			}
		}
		System.out.println("it is a panagram");
	}
		
}
