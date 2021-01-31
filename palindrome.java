import java.util.*;
public class palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Scanner sc=new Scanner(System.in);
       int num=sc.nextInt();
       int temp =num;
       int count=0,sum=0;
       while(num!=0) {
    	   num=num/10;
    	   count++;
       }
       num=temp;
       int a=count-1;
       while(num!=0) {
    	   int last_digit=num%10;
    	   sum+=last_digit*Math.pow(10, a);
    	   a--;
    	   num=num/10;
    	 
       }
       if(sum==temp)
    	   System.out.println(sum+" is a palindrome number");
       else
    	   System.out.println(sum+" is a NOT palindrome number");
	}

}
