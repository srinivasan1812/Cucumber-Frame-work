package org.sample;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
//JUnit Question No.8
public class Sample extends BaseClass  {
	static WebDriver driver;
	@Test
	public void tc2() {
	pageUrl();
	}
	public void tc1() {
	pageTitle();
	}
	@Test
	public void tc3() throws InterruptedException, IOException {
	LoginPojo l= new LoginPojo();
	WebElement email=l.getTxtEmail();
	fillTextBox(email,excelWrite("Details",1,0));
	WebElement pass=l.getTxtPass();
	fillTextBox(pass,excelWrite("Details",1,1));
	WebElement login=l.getBtnLogin();
	login.click();
	WebElement location=l.getLocation();
	selectOptions(location,excelWrite("Details",1,2));
	WebElement ele1=l.getEle1();
	ele1.click();
	WebElement sel=l.getSel();
	sel.click();;
	WebElement con=l.getCon();
	con.click();
	WebElement txtFirst=l.getTxtFirst();
	fillTextBox(txtFirst,excelWrite("Details",1,3));
	WebElement txtLast=l.getTxtLast();
	fillTextBox(txtLast,excelWrite("Details",1,4));
	WebElement txtAddress=l.getTxtAddress();
	fillTextBox(txtAddress,excelWrite("Details",1,5));
	WebElement cardNo=l.getCardNo();
	fillTextBox(cardNo,excelWrite("Details",1,6));
	WebElement search=l.getSearch();
	fillTextBox(search,excelWrite("Details",1,7));
	WebElement selMon=l.getSelMon();
	fillTextBox(selMon,excelWrite("Details",1,8));
	WebElement selYear=l.getSelYear();
	selectOptions3(selYear,excelWrite("Details",1,9));
	WebElement cvv = l.getCvv();
	fillTextBox(cvv,excelWrite("Details",1,10));
	WebElement btn=l.getBtn();
	btn.click();
	Thread.sleep(5000);
	WebElement ord=l.getOrd();
	String orderNo=ord.getAttribute("value");
	System.out.println(orderNo);
	File f=new File("C:\\Users\\srini\\eclipse-workspace\\MavenPOMProject\\ExternalFiles\\Student Details.xlsx");
	FileInputStream f1=new FileInputStream(f);
	Workbook book=new XSSFWorkbook(f1);
	Sheet sh = book.createSheet("Result");
	Row r=sh.createRow(0);
	Cell c1 = r.createCell(0);
	c1.setCellValue("orderNo");
	FileOutputStream fo= new FileOutputStream(f);
	book.write(fo);
	//Junit Question No.8
	FileInputStream f2=new FileInputStream(f);
	Workbook book1=new XSSFWorkbook(f2);
	Sheet sh1=book1.getSheet("Result");
	Row r1=sh1.createRow(1);
	Cell c14=r1.createCell(0);
	c14.setCellValue(orderNo);
	FileOutputStream f3=new FileOutputStream(f);
	book1.write(f3);
	}
	
	@BeforeClass
	public static void befCls() {
		browserLaunch();
		launchUrl("http://www.adactin.com/HotelApp/");
	}
	}
	
	

