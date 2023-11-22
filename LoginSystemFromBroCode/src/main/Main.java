package main;

public class Main {
	
	public static void main(String args[]) {
		IDandPasswords info = new IDandPasswords();
		
		LoginPage lp = new LoginPage(info.getLoginInfo());
		
	}

}
