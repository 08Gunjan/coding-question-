import java.util.*;
public class prime {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		int i=2,flag=0;
		if(num==1)
			System.out.print("it is neither prime nor composite");
		else if(num==2)
			System.out.print("it is only even prime no");
		else {
			while(i<num) {
				if(num%i==0) {
					System.out.print("not prime");
					flag=1;
					break;

				}
				i++;
			}
			if(flag==0)
				System.out.println("Prime no "+num);
		}

	}

}
