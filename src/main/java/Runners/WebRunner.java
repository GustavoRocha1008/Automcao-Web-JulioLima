package Runners;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import java.time.Duration;

public class WebRunner {
    private static WebDriver driver;

    public static WebDriver getDriver() {
        if (driver == null) {

            // Criar o navegador
            driver = new ChromeDriver();
            driver.manage().window().maximize();
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

            // Abrir a página desejada
            driver.get("https://www.google.com/");
        }
        return driver;
    }

    public static void fecharNavegador() {
        if (driver != null) {
            driver.quit();
            driver = null;
        }
    }
}
