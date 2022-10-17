package com.test;

import java.text.ParseException;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import base.Baseclass;
import pages.CartPage;
import pages.LaptopPage;
import pages.LoginPage;
import pages.PhonesPage;

public class TestClass extends Baseclass {
	
	@BeforeTest
	public void browserOpen()
	{
		launchApp();
		//initialization();
	}
	
	@Test(priority = 0)
	public void test01() throws InterruptedException
	{
		System.out.println(driver.getTitle());
		LoginPage lp=new LoginPage(driver);
		lp.login();
	}
	@Test(priority = 1)
	public void phone() throws InterruptedException
	{
		PhonesPage pp= new PhonesPage(driver);
		pp.phone();
	}
	
	@Test(priority = 2)
	public void laptop() throws InterruptedException
	{
		LaptopPage pp= new LaptopPage(driver);
		pp.phone();
	}
	@Test(priority = 3)
	public void cartPage() throws InterruptedException, ParseException
	{
		CartPage pp= new CartPage(driver);
		pp.cart();
	}
	

}
