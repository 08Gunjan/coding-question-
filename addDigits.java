import java.util.*;

public class addDigits {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		int sum=0;
		while(num!=0) {
			int last_digit= num%10;
			sum+=last_digit;
			num=num/10;
			
		}
		System.out.println(sum);

	}

}
