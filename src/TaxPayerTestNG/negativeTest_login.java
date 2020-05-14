package TaxPayerTestNG;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import java.io.File;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;

public class negativeTest_login {
  public String driverPath = "C:\\Users\\pc\\Documents\\Gesi\\WebDriver\\chromedriver.exe"; 
  public WebDriver driver;
  public String loginPage = "http://devtaxpayer.cartenzgroup.com/revenue/taxpayeraccount/login";
  public int i=0;
  
  public static final String pic_loc = "C:\\Users\\pc\\Documents\\Gesi\\Screenshot\\Tax Payer\\negativeTest_login";
  
  public static class inputForm {
    static String nop1        = "51";
    static String nop2        = "03";
    static String nop3        = "020";
    static String nop4        = "002";
    static String nop5        = "013";
    static String nop6        = "0030";
    static String nop7        = "0";
    static String email       = "gesi.al@cartenz.co.id";
    static String hp          = "089603100218";
    static String password    = "Qwer1234";
    static String re_password = "Qwer1234";
  }
  
  public static class invalid_input {
    static String nop1_1      = "1";
    static String nop1_2      = "a";
    static String nop1_3      = "ab";
    static String nop1_4      = "123";
    static String nop2_1      = "1";
    static String nop2_2      = "a";
    static String nop2_3      = "abc";
    static String nop2_4      = "123";
    static String nop3_1      = "1";
    static String nop3_2      = "a";
    static String nop3_3      = "abcd";
    static String nop3_4      = "1234";
    static String nop4_1      = "1";
    static String nop4_2      = "a";
    static String nop4_3      = "abcd";
    static String nop4_4      = "1234";
    static String nop5_1      = "1";
    static String nop5_2      = "a";
    static String nop5_3      = "abcd";
    static String nop5_4      = "1234";
    static String nop6_1      = "1";
    static String nop6_2      = "a";
    static String nop6_3      = "abcde";
    static String nop6_4      = "12345";
    static String nop7_1      = "1";
    static String nop7_2      = "a";
    static String nop7_3      = "123";
    static String email       = "abc.abc";
    /*static String email_2   = "abc@abc";
    static String email_3     = "abc@";
    static String email_4     = "@abc";
    static String email_5     = "abc@abc.";
    static String email_6     = "abc@.abc";*/
    static String hp_1        = "abc";
    static String hp_2        = "081 234 567 89";
    static String password_1  = "a";
    static String password_2  = "1";
    static String password_3  = "a1";
    static String password_4  = "A1";
    static String password_5  = "Aa";
    static String password_6  = "Aa1";
    static String re_password_1  = "a";
    static String re_password_2  = "1";
    static String re_password_3  = "a1";
    static String re_password_4  = "A1";
    static String re_password_5  = "Aa";
    static String re_password_6  = "Aa1";
  }
  
  public static class identifier {
    static String email      = "identifierID";
    static String password   = "password";
    static String login_btn  = "login";
    static String logout_btn = "logout";
    static String next_btn_1 = "identifierNext";
    static String next_btn_2 = "passwordNext";
  }
  
  public static class name {
    static String email       = "email";
    static String hp          = "no_handphone";
    static String password    = "password";
    static String re_password = "repeat_password";
  }
  
  @BeforeTest
  public void launch_browser() throws Exception {
    System.setProperty("webdriver.chrome.driver", driverPath);
    driver = new ChromeDriver();
    driver.get(loginPage);
  }
  
  @BeforeMethod
  public void init_state() {
    driver.get(loginPage);
  }
  
  @AfterMethod
  public void screenshot() throws Exception {
    i++;
    positiveTest.takeSnapShot(driver, pic_loc + i + ".png");
  }
  
  public static void takeSnapShot(WebDriver driver, String picPath) throws Exception {
    TakesScreenshot scrShot =((TakesScreenshot)driver);
    File SrcFile = scrShot.getScreenshotAs(OutputType.FILE);
    File DestFile = new File(picPath);
    FileUtils.copyFile(SrcFile, DestFile);
  }
  
  @Test(priority = 0)
  public void nop1_empty() throws Exception {
    WebDriverWait myWait = new WebDriverWait(driver, 10);
    
    myWait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.className("cti-input-numeric")));

    driver.findElement(By.className("btn-submit")).click();
    myWait.until(ExpectedConditions.visibilityOfElementLocated(By.id("stack1")));
    Assert.assertTrue(ExpectedConditions.visibilityOfElementLocated(By.id("stack1"))!=null);
    driver.findElement(By.className("close")).click();
    
  }
  
  @Test(priority = 1)
  public void landing_page_to_login() throws Exception {
    WebDriverWait myWait = new WebDriverWait(driver, 10);
    String expTitle = "Tax Payer Account - Login";
    
    myWait.until(ExpectedConditions.visibilityOfElementLocated(By.className("t-login")));
    driver.findElement(By.className("t-login")).click();
    myWait.until(ExpectedConditions.urlContains("login"));
    Assert.assertEquals(driver.getTitle(), expTitle);
  }
  
  @Test(priority = 2)
  public void login_to_regis() throws Exception {
    WebDriverWait myWait = new WebDriverWait(driver, 10);
    String expTitle = "Daftar Akun";
    myWait.until(ExpectedConditions.visibilityOfElementLocated(By.linkText("Buat akun pengguna")));
    driver.findElement(By.linkText("Buat akun pengguna")).click();
    myWait.until(ExpectedConditions.visibilityOfElementLocated(By.name(name.hp)));
    WebElement actTitle = driver.findElement(By.xpath("//*[@id=\"form-signup\"]/div[1]"));
    Assert.assertEquals(actTitle.getText(), expTitle);
  }
  
  @Test(priority = 3)
  public void regis_success() {
    String expTitle = "Registrasi Sukses";
    WebDriverWait myWait = new WebDriverWait(driver, 10);
    
    driver.navigate().to(loginPage);
    driver.findElement(By.linkText("Buat akun pengguna")).click();
    System.out.println(inputForm.email);
    myWait.until(ExpectedConditions.visibilityOfElementLocated(By.name("email")));
    myWait.until(ExpectedConditions.visibilityOfElementLocated(By.name(name.hp)));
    myWait.until(ExpectedConditions.visibilityOfElementLocated(By.name(name.password)));
    myWait.until(ExpectedConditions.visibilityOfElementLocated(By.name(name.re_password)));
    System.out.println(inputForm.email);
    //WebElement email = driver.      /*.findElement(By.name(name.email));*/
    WebElement hp = driver.findElement(By.xpath("//*[@id=\"form-signup\"]/div[3]/div/input")); //.findElement(By.name(name.hp));
    WebElement password = driver.findElement(By.name(name.password));
    WebElement re_password = driver.findElement(By.name(name.re_password));
    
    System.out.println(hp);
    
    //email.sendKeys(inputForm.email);
    hp.sendKeys(inputForm.hp);
    myWait.until(ExpectedConditions.visibilityOfElementLocated(By.id(identifier.next_btn_1)));
    password.sendKeys(inputForm.password);
    re_password.sendKeys(inputForm.re_password);
    driver.findElement(By.cssSelector("input[type='button'][value='DAFTAR']")).click();
    
    //myWait.until(ExpectedConditions.visibilityOfElementLocated(By.id(identifier.next_btn_1)));
    Assert.assertEquals(expTitle, driver.getTitle());
  }
  
  @Test(priority = 4)
  public void regis_to_login() {
    String expTitle = "Masuk ke Akun Tax Payer";
    WebDriverWait myWait = new WebDriverWait(driver, 10);
    
    driver.findElement(By.linkText("Silakan login disini")).click();
    myWait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"login_form\"]/div[1]")));
    WebElement actTitle = driver.findElement(By.xpath("//*[@id=\"login_form\"]/div[1]"));
    Assert.assertEquals(actTitle.getText(), expTitle);
  }
  
  /*@Test(priority = 4)
  public void logout_success() {
    WebDriverWait myWait = new WebDriverWait(driver, 10);
    myWait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='gb']/div[1]/div[1]/div[2]/div[5]/div[1]/a/span")));
    driver.findElement(By.xpath("//*[@id='gb']/div[1]/div[1]/div[2]/div[5]/div[1]/a/span")).click();
    myWait.until(ExpectedConditions.visibilityOfElementLocated(By.linkText("Sign out")));
    driver.findElement(By.linkText("Sign out")).click();
  }*/
  
  @AfterTest
  public void quit_browser() {
    driver.quit();
  }
}
