package com.app.TDD;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Testusenamefeature {
	
	@Test
	public void usernametest()
	{
		usenameCode obj = new usenameCode();
		String username = "administrator";
		String username1 ="admin/user";
		String username3 = "admin123";
		
		Assert.assertTrue(obj.isValidusername(username));
		Assert.assertFalse(obj.isValidusername(username1),"This is not valid user");
		Assert.assertTrue(obj.isValidusername(username3));
		
	}

}
