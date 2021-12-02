package Pages;



	

	import java.util.Iterator;
import java.util.Map;
import java.util.Set;

import net.serenitybdd.core.annotations.findby.FindBy;
	import net.serenitybdd.core.pages.PageObject;
	import net.serenitybdd.core.pages.WebElementFacade;


	public class HomePage extends PageObject{
		
		@FindBy(xpath="//*[@id=\"root\"]/div/div[2]/div/div/div[1]/ul/li[1]/span")
		private WebElementFacade onwayTrip;
		
		@FindBy(xpath="//input[@id='fromCity']")
		private WebElementFacade fromCity;
		
		@FindBy(xpath="//input[@id='toCity']")
		private WebElementFacade toCity;
		
		@FindBy(xpath="//p[@data-cy='submit']/a")
		private WebElementFacade btnSearch;
		
		@FindBy(xpath = "//select[contains(@name,'fromMonth')]")
		public WebElementFacade  fromMonth;
		
		@FindBy(xpath = "//select[contains(@name,'fromDay')]")
		public WebElementFacade  fromDay;
	
		
		public void launchApplication() {
			getDriver().get("https://www.makemytrip.com/");
		}
		public void oneWayTrip(Map<String,String> flightDetails) {
			onwayTrip.click();
			fromCity.selectByVisibleText(flightDetails.get("From"));
			toCity.selectByVisibleText(flightDetails.get("To"));
			String date[]=flightDetails.get("Date").split(" ");
			fromMonth.selectByVisibleText(date[0]);
			fromDay.selectByVisibleText(date[1]);			
		}
		
		public void clickOnSearch() {
			btnSearch.click();
		}
		
	}
