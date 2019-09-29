package pages;

import projectBase.ProjectSpecificMethods;

public class MyleadsPage extends ProjectSpecificMethods{
	public CreateLeads clickCreateLead() {
	    driver.findElementByLinkText("Create Lead").click();
	    return new CreateLeads();
}
}