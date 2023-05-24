package Instagram_signin;
import Instagram_signup.User_detais;
public class Validation {

		public static boolean valid(String name) {
			// TODO Auto-generated method stub
			if(name.equals(name.toUpperCase()))
			{		
//				System.out.println("u entered valid format");
				return true;
			}
			else
			{
				return false;
//				System.out.println("please enter the name uppercase format only");
//			ValiUser_detais.enter_name();
			}
		}
}
