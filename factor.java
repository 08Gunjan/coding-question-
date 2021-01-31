import java.util.*;
public class factor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		int i=1;
		while(i<=num) {
			if(num%i==0) {
				System.out.print(i+",");
			}
			i++;
		}

	}

}
