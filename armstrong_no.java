package Recursion_pro;
public class armstrong_no {
	static int no = 1634;
	static int sum = 0;
	public static void main(String[] args) {	
	int no1 = no;
	int count = 0;
	
	check(no,count,no1);
	if(sum==no) {
		System.out.println("armstrong");
	}
	else {
		System.out.println("not"); 
	}
	}
	public static void check(int no,int count,int no1) {
		if(no>0) {			
			count++;
			check(no=no/10,count,no1);
		}
		else {			
			System.out.println("total digits are- "+count);
			int temp = 1;
			last_digit(no1,count,temp);	
		}
	}	
	public static void last_digit(int no1,int count,int temp){
		if(no1>0) {
			temp = no1%10;
			powr(temp,count,1);				
			last_digit(no1=no1/10,count,temp=1);
		}
	}	
	public static void powr(int base,int pow,int temp) {
		if(pow>=1) {
			temp = temp*base;
			powr(base,pow-1,temp);
		}
		else {
			//System.out.println(temp);
			
			armstrong(temp);
		}
	}
	public static void armstrong(int temp){		
		sum = sum+temp;
		}
	
}
