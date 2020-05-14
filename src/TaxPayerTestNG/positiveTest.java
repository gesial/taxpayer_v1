package TaxPayerTestNG;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import java.io.File;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;

public class positiveTest { 
  public WebDriver driver;
  public String driverPath = "C:\\Users\\pc\\Documents\\Gesi\\WebDriver\\new\\chromedriver.exe";
  public String landingPage = "http://devtaxpayer.cartenzgroup.com/revenue/taxpayeraccount";
  public String loginPage = "http://devtaxpayer.cartenzgroup.com/revenue/taxpayeraccount/login";
  public int i=0;
  
  public static final String pic_loc = "C:\\Users\\pc\\Documents\\Gesi\\Screenshot\\Tax Payer\\positiveTest\\";
  
  public static class inputForm {
    static String nop1        = "51";
    static String nop2        = "03";
    static String nop3        = "020";
    static String nop4        = "002";
    static String nop5        = "013";
    static String nop6        = "0030";
    static String nop7        = "0";
    static String email       = "gesi.al@cartenz.co.id";
    static String email2      = "ikhwan@cartenz.co.id";
    static String hp          = "081234567890";
    static String password    = "Qwer1234";
    static String password2   = "123456Qw";
    static String re_password = "Qwer1234";
    static String nik         = "1234567890123456";
    static String npwpd       = "123456789012345";
    static String nama        = "QA tester";
    static String alamat      = "AIA central lantai 25";
    static String prov        = "DKI Jakarta";
    static String kota_kab    = "Jakarta Selatan";
    static String kec         = "Karet";
    static String kel_desa    = "Semanggi";
    static String kode_pos    = "12930";
  }
  
  public static class identifier {
    static String nop1 = "kode_propinsi";
    static String nop2 = "kode_dati2";
    static String nop3 = "kode_kecamatan";
    static String nop4 = "kode_kelurahan";
    static String nop5 = "kode_blok";
    static String nop6 = "no_urut";
    static String nop7 = "kode_jenis_op";
    static String email         = "identifierID";
    static String emailLogin    = "userid_field";
    static String password      = "password";
    static String passwordLogin = "password_field";
    static String login_btn  = "login_button";
    static String logout_btn = "logout";
    static String next_btn_1 = "identifierNext";
    static String next_btn_2 = "passwordNext";
    static String nik        = "nik";
  }
  
  public static class name {
    static String email       = "email";
    static String hp          = "no_handphone";
    static String password    = "password";
    static String re_password = "repeat_password";
  }
  
  public static class xpath_loc {
    static String titleRegis  = "//*[@id=\"form-signup\"]/div[1]";
    static String emailRegis  = "//*[@id=\"form-signup\"]/div[2]/div/input";
    static String hpRegis     = "//*[@id=\"form-signup\"]/div[3]/div/input";
    static String pwRegis     = "//*[@id=\"form-signup\"]/div[4]/div/input";
    static String rePwRegis   = "//*[@id=\"form-signup\"]/div[5]/div/input";
    static String regisBtn    = "//*[@id=\"form-signup\"]/div[6]/div/input";
    static String regisScs    = "/html/body/table/tbody/tr/td/div[2]/div[1]/div/div/div[2]/div/h2/strong";
    static String titleLogin  = "//*[@id=\"login_form\"]/div[1]";
    static String topRightBtn = "//*[@id=\"navbar\"]/ul[2]/li/a";
    static String logout      = "//*[@id=\"navbar\"]/ul[2]/li/ul/li[3]";
    static String profile     = "//*[@id=\"navbar\"]/ul[2]/li/ul/li[1]/a";
    static String titleForget = "//*[@id=\"form-forget\"]/div[1]";
    static String userInfo    = "/html/body/div/div[2]/div/div/div/div/div[4]/div/div/div/div[2]/div/div/div/ul/li[1]/a";
    static String changePw    = "/html/body/div/div[2]/div/div/div/div/div[4]/div/div/div/div[2]/div/div/div/ul/li[2]";
    static String dataNPWPD   = "/html/body/div/div[2]/div/div/div/div/div[4]/div/div/div/div[2]/div/div/div/ul/li[3]/a";
    static String updateBtn   = "//*[@id=\"form_individu\"]/div/div[13]/div/button";
    static String chgPwBtn    = "//*[@id=\"tab_change_password\"]/form/div/div[4]/div/button";
    static String NPWPDform   = "//*[@id=\"tab_data_npwpd\"]/div[1]/div[1]/div";
    static String radioIndvd  = "//*[@id=\"tab_user_info\"]/div/div/div/label[1]";
    static String radioBU     = "//*[@id=\"tab_user_info\"]/div/div/div/label[2]";
    static String nik         = "//*[@id=\"form_individu\"]/div/div[1]/div";
    static String npwpd       = "//*[@id=\"form_individu\"]/div/div[2]/div";
    static String namaLengkap = "//*[@id=\"form_individu\"]/div/div[3]/div";
    static String alamat      = "//*[@id=\"form_individu\"]/div/div[4]/div";
    static String prov        = "//*[@id=\"form_individu\"]/div/div[5]/div";
    static String kota_kab    = "//*[@id=\"form_individu\"]/div/div[6]/div";
    static String kec         = "//*[@id=\"form_individu\"]/div/div[7]/div";
    static String kel_desa    = "//*[@id=\"form_individu\"]/div/div[8]/div";
    static String kodePos     = "//*[@id=\"form_individu\"]/div/div[9]/div";
    static String email       = "//*[@id=\"form_individu\"]/div/div[10]/div";
    static String hp          = "//*[@id=\"form_individu\"]/div/div[11]/div";
    static String npwpdBU     = "//*[@id=\"form_badan_usaha\"]/div/div[1]";
    static String namaBU      = "//*[@id=\"form_badan_usaha\"]/div/div[2]";
    static String alamatBU    = "//*[@id=\"form_badan_usaha\"]/div/div[3]";
    static String provBU      = "//*[@id=\"form_badan_usaha\"]/div/div[4]";
    static String kota_kab_BU = "//*[@id=\"form_badan_usaha\"]/div/div[5]";
    static String kecBU       = "//*[@id=\"form_badan_usaha\"]/div/div[6]";
    static String kel_desa_BU = "//*[@id=\"form_badan_usaha\"]/div/div[7]";
    static String kodePosBU   = "//*[@id=\"form_badan_usaha\"]/div/div[8]";
    static String emailBU     = "//*[@id=\"form_badan_usaha\"]/div/div[9]";
    static String hpBU        = "//*[@id=\"form_badan_usaha\"]/div/div[10]";
    static String updateBtnBU = "//*[@id=\"form_badan_usaha\"]/div/div[12]/div";
    static String pwLama      = "//*[@id=\"tab_change_password\"]/form/div/div[1]/div";
    static String pwBaru      = "//*[@id=\"tab_change_password\"]/form/div/div[2]/div";
    static String rePwBaru    = "//*[@id=\"tab_change_password\"]/form/div/div[3]/div";
  }
  
  public static class expct {
    static String login_text     = "Masuk ke Akun Tax Payer";
    static String titleLogin     = "Tax Payer Account - Login";
    static String titleRegis     = "Daftar Akun";
    static String regisSuccess   = "TERIMA KASIH TELAH MENDAFTAR DI TAXPAYER ACCOUNT!";
    static String titleDashboard = "Taxpayer Account - Document Title";
    static String titleForget    = "Lupa password?";
    static String urlProfile     = "http://devtaxpayer.cartenzgroup.com/revenue/taxpayeraccount/my-profile";
  }
  
  @BeforeTest
  public void launch_browser() throws Exception {
    System.setProperty("webdriver.chrome.driver", driverPath);
    ChromeOptions options = new ChromeOptions();
    options.addArguments("--start-maximized");
    driver = new ChromeDriver(options);
    driver.get(landingPage);
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
  
  /************************************************************
                            TEST START
  *************************************************************/
  
  @Test(priority = 0)
  public void landing_page_cari_NOP() throws Exception {
    WebDriverWait myWait = new WebDriverWait(driver, 20);
    
    myWait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.className("cti-input-numeric")));
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

    myWait.until(ExpectedConditions.elementToBeClickable(By.className("btn-submit")));
    driver.findElement(By.className("btn-submit")).click();
    myWait.until(ExpectedConditions.visibilityOfElementLocated(By.id("stack1")));
    Assert.assertTrue(ExpectedConditions.visibilityOfElementLocated(By.id("stack1"))!=null);
    myWait.until(ExpectedConditions.elementToBeClickable(By.className("close")));
    driver.findElement(By.className("close")).click();
  }
  
  @Test(priority = 1)
  public void landing_page_to_login() throws Exception {
    WebDriverWait myWait = new WebDriverWait(driver, 10);
    
    myWait.until(ExpectedConditions.visibilityOfElementLocated(By.className("t-login")));
    myWait.until(ExpectedConditions.elementToBeClickable(By.className("t-login")));
    driver.findElement(By.className("t-login")).click();
    myWait.until(ExpectedConditions.urlContains("login"));
    Assert.assertEquals(driver.getTitle(), expct.titleLogin);
  }
  
  @Test(priority = 2)
  public void login_to_regis() throws Exception {
    WebDriverWait myWait = new WebDriverWait(driver, 10);
    
    myWait.until(ExpectedConditions.visibilityOfElementLocated(By.linkText("Buat akun pengguna")));
    myWait.until(ExpectedConditions.elementToBeClickable(By.linkText("Buat akun pengguna")));
    driver.findElement(By.linkText("Buat akun pengguna")).click();
    myWait.until(ExpectedConditions.visibilityOfElementLocated(By.name(name.hp)));
    WebElement actTitle = driver.findElement(By.xpath(xpath_loc.titleRegis));
    Assert.assertEquals(actTitle.getText(), expct.titleRegis);
  }
  
  @Test(priority = 3)
  public void regis_success() throws Exception {
    WebDriverWait myWait = new WebDriverWait(driver, 3);
    
    driver.navigate().to(loginPage);
    myWait.until(ExpectedConditions.visibilityOfElementLocated(By.linkText("Buat akun pengguna")));
    myWait.until(ExpectedConditions.elementToBeClickable(By.linkText("Buat akun pengguna")));
    driver.findElement(By.linkText("Buat akun pengguna")).click();
    
    myWait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(xpath_loc.emailRegis)));
    myWait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(xpath_loc.hpRegis)));
    myWait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(xpath_loc.pwRegis)));
    myWait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(xpath_loc.rePwRegis)));
    
    WebElement email = driver.findElement(By.xpath(xpath_loc.emailRegis));
    WebElement hp = driver.findElement(By.xpath(xpath_loc.hpRegis));
    WebElement password = driver.findElement(By.xpath(xpath_loc.pwRegis));
    WebElement re_password = driver.findElement(By.xpath(xpath_loc.rePwRegis));
    
    email.sendKeys(inputForm.email);
    hp.sendKeys(inputForm.hp);
    password.sendKeys(inputForm.password);
    re_password.sendKeys(inputForm.re_password);
    driver.findElement(By.xpath(xpath_loc.regisBtn)).click();
    
    myWait.until(ExpectedConditions.urlContains("register"));
    Assert.assertEquals(driver.findElement(By.xpath(xpath_loc.regisScs)).getText(), expct.regisSuccess);
  }
  
  @Test(priority = 4)
  public void regis_to_login() throws Exception {
    WebDriverWait myWait = new WebDriverWait(driver, 10);
    
    driver.navigate().to(loginPage);
    myWait.until(ExpectedConditions.visibilityOfElementLocated(By.linkText("Buat akun pengguna")));
    myWait.until(ExpectedConditions.elementToBeClickable(By.linkText("Buat akun pengguna")));
    driver.findElement(By.linkText("Buat akun pengguna")).click();
    myWait.until(ExpectedConditions.visibilityOfElementLocated(By.linkText("Silakan login disini")));
    myWait.until(ExpectedConditions.elementToBeClickable(By.linkText("Silakan login disini")));
    driver.findElement(By.linkText("Silakan login disini")).click();
    myWait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(xpath_loc.titleLogin)));
    WebElement actTitle = driver.findElement(By.xpath(xpath_loc.titleLogin));
    Assert.assertEquals(actTitle.getText(), expct.login_text);
  }
  
  @Test(priority = 5)
  public void login_success() throws Exception {
    WebDriverWait myWait = new WebDriverWait(driver, 10);
    
    WebElement email = driver.findElement(By.id(identifier.emailLogin));
    WebElement password = driver.findElement(By.id(identifier.passwordLogin));
    
    email.sendKeys(inputForm.email2);
    password.sendKeys(inputForm.password2);
    driver.findElement(By.name("login")).click();
    myWait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(xpath_loc.topRightBtn)));
    Assert.assertEquals(driver.getTitle(), expct.titleDashboard);
  }
  
  @Test(priority = 6)
  public void logout_success() throws Exception {
    WebDriverWait myWait = new WebDriverWait(driver, 10);
    
    driver.findElement(By.xpath(xpath_loc.topRightBtn)).click();
    myWait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(xpath_loc.logout)));
    myWait.until(ExpectedConditions.elementToBeClickable(By.xpath(xpath_loc.logout)));
    driver.findElement(By.xpath(xpath_loc.logout)).click();
    myWait.until(ExpectedConditions.urlContains("login"));
    Assert.assertEquals(driver.getTitle(), expct.titleLogin);
  }
  
  @Test(priority = 7)
  public void login_to_lupa() throws Exception {
    WebDriverWait myWait = new WebDriverWait(driver, 20);
    
    myWait.until(ExpectedConditions.visibilityOfElementLocated(By.linkText("Lupa Password?")));
    myWait.until(ExpectedConditions.elementToBeClickable(By.linkText("Lupa Password?")));
    driver.findElement(By.linkText("Lupa Password?")).click();
    myWait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(xpath_loc.titleForget)));
    WebElement actTitle = driver.findElement(By.xpath(xpath_loc.titleForget));
    Assert.assertEquals(actTitle.getText(), expct.titleForget);
  }
  
  @Test(priority = 8)
  public void lupa_to_login() throws Exception {
    WebDriverWait myWait = new WebDriverWait(driver, 20);
    
    driver.findElement(By.className("switch-login")).click();
    myWait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(xpath_loc.titleLogin)));
    WebElement actTitle = driver.findElement(By.xpath(xpath_loc.titleLogin));
    Assert.assertEquals(actTitle.getText(), expct.login_text);
  }
  
  @Test(priority = 9)
  public void rememberMe_email() throws Exception {
    WebDriverWait myWait = new WebDriverWait(driver, 10);
    WebElement email = driver.findElement(By.id(identifier.emailLogin));
    WebElement password = driver.findElement(By.id(identifier.passwordLogin));
    //String[] expected = new String[] {inputForm.email2, inputForm.password2};
    
    email.sendKeys(inputForm.email2);
    password.sendKeys(inputForm.password2);
    myWait.until(ExpectedConditions.elementToBeClickable(By.name("login")));
    myWait.until(ExpectedConditions.elementToBeClickable(By.className("rememberme")));
    driver.findElement(By.className("rememberme")).click();
    driver.findElement(By.name("login")).click();
    myWait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(xpath_loc.topRightBtn)));
    myWait.until(ExpectedConditions.elementToBeClickable(By.xpath(xpath_loc.topRightBtn)));
    driver.findElement(By.xpath(xpath_loc.topRightBtn)).click();
    myWait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(xpath_loc.logout)));
    myWait.until(ExpectedConditions.elementToBeClickable(By.xpath(xpath_loc.logout)));
    driver.findElement(By.xpath(xpath_loc.logout)).click();
    myWait.until(ExpectedConditions.visibilityOfElementLocated(By.id(identifier.emailLogin)));
    System.out.println("debug5");
    /*String[] actual = new String[] {email.getAttribute("value"), password.getAttribute("value")};
    Assert.assertEquals(actual, expected);*/
    Assert.assertEquals(email.getAttribute("value"), inputForm.email2);
    System.out.println("debug6");
    myWait.until(ExpectedConditions.visibilityOfElementLocated(By.id(identifier.passwordLogin)));
    System.out.println("debug7");
  }
  
  @Test(priority = 10)
  public void rememberMe_pw() throws Exception {
    WebDriverWait myWait = new WebDriverWait(driver, 10);
    WebElement password = driver.findElement(By.id(identifier.passwordLogin));
    
    myWait.until(ExpectedConditions.visibilityOfElementLocated(By.id(identifier.passwordLogin)));
    Assert.assertEquals(password.getAttribute("value"), inputForm.password2);
  }

  @Test(priority = 11)
  public void go_to_profil() throws Exception {
    WebDriverWait myWait = new WebDriverWait(driver, 10);
    WebElement email = driver.findElement(By.id(identifier.emailLogin));
    WebElement password = driver.findElement(By.id(identifier.passwordLogin));
    
    email.sendKeys(inputForm.email2);
    password.sendKeys(inputForm.password2);
    myWait.until(ExpectedConditions.elementToBeClickable(By.name("login")));
    driver.findElement(By.name("login")).click();
    myWait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(xpath_loc.topRightBtn)));
    myWait.until(ExpectedConditions.elementToBeClickable(By.xpath(xpath_loc.topRightBtn)));
    driver.findElement(By.xpath(xpath_loc.topRightBtn)).click();
    myWait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(xpath_loc.profile)));
    myWait.until(ExpectedConditions.elementToBeClickable(By.xpath(xpath_loc.profile)));
    driver.findElement(By.xpath(xpath_loc.profile)).click();
    
    Assert.assertEquals(driver.getCurrentUrl(), expct.urlProfile);
  }
  
  @Test(priority = 12)
  public void tab_change_password() throws Exception {
    WebDriverWait myWait = new WebDriverWait(driver, 10);
    
    myWait.until(ExpectedConditions.elementToBeClickable(By.xpath(xpath_loc.changePw)));
    driver.findElement(By.xpath(xpath_loc.changePw)).click();
    myWait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(xpath_loc.chgPwBtn)));
    WebElement chgPwBtn = driver.findElement(By.xpath(xpath_loc.chgPwBtn));
    
    Assert.assertEquals(chgPwBtn.getText(), "UPDATE PASSWORD");
  }
  
  @Test(priority = 13)
  public void tab_data_NPWPD() throws Exception {
    WebDriverWait myWait = new WebDriverWait(driver, 10);
    
    myWait.until(ExpectedConditions.elementToBeClickable(By.xpath(xpath_loc.dataNPWPD)));
    driver.findElement(By.xpath(xpath_loc.dataNPWPD)).click();
    myWait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(xpath_loc.NPWPDform)));
    WebElement NPWPDform = driver.findElement(By.xpath(xpath_loc.NPWPDform));
    
    Assert.assertEquals(NPWPDform.getText(), "DAFTAR NPWPD");
  }
  
  @Test(priority = 14)
  public void tab_user_info() throws Exception {
    WebDriverWait myWait = new WebDriverWait(driver, 10);
    
    myWait.until(ExpectedConditions.elementToBeClickable(By.xpath(xpath_loc.userInfo)));
    driver.findElement(By.xpath(xpath_loc.userInfo)).click();
    myWait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(xpath_loc.updateBtn)));
    WebElement updateBtn = driver.findElement(By.xpath(xpath_loc.updateBtn));
    
    Assert.assertEquals(updateBtn.getText(), "UPDATE");
  }
  
  @Test(priority = 15)
  public void fill_out_user_info_individu() throws Exception {
    //WebDriverWait myWait = new WebDriverWait(driver, 10);
    Actions actions = new Actions(driver);
    WebElement individu = driver.findElement(By.xpath(xpath_loc.radioIndvd));
    WebElement nik      = driver.findElement(By.xpath(xpath_loc.nik));
    WebElement npwpd    = driver.findElement(By.xpath(xpath_loc.npwpd));
    WebElement nama     = driver.findElement(By.xpath(xpath_loc.namaLengkap));
    WebElement alamat   = driver.findElement(By.xpath(xpath_loc.alamat));
    WebElement prov     = driver.findElement(By.xpath(xpath_loc.prov));
    WebElement kota_kab = driver.findElement(By.xpath(xpath_loc.kota_kab));
    WebElement kec      = driver.findElement(By.xpath(xpath_loc.kec));
    WebElement kel_desa = driver.findElement(By.xpath(xpath_loc.kel_desa));
    WebElement kode_pos = driver.findElement(By.xpath(xpath_loc.kodePos));
    //WebElement email    = driver.findElement(By.xpath(xpath_loc.email));
    WebElement hp       = driver.findElement(By.xpath(xpath_loc.hp));
    
    individu.click();
    
    actions.moveToElement(nik);
    actions.click();
    actions.sendKeys(inputForm.nik);
    
    actions.moveToElement(npwpd);
    actions.click();
    actions.sendKeys(inputForm.npwpd);
    
    actions.moveToElement(nama);
    actions.click();
    actions.sendKeys(inputForm.nama);
    
    actions.moveToElement(alamat);
    actions.click();
    actions.sendKeys(inputForm.alamat);
    
    actions.moveToElement(prov);
    actions.click();
    actions.sendKeys(inputForm.prov);
    
    actions.moveToElement(kota_kab);
    actions.click();
    actions.sendKeys(inputForm.kota_kab);
    
    actions.moveToElement(kec);
    actions.click();
    actions.sendKeys(inputForm.kec);
    
    actions.moveToElement(kel_desa);
    actions.click();
    actions.sendKeys(inputForm.kel_desa);
    
    actions.moveToElement(kode_pos);
    actions.click();
    actions.sendKeys(inputForm.kode_pos);
    
    actions.moveToElement(hp);
    actions.click();
    actions.sendKeys(inputForm.hp);
    
    actions.build().perform();
    
    driver.findElement(By.xpath(xpath_loc.updateBtn)).click();
  }
  
  @Test(priority = 16)
  public void fill_out_user_info_bu() throws Exception {
    //WebDriverWait myWait = new WebDriverWait(driver, 10);
    Actions actions = new Actions(driver);
    
    WebElement bu       = driver.findElement(By.xpath(xpath_loc.radioBU));
    WebElement npwpd    = driver.findElement(By.xpath(xpath_loc.npwpdBU));
    WebElement nama     = driver.findElement(By.xpath(xpath_loc.namaBU));
    WebElement alamat   = driver.findElement(By.xpath(xpath_loc.alamatBU));
    WebElement prov     = driver.findElement(By.xpath(xpath_loc.provBU));
    WebElement kota_kab = driver.findElement(By.xpath(xpath_loc.kota_kab_BU));
    WebElement kec      = driver.findElement(By.xpath(xpath_loc.kecBU));
    WebElement kel_desa = driver.findElement(By.xpath(xpath_loc.kel_desa_BU));
    WebElement kode_pos = driver.findElement(By.xpath(xpath_loc.kodePosBU));
    WebElement hp       = driver.findElement(By.xpath(xpath_loc.hpBU));
    
    actions.moveToElement(driver.findElement(By.xpath(xpath_loc.userInfo)));
    actions.click();
    
    actions.moveToElement(bu);
    actions.click();
    
    actions.moveToElement(npwpd);
    actions.click();
    actions.sendKeys(inputForm.npwpd);
    
    actions.moveToElement(nama);
    actions.click();
    actions.sendKeys(inputForm.nama);
    
    actions.moveToElement(alamat);
    actions.click();
    actions.sendKeys(inputForm.alamat);
    
    actions.moveToElement(prov);
    actions.click();
    actions.sendKeys(inputForm.prov);
    
    actions.moveToElement(kota_kab);
    actions.click();
    actions.sendKeys(inputForm.kota_kab);
    
    actions.moveToElement(kec);
    actions.click();
    actions.sendKeys(inputForm.kec);
    
    actions.moveToElement(kel_desa);
    actions.click();
    actions.sendKeys(inputForm.kel_desa);
    
    actions.moveToElement(kode_pos);
    actions.click();
    actions.sendKeys(inputForm.kode_pos);
    
    actions.moveToElement(hp);
    actions.click();
    actions.sendKeys(inputForm.hp);
    
    actions.build().perform();
    System.out.println("debug_16_3");
    driver.findElement(By.xpath(xpath_loc.updateBtnBU)).click();
  }
  
  @Test(priority = 17)
  public void change_pw() throws Exception {
    WebDriverWait myWait = new WebDriverWait(driver, 10);
    Actions actions = new Actions(driver);

    driver.findElement(By.xpath(xpath_loc.topRightBtn)).click();
    myWait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(xpath_loc.logout)));
    myWait.until(ExpectedConditions.elementToBeClickable(By.xpath(xpath_loc.logout)));
    driver.findElement(By.xpath(xpath_loc.logout)).click();
    myWait.until(ExpectedConditions.visibilityOfElementLocated(By.id(identifier.login_btn)));
    WebElement login = driver.findElement(By.id(identifier.login_btn));
    WebElement email = driver.findElement(By.id(identifier.emailLogin));
    WebElement pw    = driver.findElement(By.id(identifier.passwordLogin));
    
    email.sendKeys(inputForm.email2);
    pw.sendKeys(inputForm.password2);
    login.click();
    
    myWait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(xpath_loc.topRightBtn)));
    myWait.until(ExpectedConditions.elementToBeClickable(By.xpath(xpath_loc.topRightBtn)));
    driver.findElement(By.xpath(xpath_loc.topRightBtn)).click();
    myWait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(xpath_loc.profile)));
    myWait.until(ExpectedConditions.elementToBeClickable(By.xpath(xpath_loc.profile)));
    driver.findElement(By.xpath(xpath_loc.profile)).click();
    myWait.until(ExpectedConditions.elementToBeClickable(By.xpath(xpath_loc.changePw)));
    driver.findElement(By.xpath(xpath_loc.changePw)).click();
    myWait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(xpath_loc.chgPwBtn)));
    
    /*driver.navigate().refresh();
    driver.navigate().to("http://devtaxpayer.cartenzgroup.com/revenue/taxpayeraccount/my-profile#tab_change_password");;
    System.out.println("debug_17_1");
    myWait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(xpath_loc.changePw)));
    myWait.until(ExpectedConditions.elementToBeClickable(By.xpath(xpath_loc.changePw)));
    myWait.until(ExpectedConditions.elementToBeClickable(By.xpath(xpath_loc.chgPwBtn)));
    
    driver.findElement(By.xpath(xpath_loc.changePw)).click();
    System.out.println("debug_17_2");
    myWait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(xpath_loc.chgPwBtn)));*/
    System.out.println("debug_17_3");
    WebElement chgPwBtn = driver.findElement(By.xpath(xpath_loc.chgPwBtn));
    WebElement pwLama   = driver.findElement(By.xpath(xpath_loc.pwLama));
    WebElement pwBaru   = driver.findElement(By.xpath(xpath_loc.pwBaru));
    WebElement rePwBaru = driver.findElement(By.xpath(xpath_loc.rePwBaru));
    System.out.println("debug_17_4");
    
    actions.moveToElement(pwLama);
    actions.click();
    actions.sendKeys(inputForm.password2);
    actions.moveToElement(pwBaru);
    actions.click();
    actions.sendKeys(inputForm.password);
    actions.moveToElement(rePwBaru);
    actions.click();
    actions.sendKeys(inputForm.password2);
    actions.moveToElement(chgPwBtn);
    actions.click();
    actions.build().perform();
    
    System.out.println("debug_17_5");
  }
  
  @Test(priority = 18)
  public void login_new_pw() throws Exception {
    WebDriverWait myWait = new WebDriverWait(driver, 10);
    
    driver.findElement(By.xpath(xpath_loc.topRightBtn)).click();
    myWait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(xpath_loc.logout)));
    myWait.until(ExpectedConditions.elementToBeClickable(By.xpath(xpath_loc.logout)));
    driver.findElement(By.xpath(xpath_loc.logout)).click();
    myWait.until(ExpectedConditions.visibilityOfElementLocated(By.id(identifier.login_btn)));
    WebElement login = driver.findElement(By.id(identifier.login_btn));
    WebElement email = driver.findElement(By.id(identifier.emailLogin));
    WebElement pw    = driver.findElement(By.id(identifier.passwordLogin));
    
    email.sendKeys(inputForm.email2);
    pw.sendKeys(inputForm.password);
    login.click();
  }
  
  
  @AfterTest
  public void quit_browser() {
    driver.quit();
  }
}
