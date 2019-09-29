package pages;

import projectBase.ProjectSpecificMethods;

public class ViewLeads extends ProjectSpecificMethods{
	public ViewLeads(){
		driver.findElementByLinkText("Edit").click();
}
}