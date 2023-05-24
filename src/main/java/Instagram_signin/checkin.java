package Instagram_signin;
import Instagram_signup.main;
public class checkin {
	  public static void main(String[] args) {
		  String last=" where a.id=";
		  int id=45687969;
		String out=Dao_signin.query(45687969);
		String out1=out+last+id;
		System.out.println(out1);
		StringBuilder sb = new StringBuilder(out1);
		int i = out1.lastIndexOf(",");
		sb.deleteCharAt(i);
		System.out.println(sb);
	}
}
