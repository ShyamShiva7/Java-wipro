package flowcontrolstatement;

import java.util.Scanner;

public class charvariable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Scanner sc=new Scanner(System.in);
      char ch=sc.next().charAt(0);
      if((ch>=65 && ch<=90 ) || (ch>=97 && ch<=122)){
    	  System.out.println("alphabet");
      }
      else if(ch>='0' && ch<='9') {
    	  System.out.println("digit");
      }
      else {
    	  System.out.println("special character");
      }
	}

}
