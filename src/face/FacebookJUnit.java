package face;

import java.util.concurrent.TimeUnit;

import org.junit.Test;
import org.junit.runner.RunWith;

import junitparams.FileParameters;
import junitparams.JUnitParamsRunner;

@RunWith(JUnitParamsRunner.class)
public class FacebookJUnit extends FacebookBase{
	
	@Test
	@FileParameters("./data/params.csv")
	public void testFacebookLogin(String browser, String url,
			String user, String password, String friendName) {
		
		setUp(browser, url);
		
		logIntoFacebook(user, password);
		
		searchFacebookFriend(friendName);
	
		sendMenssage();
		
		
		
		
		
	}

	

	

	

}
