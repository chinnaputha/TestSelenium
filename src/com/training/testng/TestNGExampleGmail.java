package com.training.testng;

import org.testng.annotations.Test;

public class TestNGExampleGmail {
	
	/**
	 * method for open brower using allpication url
	 */
	@Test(description ="method to launch appliation url")
	public void openBrowserWithApplication(){
		
	}
	
	
	@Test(dependsOnMethods="openBrowserWithApplication",description="entering username")
	public void enteruserdetails(){
		
	}
	
	@Test(dependsOnMethods="enteruserdetails")
	public void enterPasswordDetails(){
		System.out.println("logout");
	}
	
	@Test(dependsOnMethods="enterPasswordDetails")
	public void validateInboxPage(){
		
	}

}
