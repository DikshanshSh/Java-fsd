package com.app.TDD;

public class usenameCode {
	
public boolean isValidusername(String username) {
		
		if(username.contains("/") || (username.contains("#")))
		{
			return false;
		}
		else if(username.contains("123")){
			return true;
		}
		else
		return true;
	}

}
