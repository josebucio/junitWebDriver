package imdb;

import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ParentTest {
	
	protected WebDriver driver;
	
	@Before
	public void setUp() {
		System.setProperty("webdriver.chrome.driver", "C:\\test_automation\\drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		
		
		
	}
	
	@After
	public void tearDown() {
		driver.quit();
		
	}
	protected void validateMovieExists() {
		WebElement validarpeli;
		
		
		
		validarpeli = driver.findElement(By.xpath("//td[@class='result_text']/a[@href='/title/tt0099864/?ref_=fn_al_tt_2']"));
		
		
		
		
	}

	protected void searchMovie() {
		WebElement buscarpeli;
		WebElement botonbuscar;
		
		buscarpeli = driver.findElement(By.id("navbar-query"));
		botonbuscar = driver.findElement(By.id("navbar-submit-button"));
		
		buscarpeli.clear();
		buscarpeli.sendKeys("Eso");
		botonbuscar.click();
	}

	protected void validatePage() {
		//WebElement validpagina;
		
		//validpagina = driver.findElement(By.linkText("https://www.imdb.com/"));
		
	}

	protected void navigateToPage(String url) {
		// TODO Auto-generated method stub
		driver.navigate().to(url);
	}
	
	protected void playTrailer() {
		WebElement trailer;
		WebElement time;
		String tiempo;
		
		trailer = driver.findElement(By.xpath("//a[@href='/video/imdb/vi3536037913?playlistId=tt0099864&ref_=tt_ov_vi']"));
		time = driver.findElement(By.xpath("//div[contains(text(),':')]"));
		tiempo = time.toString();
		double ti = Double.valueOf(tiempo).doubleValue();
		
		trailer.click();
		driver.manage().timeouts().implicitlyWait(10,  TimeUnit.SECONDS);
		
	}

	protected void validateCorrectMovie() {
		WebElement peliculacorrecta;
		
		peliculacorrecta = driver.findElement(By.linkText("It"));
		
	}

	protected void selectMovie() {
		WebElement pelicula;
		
		pelicula = driver.findElement(By.xpath("//td[@class='result_text']/a[@href='/title/tt0099864/?ref_=fn_al_tt_2']"));
		pelicula.click();
				
		
	}
	
	protected void validateMovieStars() {
		WebElement validtrailer;
		
		//validtrailer =driver.findElement(By.)
		
	}


}
