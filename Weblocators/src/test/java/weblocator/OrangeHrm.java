package weblocator;

import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;


public class OrangeHrm {
		WebDriver chromedriver;
		
		By UsernameElement = By.xpath("//input[@name=\"username\"]");
		By PasswordElement = By.name("password");
		By LoginBtnElement = By.xpath("//button[@type=\"submit\"]");
		
		By MyInfoElement = By.xpath("//span[text()=\"My Info\"]");
		
		By ContactDetailsElement = By.xpath("//a[text()='Contact Details']");
		By Street1Element =By.xpath("//form[@class=\"oxd-form\"]/div/div/div/div/div[2]/input");
		By Street2Element = By.xpath("//form[@class=\"oxd-form\"]/div/div/div[2]/div/div[2]/input");
		By CityElement = By.xpath("//form[@class=\"oxd-form\"]/div/div/div[3]/div/div[2]/input");
		By StateElement = By.xpath("//form[@class=\"oxd-form\"]/div/div/div[4]/div/div[2]/input");
		By PostalCodeElement = By.xpath("//form[@class=\"oxd-form\"]/div/div/div[5]/div/div[2]/input");
		By CountryDrpdwnClickElement = By.xpath("//i[@class=\"oxd-icon bi-caret-down-fill oxd-select-text--arrow\"]");
		By CountrySelectionElement = By.xpath("//div[@role='listbox']//*[text()='United States']");
		By HomePhoneElement = By.xpath("//div[2][@class=\"oxd-form-row\"]/div/div/div/div[2]//input");
		By MobilePhoneElement = By.xpath("//form[@class=\"oxd-form\"]/div[2]/div/div[2]/div/div[2]/input");
		By WorkTelephoneElement = By.xpath("//form[@class=\"oxd-form\"]/div[2]/div/div[3]/div/div[2]/input");
		By WorkEmailElement = By.xpath("//form[@class=\"oxd-form\"]/div[3]/div/div/div/div[2]/input");
		By OtherEmailElement = By.xpath("//form[@class=\"oxd-form\"]/div[3]/div/div[2]/div/div[2]/input");
		By SaveContactElement = By.xpath("//form[@class=\"oxd-form\"]/div[4]/button");	
		
		By EmergencyContactsElement = By.xpath("//div[@role=\"tablist\"]/div[3]/a");		
		By AddEmergencyElement = By.xpath("//h6[text()=\"Assigned Emergency Contacts\"]/../button");
		By NameElement = By.xpath("//form[@class=\"oxd-form\"]/div/div/div/div/div[2]/input");
		By RelationshipElement = By.xpath("//form[@class=\"oxd-form\"]/div/div/div[2]/div/div[2]/input");
		By HomeTelephoneElement = By.xpath("//form[@class=\"oxd-form\"]/div[2]/div/div/div/div[2]/input");
		By MobileElement = By.xpath("//form[@class=\"oxd-form\"]/div[2]/div/div[2]/div/div[2]/input");
		By SaveEmergencyElement = By.xpath("//div[@class=\"oxd-form-actions\"]/button[2]");
		
		By DependentsElement = By.xpath("//div[@role=\"dialog\"]/..//div/div/div/div/div[4]/a");
		By AddDependentsElement = By.xpath("//div[@role=\"dialog\"]/..//div/button");
		By DependentNameElement = By.xpath("//form[@class=\"oxd-form\"]/div/div/div/div/div[2]/input");
		By RelationshipDropdownClickElement = By.className("oxd-select-text-input");
		By DependentRelationshipElement = By.xpath("//div[@role=\"listbox\"]//*[text()=\"Child\"]");
		By DateOfBirthElement = By.xpath("//input[@placeholder=\"yyyy-mm-dd\"]");
		By DependantSaveElement = By.xpath("//button[@type=\"submit\"]");
		
		By RecruitmentElement = By.xpath("//span[@class=\"oxd-text oxd-text--span oxd-main-menu-item--name\"]/../../../li[5]/a");
		By AddCandidateElement = By.xpath("//form[@class=\"oxd-form\"]/../../../div[2]/div/button/i");
		By CandidateFirstnameElement = By.xpath("//input[@name=\"firstName\"]");
		By CandidateMiddlenameElement = By.name("middleName");
		By CandidateLastnameElement = By.name("lastName");
		By CanVacancyDropdwnElement = By.xpath("//form[@class=\"oxd-form\"]/div/div/div[1]//div/i");
		By CanVacancySelectionElement = By.xpath("//div[@role=\"listbox\"]//*[text()=\"Senior QA Lead\"]");
		By CandidateEmailElement = By.xpath("//form[@class=\"oxd-form\"]/div[3]/div/div/div/div[2]/input");
		By CanContactNumberElement = By.xpath("//form[@class=\"oxd-form\"]/div[3]/div/div[2]/div/div[2]/input");
		By CandidateResumeElement = By.className("oxd-file-button");
		By KeywordsElement = By.xpath("//form[@class=\"oxd-form\"]/div[5]/div/div/div/div[2]/input");
		By DateofApplicationElement = By.xpath("//div[@class=\"oxd-date-input\"]/input");
		By NotesElement = By.xpath("//form[@class=\"oxd-form\"]/div[6]/div/div/div/div[2]/textarea");
		By CandidateSaveElement = By.xpath("//form[@class=\"oxd-form\"]/div[8]/button[2]");
		
		By ShortlistElement = By.xpath("//form[@class=\"oxd-form\"]/div[2]/div/button[2]");
		By ShortlistNotesElement = By.xpath("//form[@class=\"oxd-form\"]/div[2]/div/div/div/div[2]/textarea");
		By ShortlistSaveElement = By.xpath("//form[@class=\"oxd-form\"]/div[3]/button[2]");
		
		By ScheduleInterviewElement = By.xpath("//form[@class=\"oxd-form\"]/div[2]/div[2]/button[2]");
		By InterviewTitleElement = By.xpath("//form[@class=\"oxd-form\"]/div[2]/div/div/div/div[2]/input");
		By InterviewerElement = By.xpath("//input[@include-employees='onlyCurrent']");
		By InterviewerSelectionElement = By.xpath("//div[@role='listbox']//*[contains(text(),'Odis  Adalwin')]");
		By InterviewDateElement = By.xpath("//div[@class=\"oxd-date-input\"]/input");
		By InterviewTimeElement = By.xpath("//div[@class=\"oxd-time-wrapper\"]/div/input");
		By FinalNotesElement = By.xpath("//form[@class=\"oxd-form\"]//div/div[5]/div/div[2]/textarea");
		By SaveCandidateInfoElement = By.xpath("//form[@class=\"oxd-form\"]/div[3]/button[2]");
		
		By MarkInterviewPassedElement =By.xpath("//form[@class=\"oxd-form\"]/div[2]/div/button[3]");
		By InterviewNotesElement = By.xpath("//form[@class=\"oxd-form\"]/div[2]/div/div/div/div[2]/textarea");
		By SaveInterviewdetailsElement = By.xpath("//form[@class=\"oxd-form\"]/div[3]/button[2]");
		
		By OfferJobElement = By.xpath("//form[@class=\"oxd-form\"]/div[2]/div[2]/button[3]");
		By JobOfferComments = By.xpath("//form[@class=\"oxd-form\"]/div[2]/div/div/div/div[2]/textarea");
		By SaveJobOfferDetails = By.xpath("//form[@class=\"oxd-form\"]/div[3]/button[2]");
		
		By HiretheCandidateElement = By.xpath("//form[@class=\"oxd-form\"]/div[2]/div[2]/button[3]");
		By HiredCommentsElement = By.xpath("//form[@class=\"oxd-form\"]/div[2]/div/div/div/div[2]/textarea");
		By SaveHiredElement = By.xpath("//form[@class=\"oxd-form\"]/div[3]/button[2]");
		
		//xpaths for table heading and first row  
		By CandidateInfoTableElement =By.xpath("//div[@class=\"oxd-table-header\"]/div");
		By CandidateHistoryelement =By.xpath("//div[@class='oxd-table-card']");
		
		By ListButtonElement = By.xpath("//button[@class=\"oxd-icon-button\"]/i");
		By CandidateNameSearchTxtbox = By.xpath("//div[@class=\"oxd-autocomplete-wrapper\"]/div/input");
		By FirstCandidateFetchedElement = By.xpath("//form[@class=\"oxd-form\"]//*[contains(text(),'Jennifer  Clinton')]");
		By CandidateButtonSearchElement = By.xpath("//div[@class=\"oxd-form-actions\"]/button[2]");
		
		By AdminElement = By.xpath("//span[text()='Admin']");
		By AdminAddRoleBtnElement = By.xpath("//div[@class='orangehrm-paper-container']/div/button");
	
		By UserRoleDrpdwnElement = By.xpath("//div[@class=\"oxd-select-text oxd-select-text--active\"]/div/i");
		By UserRoleSelectionElement =By.xpath("//div[@role='listbox']//*[text()='ESS']");

		By StatusDrpdwnElement = By.xpath("//form[@class=\"oxd-form\"]/div/div/div[3]/div/div[2]/div/div/div/i");
		//By StatusDrpdwnElement = By.xpath("//form[@class=\"oxd-form-row\"]/div/div[3]/div/div[2]/div/div/div");
		By StatusSelectionElement = By.xpath("//div[@role='listbox']//*[text()='Enabled']");

		By EmployeeNameHintElement = By.xpath("//div[@class=\"oxd-autocomplete-wrapper\"]/div/input");	
		By EmployeenameSelection = By.xpath("//div[text()=\"Pushpavalli Kumari Mandim\"]");
		
		By UserName1Element = By.xpath("//form[@class=\"oxd-form\"]/div/div/div[4]/div/div/input");		
		By AdminPasswordElement = By.xpath("//form[@class=\"oxd-form\"]/div[2]/div/div/div/div[2]/input");
		By ConfirmPasswordElement = By.xpath("//form[@class=\"oxd-form\"]/div[2]/div/div[2]/div/div[2]/input");
		By EssUserSaveElement = By.xpath("//form[@class=\"oxd-form\"]/div[3]/button[2]");
		By LogoutDrpdwnElement = By.xpath("//i[@class=\"oxd-icon bi-caret-down-fill oxd-userdropdown-icon\"]");
		By LogOutElement = By.xpath("//a[text()=\"Logout\"]");
		
		By LeaveElement = By.xpath("//ul[@class=\"oxd-main-menu\"]/li[3]/a");
		By ApplyLeaveElement = By.xpath("//nav[@aria-label=\"Topbar Menu\"]/ul/li/a");
		
		By StartDateDrpdwnElement = By.xpath("//div[@class=\"oxd-date-input\"]/i[1]");
		By StartDateLeaveSelection = By.xpath("//div[@class=\"oxd-form-row\"]/div/div/div/div[2]/div/div/input");
		By EndDateDrpdwnElement = By.xpath("//div[@class=\\\"oxd-date-input\\\"]/i[2]");
		By EndDateLeaveSelection = By.xpath("//div[@class=\\\"oxd-form-row\\\"]/div/div/div/div[2]/div/div/input");
		
		//By LogoutUserElement = By.xpath("//span[@class=\"oxd-userdropdown-tab\"]/i");
		//By LogoutUserSelection = By.xpath("");
		
	@Test
	public void OrangeHrmassignment() throws InterruptedException {		
		chromedriver = new ChromeDriver();
		
	chromedriver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	chromedriver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

	chromedriver.manage().window().maximize();
	chromedriver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

	JavascriptExecutor js = (JavascriptExecutor) chromedriver;
    Actions action = new Actions(chromedriver);

	// 1.Login with given credentials
	chromedriver.findElement(UsernameElement).sendKeys("Admin");
	chromedriver.findElement(PasswordElement).sendKeys("admin123");
	chromedriver.findElement(LoginBtnElement).click();	

		
	// 2. Navigate to My info - > Contact Details, enter contact details and press save button 
	chromedriver.findElement(MyInfoElement).click();
	chromedriver.findElement(ContactDetailsElement).click();
	//write address, contact details and pincode xpaths
	chromedriver.findElement(Street1Element).click();
	chromedriver.findElement(Street1Element).sendKeys(Keys.CONTROL+"A");
	chromedriver.findElement(Street1Element).sendKeys(Keys.BACK_SPACE);
	chromedriver.findElement(Street1Element).sendKeys("Prescott Drive");
	
	chromedriver.findElement(Street2Element).click();
	chromedriver.findElement(Street2Element).sendKeys(Keys.CONTROL+"A");
	chromedriver.findElement(Street2Element).sendKeys(Keys.BACK_SPACE);
	chromedriver.findElement(Street2Element).sendKeys("Apt102");
	
	chromedriver.findElement(CityElement).click();
	chromedriver.findElement(CityElement).sendKeys(Keys.CONTROL+"A");
	chromedriver.findElement(CityElement).sendKeys(Keys.BACK_SPACE);
	chromedriver.findElement(CityElement).sendKeys("Vienna");
	Thread.sleep(1000);
	
	chromedriver.findElement(StateElement).click();
	chromedriver.findElement(StateElement).sendKeys(Keys.CONTROL+"A");
	chromedriver.findElement(StateElement).sendKeys(Keys.BACK_SPACE);
	chromedriver.findElement(StateElement).sendKeys("NorthCarolina");
	Thread.sleep(1000);
	
	chromedriver.findElement(PostalCodeElement).click();
	chromedriver.findElement(PostalCodeElement).sendKeys(Keys.CONTROL+"A");
	chromedriver.findElement(PostalCodeElement).sendKeys(Keys.BACK_SPACE);
	chromedriver.findElement(PostalCodeElement).sendKeys("22182");
	Thread.sleep(1000);
	
	chromedriver.findElement(CountryDrpdwnClickElement).click();	
	chromedriver.findElement(CountrySelectionElement).click();
	Thread.sleep(1000);
	
	chromedriver.findElement(HomePhoneElement).click();
	chromedriver.findElement(HomePhoneElement).sendKeys(Keys.CONTROL+"A");
	chromedriver.findElement(HomePhoneElement).sendKeys(Keys.BACK_SPACE);
	chromedriver.findElement(HomePhoneElement).sendKeys("9958101816");
	Thread.sleep(1000);
	
	chromedriver.findElement(MobilePhoneElement).click();
	chromedriver.findElement(MobilePhoneElement).sendKeys(Keys.CONTROL+"A");
	chromedriver.findElement(MobilePhoneElement).sendKeys(Keys.BACK_SPACE);
	chromedriver.findElement(MobilePhoneElement).sendKeys("7034791935");
	Thread.sleep(1000);
	
	chromedriver.findElement(WorkTelephoneElement).click();
	chromedriver.findElement(WorkTelephoneElement).sendKeys(Keys.CONTROL+"A");
	chromedriver.findElement(WorkTelephoneElement).sendKeys(Keys.BACK_SPACE);
	chromedriver.findElement(WorkTelephoneElement).sendKeys("9704073836");
	Thread.sleep(1000);
	
	chromedriver.findElement(WorkEmailElement).click();
	chromedriver.findElement(WorkEmailElement).sendKeys(Keys.CONTROL+"A");
	chromedriver.findElement(WorkEmailElement).sendKeys(Keys.BACK_SPACE);
	chromedriver.findElement(WorkEmailElement).sendKeys("jangampo@gmail.com");
	Thread.sleep(1000);
	
	chromedriver.findElement(OtherEmailElement).click();
	chromedriver.findElement(OtherEmailElement).sendKeys(Keys.CONTROL+"A");
	chromedriver.findElement(OtherEmailElement).sendKeys(Keys.BACK_SPACE);
	chromedriver.findElement(OtherEmailElement).sendKeys("jedidya98@gmail.com");
	Thread.sleep(2000);
	
	chromedriver.findElement(SaveContactElement).click();
	
	// 3. Navigate to Emergency contacts and add details 
	
	chromedriver.findElement(EmergencyContactsElement).click();
	chromedriver.findElement(AddEmergencyElement).click();
	
	chromedriver.findElement(NameElement).click();
	chromedriver.findElement(NameElement).sendKeys(Keys.CONTROL+"A");
	chromedriver.findElement(NameElement).sendKeys(Keys.BACK_SPACE);
	chromedriver.findElement(NameElement).sendKeys("Vallidevi");
	Thread.sleep(1000);
	
	chromedriver.findElement(RelationshipElement).click();
	chromedriver.findElement(RelationshipElement).sendKeys(Keys.CONTROL+"A");
	chromedriver.findElement(RelationshipElement).sendKeys(Keys.BACK_SPACE);
	chromedriver.findElement(RelationshipElement).sendKeys("Friend");
	Thread.sleep(1000);
	
	chromedriver.findElement(HomeTelephoneElement).click();
	chromedriver.findElement(HomeTelephoneElement).sendKeys(Keys.CONTROL+"A");
	chromedriver.findElement(HomeTelephoneElement).sendKeys(Keys.BACK_SPACE);
	chromedriver.findElement(HomeTelephoneElement).sendKeys("5713139641");
	Thread.sleep(1000);

	chromedriver.findElement(MobileElement).click();
	chromedriver.findElement(MobileElement).sendKeys(Keys.CONTROL+"A");
	chromedriver.findElement(MobileElement).sendKeys(Keys.BACK_SPACE);
	chromedriver.findElement(MobileElement).sendKeys("7039537352");
	Thread.sleep(1000);

	chromedriver.findElement(WorkTelephoneElement).click();
	chromedriver.findElement(WorkTelephoneElement).sendKeys(Keys.CONTROL+"A");
	chromedriver.findElement(WorkTelephoneElement).sendKeys(Keys.BACK_SPACE);
	chromedriver.findElement(WorkTelephoneElement).sendKeys("1234567890");
	Thread.sleep(1000);

	chromedriver.findElement(SaveEmergencyElement).click();	
	Thread.sleep(1000);

	//4.Navigate to Dependents and add dependents 
	
	chromedriver.findElement(DependentsElement).click();
	chromedriver.findElement(AddDependentsElement).click();
	Thread.sleep(1000);

	chromedriver.findElement(DependentNameElement).click();
	chromedriver.findElement(DependentNameElement).sendKeys(Keys.CONTROL+"A");
	chromedriver.findElement(DependentNameElement).sendKeys(Keys.BACK_SPACE);
	chromedriver.findElement(DependentNameElement).sendKeys("Joshua");
	Thread.sleep(1000);

	chromedriver.findElement(RelationshipDropdownClickElement).click();
	chromedriver.findElement(DependentRelationshipElement).click();
	
	chromedriver.findElement(DateOfBirthElement).click();
	chromedriver.findElement(DateOfBirthElement).sendKeys("2022-12-27");
	
	chromedriver.findElement(DependantSaveElement);
	Thread.sleep(1000);
	
	//5.Navigate to recruitment menu and add a candidate 
	chromedriver.findElement(RecruitmentElement).click();
	chromedriver.findElement(AddCandidateElement).click();
	
	chromedriver.findElement(CandidateFirstnameElement).click();
	chromedriver.findElement(CandidateFirstnameElement).sendKeys("Pushpavalli");
	Thread.sleep(1000);

	chromedriver.findElement(CandidateMiddlenameElement).click();
	chromedriver.findElement(CandidateMiddlenameElement).sendKeys("Kumari");
	Thread.sleep(1000);

	chromedriver.findElement(CandidateLastnameElement).click();
	chromedriver.findElement(CandidateLastnameElement).sendKeys("Mandim");
	Thread.sleep(1000);
	
	chromedriver.findElement(CanVacancyDropdwnElement).click();
	chromedriver.findElement(CanVacancySelectionElement).click();
	
	chromedriver.findElement(CandidateEmailElement).click();
	chromedriver.findElement(CandidateEmailElement).sendKeys("pushpa.va@gmail.com");
	Thread.sleep(1000);
	
	chromedriver.findElement(CanContactNumberElement).click();
	chromedriver.findElement(CanContactNumberElement).sendKeys("978654321");
	Thread.sleep(1000);
	
	// using xpath, to click on browse element 
	//chromedriver.findElement(CandidateResumeElement).click();
    
	chromedriver.findElement(KeywordsElement).click();
	chromedriver.findElement(KeywordsElement).sendKeys("Specialized as Software Test Engineer");
	Thread.sleep(1000);
	
	chromedriver.findElement(DateofApplicationElement).click();
	chromedriver.findElement(DateofApplicationElement).sendKeys(Keys.CONTROL+"A");
	chromedriver.findElement(DateofApplicationElement).sendKeys(Keys.BACK_SPACE);
	chromedriver.findElement(DateofApplicationElement).sendKeys("2022-12-25");
	Thread.sleep(1000);
	
	chromedriver.findElement(NotesElement).click();
	chromedriver.findElement(NotesElement).sendKeys("Candidate is fit for the job");
	Thread.sleep(1000);

	chromedriver.findElement(CandidateSaveElement).click();
	
	//6. Shortlist the candidate and schedule the interview 
	chromedriver.findElement(ShortlistElement).click();
	
	chromedriver.findElement(ShortlistNotesElement).click();
	chromedriver.findElement(ShortlistNotesElement).sendKeys("Candidate is shortlisted");
	Thread.sleep(1000);
	
	chromedriver.findElement(ShortlistSaveElement).click();
	chromedriver.findElement(ScheduleInterviewElement).click();
	Thread.sleep(1000);
	
	chromedriver.findElement(InterviewTitleElement).click();
	chromedriver.findElement(InterviewTitleElement).sendKeys(Keys.CONTROL+"A");
	chromedriver.findElement(InterviewTitleElement).sendKeys(Keys.BACK_SPACE);
	chromedriver.findElement(InterviewTitleElement).sendKeys("Interview is scheduled");
	Thread.sleep(1000);
	
	chromedriver.findElement(InterviewerElement).click();
	chromedriver.findElement(InterviewerElement).sendKeys("Odis"+Keys.DOWN);
	Thread.sleep(1000);
	chromedriver.findElement(InterviewerSelectionElement).click();
	
	chromedriver.findElement(InterviewDateElement).click();
	chromedriver.findElement(InterviewDateElement).sendKeys("2022-12-31");
	

	chromedriver.findElement(InterviewTimeElement).click();
	chromedriver.findElement(InterviewTimeElement).sendKeys(Keys.CONTROL+"A");
	chromedriver.findElement(InterviewTimeElement).sendKeys(Keys.BACK_SPACE);
	chromedriver.findElement(InterviewTimeElement).sendKeys("11:00 AM");
	Thread.sleep(1000);
	
	chromedriver.findElement(FinalNotesElement).click();
	chromedriver.findElement(FinalNotesElement).sendKeys("None");
	Thread.sleep(1000);
	chromedriver.findElement(SaveCandidateInfoElement).click();
	
	
	// 7.Mark the interview passed and offer job1 
	chromedriver.findElement(MarkInterviewPassedElement).click();
	chromedriver.findElement(InterviewNotesElement).click();
	chromedriver.findElement(InterviewNotesElement).sendKeys("Interview done");
	Thread.sleep(1000);
	chromedriver.findElement(SaveInterviewdetailsElement).click();
	chromedriver.findElement(OfferJobElement).click();
	chromedriver.findElement(JobOfferComments).click();
	chromedriver.findElement(JobOfferComments).sendKeys("Interview done successfully");
	Thread.sleep(1000);
	chromedriver.findElement(SaveJobOfferDetails).click();
	
	
	// 8.Hire the candidate and print the candidate history(table) 
	chromedriver.findElement(HiretheCandidateElement).click();
	chromedriver.findElement(HiredCommentsElement).click();
	chromedriver.findElement(HiredCommentsElement).sendKeys("Candidate is hired");
	Thread.sleep(1000);
	chromedriver.findElement(SaveHiredElement).click();
	
	
	//To print heading of the Candidate table
	String CandidateTableElement = chromedriver.findElement(CandidateInfoTableElement).getText();
	System.out.print("                         " +CandidateTableElement);
	
	//To print all the rows
	int NofCandidateinforows =  chromedriver.findElements(CandidateHistoryelement).size();

	for (int i=1; i<=NofCandidateinforows; i++) {
		
		//To print all rows of DATE column
		WebElement CandidateInfoDate = chromedriver.findElement(By.xpath("//div[@class=\"oxd-table-body\"]/div["+i+"]/div/div"));
		//To print all rows of Description column
		WebElement CandidateInfoDescription = chromedriver.findElement(By.xpath("//div[@class=\"oxd-table-body\"]/div["+i+"]/div/div[2]"));
		String CandidatinfoDaterows = CandidateInfoDate.getText();
		String CandidatinfoDescriptionrows = CandidateInfoDescription.getText();
		System.out.println(CandidatinfoDaterows);
		System.out.print("     " +CandidatinfoDescriptionrows);    
	}
		
	//9. Navigate back to the Recruitment tab and search for the above candidate and verify the status 
	chromedriver.findElement(RecruitmentElement).click();
	Thread.sleep(1000);
	
	//chromedriver.findElement(ListButtonElement).click();
	
	WebElement ListButtonElementcick =chromedriver.findElement(ListButtonElement);
	new Actions(chromedriver).click(ListButtonElementcick);
	
	Thread.sleep(1000);
	
	WebElement CandidateName = chromedriver.findElement(CandidateNameSearchTxtbox);
	CandidateName.sendKeys("Jennifer",Keys.DOWN);
	Thread.sleep(1000);
	
	chromedriver.findElement(FirstCandidateFetchedElement).click();
	chromedriver.findElement(CandidateButtonSearchElement).click();
	Thread.sleep(1000);
	
	System.out.println("Candidate search is successful");

	//10.Navigate to the Admin tab and create a user with ESS role for the above employee 
	chromedriver.findElement(AdminElement).click();
	chromedriver.findElement(AdminAddRoleBtnElement).click();
	chromedriver.findElement(UserRoleDrpdwnElement).click();
	chromedriver.findElement(UserRoleSelectionElement).click();
	Thread.sleep(1000);
	
	chromedriver.findElement(EmployeeNameHintElement).click();
	
	//chromedriver.findElement(EmployeeNameHintElement).sendKeys("Push"+Keys.DOWN);
	chromedriver.findElement(EmployeeNameHintElement).sendKeys("Pushpavalli Kumari Mandim");
	Thread.sleep(1000);
	//chromedriver.findElement(EmployeenameSelection).click();

	chromedriver.findElement(StatusDrpdwnElement).click();
	chromedriver.findElement(StatusSelectionElement).click();
	Thread.sleep(1000);
	
	chromedriver.findElement(UserName1Element).click();
	chromedriver.findElement(UserName1Element).sendKeys("Joy1");

	chromedriver.findElement(AdminPasswordElement).click();
	chromedriver.findElement(AdminPasswordElement).sendKeys(Keys.CONTROL+"A");
	chromedriver.findElement(AdminPasswordElement).sendKeys(Keys.BACK_SPACE);
	chromedriver.findElement(AdminPasswordElement).sendKeys("Jangam3*");
	Thread.sleep(1000);
	
	chromedriver.findElement(ConfirmPasswordElement).click();
	chromedriver.findElement(ConfirmPasswordElement).sendKeys(Keys.CONTROL+"A");
	chromedriver.findElement(ConfirmPasswordElement).sendKeys(Keys.BACK_SPACE);
	chromedriver.findElement(ConfirmPasswordElement).sendKeys("Jangam3*");
	Thread.sleep(1000);
	
	chromedriver.findElement(EssUserSaveElement).click();
	Thread.sleep(1000);
	
	//11. Logout from the application and login with the above created username & password 

	chromedriver.findElement(LogoutDrpdwnElement).click();
	chromedriver.findElement(LogOutElement).click();
	Thread.sleep(1000);
	
	chromedriver.findElement(UsernameElement).sendKeys("Joy1");
	chromedriver.findElement(PasswordElement).sendKeys("Jangam3*");
	chromedriver.findElement(LoginBtnElement).click();	
	Thread.sleep(1000);
	
	// 12. Navigate to leave menu and apply personal leave, Logout from the application 
	chromedriver.findElement(LeaveElement).click();
	Thread.sleep(1000);

	/*.findElement(StartDateDrpdwnElement).click();
	chromedriver.findElement(StartDateLeaveSelection).sendKeys(Keys.CONTROL+"A");
	chromedriver.findElement(StartDateLeaveSelection).sendKeys(Keys.BACK_SPACE);
	chromedriver.findElement(StartDateLeaveSelection).sendKeys("2023-01-02");
		
	chromedriver.findElement(EndDateDrpdwnElement).click();
	chromedriver.findElement(EndDateLeaveSelection).sendKeys(Keys.CONTROL+"A");
	chromedriver.findElement(EndDateLeaveSelection).sendKeys(Keys.BACK_SPACE);
	chromedriver.findElement(EndDateLeaveSelection).sendKeys("2023-01-04");*/
	
	chromedriver.findElement(LogoutDrpdwnElement).click();
	chromedriver.findElement(LogOutElement).click();

	// 13. Login with the Admin user again and navigate to Leave menu 
	
	chromedriver.findElement(UsernameElement).sendKeys("Admin");
	chromedriver.findElement(PasswordElement).sendKeys("admin123");
	chromedriver.findElement(LoginBtnElement).click();
	
	chromedriver.findElement(LeaveElement).click();
	
	//14.Approve the above applied leave under leave list and logout 
	
	
}



}
