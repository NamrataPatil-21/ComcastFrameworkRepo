package java.com.comcast.crm.pom.objectRepositoryUtility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

 //Rule 1: Pom class creation
public class OrganizationsPage {
		WebDriver driver;
		
		//Rule 2: Object identification
		@FindBy(xpath =  "//img[@src='themes/softed/images/btnL3Add.gif']")
		private WebElement createOrgImgLink;
		
		@FindBy(name="search_text")
		private WebElement searchTextbox;
		
		@FindBy(id="bas_searchfield")
		private WebElement searchInSelect;
		
		@FindBy(xpath = "//input[@value=' Search Now ' and @name='submit']")
		private WebElement searchNowBtn;
		
		//Rule 4: Object Encapsulation 
		public WebElement getCreateOrgImgLink() {
			return createOrgImgLink;
		}
		
		public WebElement getsearchTextbox() {
			return searchTextbox;
		}
		
		public WebElement getSearchInSelect() {
			return searchInSelect;
		}
		
		public WebElement getSearchNowBtn() {
			return searchNowBtn;
		}
		
		//Rule 3: Object initialization
	    public OrganizationsPage(WebDriver driver) {
			this.driver=driver;
			PageFactory.initElements(driver, this);
		}
	    
	    //Rule 5: Object utilization
	    public void searchOrg(String orgName, String searchIn) {
	    	searchTextbox.sendKeys(orgName);
	    	Select sel = new Select(searchInSelect);
	    	sel.selectByVisibleText(searchIn);
	    	searchNowBtn.click();
	    }
}