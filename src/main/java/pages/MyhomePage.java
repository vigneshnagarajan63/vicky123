package pages;

import projectBase.ProjectSpecificMethods;

public class MyhomePage extends ProjectSpecificMethods {

	public MyleadsPage clickLead() {
		driver.findElementByLinkText("Leads").click();
		return new MyleadsPage();
}
}