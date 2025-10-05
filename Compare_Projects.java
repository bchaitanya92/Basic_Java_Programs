package javaPrograms;

import java.util.Scanner;

public class Compare_Projects {

	public static void main(String[] args) {
		
		Scanner sca = new Scanner(System.in);
		int n = sca.nextInt();
		int [] x= new int[n];
		int [] y= new int[n];
		
		for (int i = 0; i < n; i++) {
			x[i]=sca.nextInt();
		}
		for (int i = 0; i < n; i++) {
			y[i]=sca.nextInt();
		}
		int a=0;
		int b=0;
		for (int i = 0; i < y.length; i++) {
			if (x[i]>y[i]) {
				a++;
			} else if(x[i]<y[i]){
				b++;
			}else {
				continue;
			}
		}
		System.out.println(a);
		System.out.println(b);
		sca.close();

	}

}
