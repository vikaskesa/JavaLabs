package com.abc.LabEx2;
interface Authentication {
	
	boolean checkIdentity(String username, String password);

}
public class password {
	public static void main(String[] args) {

		String name = "KesaVikas";
		String pass = "Vikas@123";
		Authentication p = ((username, password) -> {
			if (username.equals(name) && password.equals(pass))
				return true;
			else
				return false;
		});
		System.out.println(p.checkIdentity("KesaVikas", "Vikas@123"));
	}
}

