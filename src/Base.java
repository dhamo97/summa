import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Base {
public static void main(String[] args) {
	String url ="https://www.facebook.com/login/";
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\balus\\eclipse-workspace\\Selenium\\Selenium jar\\chromedriver.exe");
	WebDriver facebook = new ChromeDriver();
	facebook.get(url);
	facebook.quit();
	
}
public static void run(String id, String pass) {
	
	
}
	
}
}
