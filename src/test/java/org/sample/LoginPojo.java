package org.sample;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPojo extends BaseClass{
public LoginPojo() {
	PageFactory.initElements(driver, this);
}
@FindBy(id="email")
private WebElement txtEmail;
@FindBy(id="pass")
private WebElement txtPass;
@FindBy(name="login")
private WebElement btnLogin;

public WebElement getTxtEmail() {
	return txtEmail;
}
public WebElement getTxtPass() {
	return txtPass;
}
public WebElement getBtnLogin() {
	return btnLogin;
}
@FindBy(xpath="(//select[@class='search_combobox'])[1]")
private WebElement location;

public WebElement getLocation() {
	return location;
}
@FindBy(id="Submit")
private WebElement ele1;
@FindBy(xpath="//input[@id='radiobutton_1']")
private WebElement sel;
@FindBy(xpath="//input[@id='continue']")
private WebElement con;

public WebElement getEle1() {
	return ele1;
}
public WebElement getSel() {
	return sel;
}
public WebElement getCon() {
	return con;
}
@FindBy(xpath="//input[@name='first_name']")
private WebElement txtFirst;
@FindBy(xpath="//input[@name='last_name']")
private WebElement txtLast;
@FindBy(xpath="//textarea[@name='address']")
private WebElement txtAddress;
@FindBy(xpath="//input[@name='cc_num']")
private WebElement cardNo;
@FindBy(xpath="//select[@class='select_combobox']")
private WebElement search;
@FindBy(xpath="//select[@name='cc_exp_month']")
private WebElement selMon;
@FindBy(xpath="//select[@name='cc_exp_year']")
private WebElement selYear;
@FindBy(xpath="//input[@name='cc_cvv']")
private WebElement cvv;
@FindBy(id="book_now")
private WebElement btn;

public WebElement getTxtFirst() {
	return txtFirst;
}
public WebElement getTxtLast() {
	return txtLast;
}
public WebElement getTxtAddress() {
	return txtAddress;
}
public WebElement getCardNo() {
	return cardNo;
}
public WebElement getSearch() {
	return search;
}
public WebElement getSelMon() {
	return selMon;
}
public WebElement getSelYear() {
	return selYear;
}
public WebElement getCvv() {
	return cvv;
}
public WebElement getBtn() {
	return btn;
}
@FindBy(xpath="//input[@name='order_no']")
private WebElement ord;

public WebElement getOrd() {
	return ord;
}

}






