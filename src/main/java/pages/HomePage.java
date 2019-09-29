package pages;

import projectBase.ProjectSpecificMethods;

public class HomePage extends ProjectSpecificMethods{

public MyhomePage clickCRMSFA() {
		
		driver.findElementByLinkText("CRM/SFA").click();
		return new MyhomePage();
}
	
}
