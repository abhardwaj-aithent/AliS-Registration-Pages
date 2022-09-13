package Register;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class RegistrationPage {

	public static void main(String[] args) throws Exception {
		//Instantiating chrome Driver 
				System.setProperty("webdriver.chrome.driver","C:\\Users\\abhardwaj\\eclipse-workspace\\AliS Demo\\Drivers\\chromedriver.exe");
			
				// Create a chrome Browser Driver 
				WebDriver driver=new ChromeDriver();  //Launch the browser with blank url
				
			
					//Below Command is use to maximize the Browser window 
					    driver.manage().window().maximize();
						
						//Test Steps First Enter the URL :-Navigating the url
						driver.get("  ");
						
						
						//Step1:-To apply for a Clinical Laboratory License Find the Click Here Link and click to Register
						 driver.findElement(By.id("m_LoginControl_LinkButton5")).click();
						 
						 //Set the driver1
						driver.get("http://172.16.1.32/ALiSNJDOH2TESTING11.2.10/LoginNJDOH.aspx");
						 
						 
							String url=driver.getCurrentUrl();
						 if (url.equals("http://172.16.1.32/ALiSNJDOH2TESTING11.2.10/InitialUserRegistration.aspx?ApplicationType=ACLL&LicenseeType=B&BusinessUnitType=CLL&LicenseCategoryCode=CLLB&returnURL=~/LoginRadiation.aspx?TI=0#noback"))
						 {
							 System.out.println("Initial User Registration - Clinical Laboratory Page open Succesflly");
						 }
						 else
						 {
							 System.out.println("User Not able to Reach on ****Initial User Registration - Clinical Laboratory Page***");
						 }
						 
						 
						 //Step2:-User Redirect to Initial User Registration  Page and Fill the all Details.
						
						
						 //Step2:- 
						 //a)Laboratory Information section Fields
						 driver.findElement(By.id("ctl00_ContentPlaceHolder1_ucBeInformation_txtFacilityName")).sendKeys("CLinicalLab Selenium2");
						 Thread.sleep(2000);
						 driver.findElement(By.id("ctl00_ContentPlaceHolder1_ucBeInformation_txtRegisteredName")).sendKeys("CLinicalLab Selenium2");
						 Thread.sleep(2000);
						 
						 
						 /*
						// b)Mailing Address section Fields 
						 WebElement element= driver.findElement(By.name("ctl00$ContentPlaceHolder1$ucAddress$cmbCountry"));
						 Select drpcountry= new Select(element);
					     drpcountry.selectByVisibleText("Canada");
					     */
					     
					     
					
				
						 driver.findElement(By.name("ctl00$ContentPlaceHolder1$ucAddress$txtStreet1")).sendKeys("215 Light House Ave, Cape May Point, NJ 08212");
						 Thread.sleep(2000);
						 driver.findElement(By.name("ctl00$ContentPlaceHolder1$ucAddress$txtStreet2")).sendKeys("215");
						 Thread.sleep(2000);
						 driver.findElement(By.name("ctl00$ContentPlaceHolder1$ucAddress$txtCity")).sendKeys("Cape May Point");
						 Thread.sleep(2000);
						 
						 
						 /*
						 Select drpstate= new Select(driver.findElement(By.name("ctl00$ContentPlaceHolder1$ucAddress$cmbState")));
					     drpstate.selectByVisibleText("NEW JERSEY");
					     Thread.sleep(2000);
					     */
						 
//						 
						 driver.findElement(By.name("ctl00$ContentPlaceHolder1$ucAddress$txtZip")).sendKeys("07303");
						 Thread.sleep(2000);
						 
						 /*
						 Select drpcounty= new Select(driver.findElement(By.name("ctl00$ContentPlaceHolder1$ucAddress$ddlCounty")));
					     drpcounty.selectByVisibleText("Atlantic");
					     drpcounty.selectByIndex(1);
					     Thread.sleep(2000);
					     */
						 
						 WebElement element= driver.findElement(By.name("ctl00$ContentPlaceHolder1$ucAddress$ddlCounty"));
						 Select sel=new Select(element);
						 
						 sel.selectByValue("09");
						 
						 sel.selectByVisibleText("Hudson");
						 
						 sel.selectByIndex(9);
						 
						 
						 /*
						 WebElement firstele=sel.getFirstSelectedOption();
						 System.out.println("first element = "+firstele.getText());
						 */
						  Thread.sleep(2000);
								 
								 
								 
								 
					     driver.findElement(By.name("ctl00$ContentPlaceHolder1$ucAddress$txtPhone")).sendKeys("454-564-5646");
					     Thread.sleep(2000);
					     
					     driver.findElement(By.name("ctl00$ContentPlaceHolder1$ucAddress$txtAltPhone")).sendKeys("787-897-9787");
					     Thread.sleep(2000);
					     
					     
					     driver.findElement(By.name("ctl00$ContentPlaceHolder1$ucAddress$txtFax")).sendKeys("016-166-5495");
					     Thread.sleep(2000);
					     
					     driver.findElement(By.name("ctl00$ContentPlaceHolder1$ucAddress$txtEMail")).sendKeys("abhardwaj@del.aithent.com");
					     Thread.sleep(2000);
					     
					     
					     driver.findElement(By.name("ctl00$ContentPlaceHolder1$ucAddress$txtAltEmail")).sendKeys("Hoshiyars@del.aithent.com");
					     Thread.sleep(2000);
					     
					     
					     
					    // Step 3:- Online Account Information section Details
					     driver.findElement(By.name("ctl00$ContentPlaceHolder1$ucAccountInformation$txtLoginName")).sendKeys("CLinicalLab Selenium2");
					     Thread.sleep(2000);
					     
					     driver.findElement(By.name("ctl00$ContentPlaceHolder1$ucAccountInformation$txtPassword")).sendKeys("Password@1");
					     Thread.sleep(2000);
					     
					     driver.findElement(By.name("ctl00$ContentPlaceHolder1$ucAccountInformation$txtRePassword")).sendKeys("Password@1");
					     Thread.sleep(2000);
					     
					     
					     
					
					
						 //Step 4:-Then Click Register Button
						 driver.findElement(By.id("ctl00_ContentPlaceHolder1_btnSaveNext")).click();

						String url1= driver.getCurrentUrl();
					if (url1.equals(""))
					{
							System.out.println(" User Succesfully redirected to Prelimiary Page");
					}
					else
					{
					       System.out.println(" !!!!!OOPS There Might be some Problem in Login !!!!"
					       		+ "User Not able to  redirected to Prelimiary Page");
						
					}
					}
			



	}

