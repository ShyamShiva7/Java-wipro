package flowcontrolstatement;

import java.util.Scanner;

public class oddeven {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         Scanner sc=new Scanner(System.in);
         int n=sc.nextInt();
         /*if(n%2==0) {
        	 System.out.println("even");
         }
         else {
        	 System.out.println("odd");
         }*/
         System.out.println((n&1)==0?"even":"odd");
         
	}

}
