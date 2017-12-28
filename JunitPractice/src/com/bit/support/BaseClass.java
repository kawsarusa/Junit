package com.bit.support;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class BaseClass extends FirstClass {

WebDriver dr;
	
@Test
public void verifyingMethod() {
/*
//For Single Statement;	
	
if(dr.findElement(By.id("Facebook")).isDisplayed()) 
{
	dr.findElement(By.id("")).click();
}
else {
	System.out.println("Displayed");
}

//For Multiple Statement;

if(dr.getTitle().contains("coffee")) 
{ 
	System.out.println("coffee");
}
else if(dr.getTitle().contains("tea"))
{
	System.out.println("tea");
}
else if(dr.getTitle().contains("ice tea"))
{
	System.out.println("ice tea");
}
else if(dr.findElement(By.id("")).getText().equals("okay"))
{
    System.out.println("is matched");
}
else if(dr.findElement(By.xpath("")).isEnabled())
{
    System.out.println("Click on Element");
	dr.findElement(By.xpath(""));
}
 
else {
	System.out.println("coffee is found");
}
*/

String day = "Friday";
switch(day)
{
case "Sunday":
{
	System.out.println("Class Day");
	break;
}
case "Monday":
{
	System.out.println("Work Day");
	break;
}
case "Tuesday":
{
	System.out.println("Ghum Day");
	break;
}
case "Wednesday":
{
	System.out.println("Fun Day");
	break;
}
case "Thrusday":
{
	System.out.println("Game Day");
	break;
}
case "Friday":
{
	System.out.println("Holi Day");
	break;
}
default:
{
	System.out.println("Not Match");
}
  }

}
 }
