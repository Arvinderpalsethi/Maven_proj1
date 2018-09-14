package maven_package;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        System.out.println("bye world");
        System.out.println("Added after staging");
        
        WebDriver driver = new ChromeDriver();
        
        driver.get("https://www.amazon.com");
    }
}
