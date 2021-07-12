import java.util.Scanner;

public class Question9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner (System.in);
		System.out.println("enter a digit : ");
		int num= scanner.nextInt();
		
		int sum=0;
int digit =0;
while(num>0) {
	digit=num%10;
	sum=sum+digit;
	num=num/10;
}
System.out.println("sum of the digits of number = "+sum);
	
}
		
}


