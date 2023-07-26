package org.sample;
import static org.sample.BaseClass.driver;

import java.awt.Robot;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;
public class BaseClass {
	static WebDriver driver;
	static Actions a;
	static Robot r;
	static Alert a1;
	static WebElement ele;
	static String val;
	static WebElement location;
	static WebElement typ;
	static WebElement expDate;
	public static Select s;
	static String vl;
	static String Dt;
	static String Yr;
	static WebElement expYear;
	
	
	
	
	public static void browserLaunch() {
		WebDriverManager.edgedriver().setup();
		driver= new EdgeDriver();
	}
	public static void maxWindow(){
		driver.manage().window().maximize();
	}
	
	public static void launchUrl(String Url) {
		driver.get(Url);
	}
	public static String excelWrite(String sheetName, int rowNo, int CellNo) throws IOException {
		
		File f=new File("C:\\\\Users\\\\srini\\\\eclipse-workspace\\\\MavenPOMProject\\\\ExternalFiles\\\\Student Details.xlsx");
		FileInputStream f3=new FileInputStream(f);
		Workbook book2=new XSSFWorkbook(f3);
		Sheet sh2=book2.getSheet(sheetName);
		Row r2 = sh2.getRow(rowNo);	
		Cell c = r2.getCell(CellNo);	
		int type=c.getCellType();
		String name ="";
		if (type==1){
		name=c.getStringCellValue();		
		}
		else if (DateUtil.isCellDateFormatted(c)){
		Date d=c.getDateCellValue();
		SimpleDateFormat sim=new SimpleDateFormat("dd mmmmm yyyy");
		name=sim.format(d);
		}
		else{
			double da=c.getNumericCellValue();
			long l=(long)da;
			name=String.valueOf(l);
	}
		
		return name;
	}
	public static void pageTitle() {
		String title=driver.getTitle();
	}
	
	public static String pageUrl() {
		String url=driver.getCurrentUrl();
		return url;
	}
	
	public static void fillTextBox(WebElement element, String value) {
		element.sendKeys(value);
	}
	public static void buttonClick(WebElement ele) {
		ele.click();
	}
	public static void selectOptions(WebElement ele,String val) {
		 s= new Select(ele);
		s.selectByVisibleText(val);	
	}
	public static void selectOptions1(WebElement typString,String vl) {
	    s= new Select (typString);
		s.selectByVisibleText(vl);
	}
	
	public static void selectOptions2(WebElement expDate, String Dt ) {
		s=new Select(expDate);
		s.selectByVisibleText(Dt);
	}
	public static void selectOptions3(WebElement expYear, String Yr) {
		s=new Select(expYear);
		s.selectByVisibleText(Yr);
	}
	public static void browserclose() {
		 driver.close();
	}
}

