package testcases;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pages.HomePage;
import pages.LoginPage;
import projectBase.ProjectSpecificMethods;

public class TC001_LoginLogout extends ProjectSpecificMethods{
	@BeforeTest
	public void setData() {
		excelFileName="createlead";

	}
	@Test(dataProvider="fetchData")
	public void loginTestcase(String userName, String password, String cname, String fname, String lname) {
		new LoginPage()
		.enterUsername(userName)
		.enterPassword(password)
		.clickLogin()
		.clickCRMSFA()
		.clickLead()
		.clickCreateLead()
		.enterCname(cname)
		.enterFname(fname)
		.enterLname(lname)
		.clickCreateLeadButton();
		
		
		
		
		
		
		
		/*LoginPage lp = new LoginPage();
		lp.enterUsername();
		lp.enterPassword();
		lp.clickLogin();
		
		HomePage hp = new HomePage();
		hp.clickLogout();*/
	}
	
	
	
	
	
	
	
	
	
}
