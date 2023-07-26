package org.sample;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Date;
import java.text.SimpleDateFormat;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
public class ExcelWrite extends BaseClass {
	public static void main(String[] args) throws IOException, InterruptedException {
		
		//browserLaunch();	
		//launchUrl("https://www.facebook.com/");
		//Thread.sleep(3000);
		
		File f=new File("C:\\Users\\srini\\eclipse-workspace\\MavenPOMProject\\ExternalFiles\\Student Details.xlsx");
		FileInputStream f1= new FileInputStream(f);
		Workbook book=new XSSFWorkbook(f1);
		Sheet sh = book.createSheet("Details");
		//Row r = sh.createRow(0);
		//Cell c1 = r.createCell(0);
		//Cell c2 = r.createCell(1);
		//c1.setCellValue("user");
		//c2.setCellValue("password");
		FileOutputStream fo= new FileOutputStream(f);
		book.write(fo);
		
		FileInputStream f2=new FileInputStream(f);
		Workbook book1=new XSSFWorkbook(f2);
		Sheet sh1=book1.getSheet("Details");
		Row r1=sh1.createRow(1);
		Cell c3=r1.createCell(0);
		Cell c4=r1.createCell(1);
		Cell c5=r1.createCell(2);
		Cell c6=r1.createCell(3);
		Cell c7=r1.createCell(4);
		Cell c8=r1.createCell(5);
		Cell c9=r1.createCell(6);
		Cell c10=r1.createCell(7);
		Cell c11=r1.createCell(8);
		Cell c12=r1.createCell(9);
		Cell c13=r1.createCell(10);
		
		c3.setCellValue("srinivas2023");
		c4.setCellValue("Initial@123");
		c5.setCellValue("Sydney");
		c6.setCellValue("Ramesh");
		c7.setCellValue("Rai");
		c8.setCellValue("No.98 VM Street, Velacherry");
		c9.setCellValue("1234567891078654");
		c10.setCellValue("VISA");
		c11.setCellValue("March");
		c12.setCellValue("2020");
		c13.setCellValue("765");
		FileOutputStream f3=new FileOutputStream(f);
		book1.write(f3);	
	}
	}


