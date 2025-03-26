package Logic;

import Pages.AdvantageonlineshoppingPage;
import Runners.WebRunner;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;


public class AdvantageonlineshoppingLogic {
    private WebDriver driver;
    private AdvantageonlineshoppingPage advantageonlineshoppingPage;

    public AdvantageonlineshoppingLogic() {
        this.driver = WebRunner.getDriver(); // Obtém o driver do WebRunner
        this.advantageonlineshoppingPage = new AdvantageonlineshoppingPage(driver); // Inicializa a página com o driver
    }
    public void Homepage(){
        driver.get("https://www.advantageonlineshopping.com/");
    }

    public void MenuUsuario(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(50));
        driver.findElement(advantageonlineshoppingPage.BtnAcesso).click();
    }

     public void RealizarLogin(){
         driver.findElement(advantageonlineshoppingPage.BtnAcesso).click();
         driver.findElement(advantageonlineshoppingPage.InputUsername).sendKeys("Gustavo_Rocha");
         driver.findElement(advantageonlineshoppingPage.InputPassword).sendKeys("Abc@2020");
         WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(50));
         wait.until(ExpectedConditions.invisibilityOfElementLocated(By.className("loader")));
         WebElement element = wait.until(ExpectedConditions.visibilityOf(driver.findElement(advantageonlineshoppingPage.BtnSignIn)));
         element.click(); // Clica no botão quando ele estiver visível
     }
     public void PopularItems(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(50));
        wait.until(ExpectedConditions.invisibilityOfElementLocated(By.className("PopUp")));
        driver.findElement(advantageonlineshoppingPage.PopularItems).click();
        driver.findElement(advantageonlineshoppingPage.LinkDetails).click();
        driver.findElement(advantageonlineshoppingPage.CorBlack).click();
        driver.findElement(advantageonlineshoppingPage.BtnAddToCart).click();
     }
     public void Checkout(){
        driver.findElement(advantageonlineshoppingPage.BtnCheckOut).click();
     }
     public void fluxoCompra(){
        driver.findElement(advantageonlineshoppingPage.BtnNext).click();
        driver.findElement(advantageonlineshoppingPage.BtnPayNow).click();
     }
}