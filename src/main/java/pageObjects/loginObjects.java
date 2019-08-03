package pageObjects;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utility.BasePage;

public class loginObjects extends BasePage {

	@FindBy(id = "username")
	private WebElement username;

	@FindBy(id = "password")
	private WebElement password;

	@FindBy(id = "login")
	private WebElement login;
	
	@FindBy(className="welcome_menu")
	private WebElement text;

	public loginObjects() {
		PageFactory.initElements(driver, this);

	}

	public String loadPage() {
		return driver.getTitle();
	}	
	
	
	public void enterDetails() {
		username.sendKeys("uma89mahe");
		password.sendKeys("uma89mahe$");
		login.click();
	}
	
	public WebElement welcome() {
		return text;
	}
	
	public String welcomeText() {
		return text.getText();
	}
	
public void readExcel() throws IOException {
		
		File loc = new File ("C:\\Users\\u.dayalamurthy\\Documents\\Uma\\Selenium\\TestData.xlsx");
	FileInputStream reader = new FileInputStream(loc);
	Workbook wb = new XSSFWorkbook(reader);
	Sheet sheet = wb.getSheet("sheet1");
	
	for( int i=0;i<sheet.getPhysicalNumberOfRows();i++) {
		Row eachrow = sheet.getRow(i);
		
		for(int j=0;j<eachrow.getPhysicalNumberOfCells();j++) {
			Cell currentcell = eachrow.getCell(j);
			
			String text = currentcell.getStringCellValue();
			System.out.println(text); 
		}
	}
	
	}




}
