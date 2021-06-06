package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class loginPage {
	
	
	WebDriver driver;
	
	//By linkLogin =By.xpath("//*[@id=\"login\"]/a");

    By userName = By.name("username");

    By password = By.id("password");

    By login = By.xpath("//*[@id=\"loginForm\"]/div[3]/div/input[2]");

    public loginPage(WebDriver driver){

        this.driver = driver;

    }
    
   /* public void linkLogin(){

        driver.findElement(linkLogin).click();
    }*/

    //Set user name in textbox

    public void userName(String strUserName){

        driver.findElement(userName).sendKeys(strUserName);

    }

    //Set password in password textbox

    public void password(String strPassword){

         driver.findElement(password).sendKeys(strPassword);

    }

    //Click on login button

    public void login(){

            driver.findElement(login).click();

    }

    //Get the title of Login Page

    public String getLoginTitle(){

     return driver.getTitle();

    }

    /**

     * This POM method will be exposed in test case to login in the application

     * @param strUserName

     * @param strPasword

     * @return

     */

    public void loginToMedicare(String strUserName,String strPasword){

    	this.loginLink();
    	//Fill user name

        this.userName(strUserName);

        //Fill password

        this.password(strPasword);

        //Click Login button

        this.login();        
    }

	private void loginLink() {
		// TODO Auto-generated method stub
		
	}

	
}
