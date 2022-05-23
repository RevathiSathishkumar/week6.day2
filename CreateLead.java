package week5.day2;

 
import java.io.IOException;

import org.openqa.selenium.By;	
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import utility.ReadExcelDatas;

	public class CreateLead extends ProjtectSpecificMethods {
  
  @Test(dataProvider="testData")
		public void CreateLeads(String username,String password,String companyName,String firstName, String lastName  ) {
			
			driver.findElement(By.id("username")).sendKeys(username);
			driver.findElement(By.id("password")).sendKeys(password);
			driver.findElement(By.className("decorativeSubmit")).click();
			driver.findElement(By.linkText("CRM/SFA")).click();
			driver.findElement(By.linkText("Leads")).click();
			driver.findElement(By.linkText("Create Lead")).click();
			driver.findElement(By.id("createLeadForm_companyName")).sendKeys(companyName);
			driver.findElement(By.id("createLeadForm_firstName")).sendKeys(firstName);
			driver.findElement(By.id("createLeadForm_lastName")).sendKeys(lastName);
			driver.findElement(By.name("submitButton")).click();
			
	}
  /*@DataProvider
  public String[][] testData()
  {
	  String[][] array=new String[2][5];
	  
	  array[0][0] = "DemoSalesManager";
	  array[0][1] ="crmsfa";
	  array[0][2]= "TCS";
	  array[0][3]="Revathi";
	  array[0][4]="Sathishkumar";
	  
	  array[1][0] = "DemoCSR";
	  array[1][1] ="crmsfa";
	  array[1][2]= "CTS";
	  array[1][3]="VIPIN";
	  array[1][4]="KRISH";
	  
	return array;
	  
  } */
  
  @DataProvider
  
  public String[][] testData() throws IOException
  {
	  String[][] readData = ReadExcelDatas.readData("tc001");
	return readData;
	  
  }
  
  
  
	}


