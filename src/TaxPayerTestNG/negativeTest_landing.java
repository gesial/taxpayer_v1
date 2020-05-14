package TaxPayerTestNG;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import TaxPayerTestNG.positiveTest.identifier;
import TaxPayerTestNG.positiveTest.inputForm;

import org.testng.Assert;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.File;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;

public class negativeTest_landing {
  public String driverPath = "C:\\Users\\pc\\Documents\\Gesi\\WebDriver\\new\\chromedriver.exe"; 
  public WebDriver driver;
  public String landingPage = "http://devtaxpayer.cartenzgroup.com/revenue/taxpayeraccount";
  public int i=0;
  public static final String pic_loc = "C:\\Users\\pc\\Documents\\Gesi\\Screenshot\\Tax Payer\\negativeTest_landing\\";
  
  public static class inputForm {
    static String nop1        = "51";
    static String nop2        = "03";
    static String nop3        = "020";
    static String nop4        = "002";
    static String nop5        = "013";
    static String nop6        = "0030";
    static String nop7        = "0";
  }
  
  public static class invalid_input {
    static String nop1_1      = "1";
    static String nop1_2      = "ab";
    static String nop2_1      = "1";
    static String nop2_2      = "ab";
    static String nop3_1      = "1";
    static String nop3_2      = "abc";
    static String nop4_1      = "1";
    static String nop4_2      = "abc";
    static String nop5_1      = "1";
    static String nop5_2      = "abc";
    static String nop6_1      = "1";
    static String nop6_2      = "abcd";
    static String nop7_1      = "a";
  }
  
  public static class identifier {
    static String nop1 = "kode_propinsi";
    static String nop2 = "kode_dati2";
    static String nop3 = "kode_kecamatan";
    static String nop4 = "kode_kelurahan";
    static String nop5 = "kode_blok";
    static String nop6 = "no_urut";
    static String nop7 = "kode_jenis_op";
  }
  
  @BeforeTest
  public void launch_browser() throws Exception {
    System.setProperty("webdriver.chrome.driver", driverPath);
    driver = new ChromeDriver();
    driver.get(landingPage);
  }
  
  @BeforeMethod
  public void init_state() {
    //WebDriverWait myWait = new WebDriverWait(driver, 20);
    driver.findElements(By.className("cti-input-numeric")).clear();
    
    //myWait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.className("cti-input-numeric")));
    WebElement nop1 = driver.findElement(By.id(identifier.nop1));
    WebElement nop2 = driver.findElement(By.id(identifier.nop2));
    WebElement nop3 = driver.findElement(By.id(identifier.nop3));
    WebElement nop4 = driver.findElement(By.id(identifier.nop4));
    WebElement nop5 = driver.findElement(By.id(identifier.nop5));
    WebElement nop6 = driver.findElement(By.id(identifier.nop6));
    WebElement nop7 = driver.findElement(By.id(identifier.nop7));
    
    nop1.sendKeys(inputForm.nop1);
    nop2.sendKeys(inputForm.nop2);
    nop3.sendKeys(inputForm.nop3);
    nop4.sendKeys(inputForm.nop4);
    nop5.sendKeys(inputForm.nop5);
    nop6.sendKeys(inputForm.nop6);
    nop7.sendKeys(inputForm.nop7);
  }
  
  @AfterMethod
  public void screenshot() throws Exception {
    positiveTest.takeSnapShot(driver, pic_loc + i + ".png");
    i++;
  }
  
  public static void takeSnapShot(WebDriver driver, String picPath) throws Exception {
    TakesScreenshot scrShot =((TakesScreenshot)driver);
    File SrcFile = scrShot.getScreenshotAs(OutputType.FILE);
    File DestFile = new File(picPath);
    FileUtils.copyFile(SrcFile, DestFile);
  }
  
  @Test(priority = 0)
  public void nop1_empty() throws Exception {
    driver.findElement(By.id(identifier.nop1)).clear();
    driver.findElement(By.className("btn-submit")).click();
    String message = driver.findElement(By.id(identifier.nop1)).getAttribute("validationMessage");
    Assert.assertEquals(message, "Please fill out this field.");
  }
  
  @Test(priority = 1)
  public void nop2_empty() throws Exception {
    driver.findElement(By.id(identifier.nop2)).clear();
    driver.findElement(By.className("btn-submit")).click();
    String message = driver.findElement(By.id(identifier.nop2)).getAttribute("validationMessage");
    Assert.assertEquals(message, "Please fill out this field.");
  }
  
  @Test(priority = 2)
  public void nop3_empty() throws Exception {
    driver.findElement(By.id(identifier.nop3)).clear();
    driver.findElement(By.className("btn-submit")).click();
    String message = driver.findElement(By.id(identifier.nop3)).getAttribute("validationMessage");
    Assert.assertEquals(message, "Please fill out this field.");
  }
  
  @Test(priority = 3)
  public void nop4_empty() throws Exception {
    driver.findElement(By.id(identifier.nop4)).clear();
    driver.findElement(By.className("btn-submit")).click();
    String message = driver.findElement(By.id(identifier.nop4)).getAttribute("validationMessage");
    Assert.assertEquals(message, "Please fill out this field.");
  }
  
  @Test(priority = 4)
  public void nop5_empty() throws Exception {
    driver.findElement(By.id(identifier.nop5)).clear();
    driver.findElement(By.className("btn-submit")).click();
    String message = driver.findElement(By.id(identifier.nop5)).getAttribute("validationMessage");
    Assert.assertEquals(message, "Please fill out this field.");
  }
  
  @Test(priority = 5)
  public void nop6_empty() throws Exception {
    driver.findElement(By.id(identifier.nop6)).clear();
    driver.findElement(By.className("btn-submit")).click();
    String message = driver.findElement(By.id(identifier.nop6)).getAttribute("validationMessage");
    Assert.assertEquals(message, "Please fill out this field.");
  }
  
  @Test(priority = 6)
  public void nop7_empty() throws Exception {
    driver.findElement(By.id(identifier.nop7)).clear();
    driver.findElement(By.className("btn-submit")).click();
    String message = driver.findElement(By.id(identifier.nop7)).getAttribute("validationMessage");      
    Assert.assertEquals(message, "Please fill out this field.");
  }
  
  @Test(priority = 7)
  public void nop1_w_space() throws Exception {
    driver.findElement(By.id(identifier.nop1)).clear();
    WebElement nop1 = driver.findElement(By.id(identifier.nop1));
    nop1.sendKeys("    ");
    driver.findElement(By.className("btn-submit")).click();
  }
  
  @Test(priority = 14)
  public void nop1_1() throws Exception {
    driver.findElement(By.id(identifier.nop1)).clear();
    WebElement nop1 = driver.findElement(By.id(identifier.nop1));
    nop1.sendKeys(invalid_input.nop1_1);
    driver.findElement(By.className("btn-submit")).click();
  }
  
  @AfterTest
  public void quit_browser() {
    driver.quit();
  }
}
