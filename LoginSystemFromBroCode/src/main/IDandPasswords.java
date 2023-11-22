package main;

import java.util.HashMap;

public class IDandPasswords {
	
	HashMap<String, String> logInfo = new HashMap<String, String>();
	
	IDandPasswords(){
		logInfo.put("Conrado", "Conrado08");
		logInfo.put("Seila", "1234");
		logInfo.put("Faroferinho", "4321");
		logInfo.put("Dragonzord", "sadee3i");
		logInfo.put("Conta", "Senha");
	}
	
	protected HashMap getLoginInfo(){
		return logInfo;
	}
	
}
