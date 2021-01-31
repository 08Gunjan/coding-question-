import java.util.*;
public class armstrong {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		int temp=num;
		int count=0,sum=0;
		while(num!=0) {
			num=num/10;
			count++;
		}
		num=temp;
		while(num!=0) {
			int last=num%10;
			sum+=Math.pow(last, count);
			num=num/10;
		}
		
		if(sum==temp) {
			System.out.println(temp+"="+sum+" is a Armstrong no");
		}
		else {
			System.out.println(temp+"!="+sum+" is NOT a Armstrong no");
		}
			
	}

}
