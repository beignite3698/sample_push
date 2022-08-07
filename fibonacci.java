package Recursion_pro;

import java.util.Scanner;

public class fibonacci {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int no = sc.nextInt();
		int i = 1;
		while(i<=no) {
			int a = sc.nextInt();
			int first=0;
			int second=1;
			int sum;
			if(a==0 || a==1) {
				System.out.println(true);
			}
			else{				
				for(int j=0; j<=a; j++) {
					//System.out.println(first);
					sum=first+second;
					first=second;
					second=sum;			
				}
				if(first==a) {
					System.out.println(true);
				}
				else {
					System.out.println(false);
				}	
			}
		}
	}
}
