package Instagram_signin;
import java.util.Scanner;
import Instagram_signin.*;
import Instagram_signup.User_detais;
import Instagram_signup.addition_data;

import java.util.*;


 class Scan {
	static Scanner sc=new Scanner(System.in);

}
public class User_signin extends MobileValidation {
		public static void sigin()
		{
			System.out.println("welcome to login page");
			MobileValidation.validate();

		}



	}
	class MobileValidation extends Scan
	{
		static int c=0;
		public static void validate() {
			System.out.println("enter the mobile number");


			String mNumber=sc.next();

			String old_mobile=Dao_signin.mobile(mNumber);
//			System.out.println(old_mobile);
//			System.out.println(mNumber);
			if(mNumber.equals(old_mobile))
			{
				System.out.println("valid mobile number");


				addi_data.pass(mNumber);

			}
			else if(c>=3)
			{
				System.out.println("you mobile number is not exit please signup again");
			    User_detais.userDetails();
			}
			else
			{ 
			    c++;
				System.out.println(c+" "+"mobile number is not exits");
				validate();
			}

		}
}
