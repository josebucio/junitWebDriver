package face;

import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class FacebookBase {
	
	protected WebDriver driver;
	
	protected void setUp(String browser, String url) {
		ChromeOptions opcions = new ChromeOptions();
		opcions.addArguments("--disable-notifications");
		System.setProperty("webdriver.chrome.driver", "C:\\test_automation\\drivers\\chromedriver.exe");
		System.out.println("Arranca el browser porfa y navega a la pagina.");
		driver = new ChromeDriver(opcions);
		driver.get(url);
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
	}
	
	@After
	public void tearDown() {
		System.out.println("Destruye la configuracion");
	//	driver.quit();
	}
	
	public void sendMenssage () {
		WebElement buttonmen;
		WebElement textarea;
		WebElement enviar;
		
		buttonmen = driver.findElement(By.xpath("//a[@href='/messages/t/GESTORIAVEHICULAR25/']"));
	    buttonmen.click();
	    
	    textarea = driver.findElement(By.xpath("textarea[@name='message_body']"));
	    textarea.isEnabled();
	    textarea.sendKeys("Hola como estas?");
	    
	    enviar = driver.findElement(By.xpath("button[@class='_42ft _4jy0 layerConfirm _2ok uiOverlayButton _4jy4 _4jy1 selected _51sy']"));
	    enviar.click();
	    


	}


	public void searchFacebookFriend(String friendName) {
		WebElement buscarpersona;
		WebElement botonbuscar;
		WebElement persona;
		WebElement biografia;
		
		buscarpersona = driver.findElement(By.xpath("//div[@class='innerWrap']//input[@class='_1frb']"));
		botonbuscar = driver.findElement(By.xpath("//button[@data-testid='facebar_search_button']"));
		
		
		buscarpersona.clear();
		buscarpersona.sendKeys(friendName);
		botonbuscar.click();
		
		persona = driver.findElement(By.linkText(friendName));
		
		persona.click();
		
		biografia = driver.findElement(By.linkText("Biografía"));
		
		
		
	
		
		
	}

	public void logIntoFacebook(String user, String password) {
		WebElement campoUsuario; //id=email
		WebElement campoPassword; //id="pass"
		WebElement botonLogin; //data-testid="royal_login_button"
		
		campoUsuario = driver.findElement(By.id("email"));
		campoPassword = driver.findElement(By.id("pass"));
		botonLogin = driver.findElement(By.xpath("//input[@data-testid='royal_login_button']"));
		
		campoUsuario.clear();
		campoUsuario.sendKeys(user);
		campoPassword.clear();
		campoPassword.sendKeys(password);
		botonLogin.click();
		
	}

}
