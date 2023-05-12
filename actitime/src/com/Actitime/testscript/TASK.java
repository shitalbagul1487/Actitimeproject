package com.Actitime.testscript;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.By;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.Actitime.Genericlibrarary.Baseclass2;
import com.Actitime.Genericlibrarary.filelibrary;
import com.Actitime.objectrepository.Homepage;
import com.Actitime.objectrepository.Taskpage;

public class TASK extends Baseclass2 {
	@Test
	public void createcustomer() throws EncryptedDocumentException, IOException {
    Homepage hp=new Homepage(driver);
    hp.getTaskab().click();
    
    Taskpage tp=new Taskpage(driver);
    tp.getAddnew().click();
    tp.getNewcustomer().click();
    tp.getCustomname().sendKeys();
    
    filelibrary f=new  filelibrary();
   String createcustomer = f.readdatafromExcel("sheet1",3 ,1);
		tp.getCustomname().sendKeys(createcustomer);
		
		 String desc = f.readdatafromExcel("sheet1", 1, 2);
		tp.getDecription().sendKeys(desc);
		tp.getCreatecustomer().click();
		
		String expectedresult = createcustomer;
		String Actulresult = driver.findElement(By.xpath("(//div[.='"+createcustomer+"'])[2]")).getText();
		SoftAssert s =new SoftAssert();
		s.assertEquals(Actulresult, expectedresult);
		s.assertAll();
		
}
}