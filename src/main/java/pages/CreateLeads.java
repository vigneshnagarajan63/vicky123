package pages;

import projectBase.ProjectSpecificMethods;

public class CreateLeads extends ProjectSpecificMethods{
	
	public CreateLeads enterCname(String companyName) {
		driver.findElementById("createLeadForm_companyName").sendKeys(companyName);
		return this;

	}
	public CreateLeads enterFname(String firstName) {
		driver.findElementById("createLeadForm_firstName").sendKeys(firstName);
		return this;
		
	}
	public CreateLeads enterLname(String lastName) {
		
		driver.findElementById("createLeadForm_lastName").sendKeys(lastName);	
		return this;

	}
	public ViewLeads clickCreateLeadButton() {
		
		driver.findElementByXPath("//input[@class='smallSubmit']").click();
		return new ViewLeads();
}
}