package Logic;

import Pages.AdvantageonlineshoppingPage;
import Runners.WebRunner;
import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;
import static org.junit.Assert.assertTrue;


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
         driver.findElement(advantageonlineshoppingPage.InputUsername).sendKeys("Gustavo_Rocha");
         driver.findElement(advantageonlineshoppingPage.InputPassword).sendKeys("Abc@2020");
         WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(50));
         wait.until(ExpectedConditions.invisibilityOfElementLocated(By.className("loader")));
         WebElement element = wait.until(ExpectedConditions.visibilityOf(driver.findElement(advantageonlineshoppingPage.BtnSignIn)));
         element.click(); // Clica no botão quando ele estiver visível
     }

     public void CreatNewAccount(){
         WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(50));
         WebElement element = wait.until(ExpectedConditions.elementToBeClickable(advantageonlineshoppingPage.LinkCreateAccount));
         try {
             element.click();
         } catch (ElementClickInterceptedException e) {
             ((JavascriptExecutor) driver).executeScript("arguments[0].click();", element);
         }

     }

     public void CreatAccount() {
         driver.findElement(advantageonlineshoppingPage.InputUsernameCadastro).sendKeys("Gustavo_Rocha");
         driver.findElement(advantageonlineshoppingPage.EmailCadastro).sendKeys("gu44789@gmail.com");
         driver.findElement(advantageonlineshoppingPage.PasswordCadastro).sendKeys("Abc@2020");
         driver.findElement(advantageonlineshoppingPage.ConfirmPasswordCadastro).sendKeys("Abc@2020");
         ((JavascriptExecutor) driver).executeScript("window.scrollBy(0,1000);");
         driver.findElement(advantageonlineshoppingPage.CheckboxIagree).click();
     }

     public void UltimoPasso(){
         driver.findElement(advantageonlineshoppingPage.BtoRegister).click();
         // Encontra o elemento e verifica se está visível
         assertTrue("Gustavo_Rocha", driver.findElement(advantageonlineshoppingPage.NomeUsuario).isDisplayed());
     }

     public void AcessoMyaccounnt(){
         driver.findElement(advantageonlineshoppingPage.NomeUsuario).click();
         driver.findElement(advantageonlineshoppingPage.Myaccount).click();
    }

     public void LinkEditAccount(){
         driver.findElement(advantageonlineshoppingPage.LinkEditAccount).click();
     }

     public void AlteraCadastroAccountDetails1() {
         driver.findElement(advantageonlineshoppingPage.FirstName).sendKeys("Gustavo");
         driver.findElement(advantageonlineshoppingPage.LastName).sendKeys("Rocha");
         driver.findElement(advantageonlineshoppingPage.PhoneNumber).sendKeys("11949224945");
         ((JavascriptExecutor) driver).executeScript("window.scrollBy(0,100)");
     }

     public void AlteraCadastroAccountDetails2() {
         WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
         WebElement combobox = wait.until(ExpectedConditions.elementToBeClickable(advantageonlineshoppingPage.Country));

// Interage com o combobox depois de garantir que ele está pronto
         Select select = new Select(combobox);
         select.selectByVisibleText("Tonga");
        driver.findElement(advantageonlineshoppingPage.City).click();
        driver.findElement(advantageonlineshoppingPage.Address).sendKeys("Rua alziro viera");
        driver.findElement(advantageonlineshoppingPage.PostaCodel).sendKeys("0665879");
        driver.findElement(advantageonlineshoppingPage.Region).sendKeys("Itapevi-SP");
     }

     public void BtoSaveAccountDetails(){
        driver.findElement(advantageonlineshoppingPage.BtoSave).click();
        assertTrue("MY ACCOUNT", driver.findElement(advantageonlineshoppingPage.TelaMyaccount).isDisplayed());
     }

     public void AlteraCadastradoPreferredPaymentMethod1(){
        driver.findElement(advantageonlineshoppingPage.LinkPreferred).click();
        driver.findElement(advantageonlineshoppingPage.OpcMasterCredit).click();
     }

     public void AlteraCadastradoPreferredPaymentMethod2(){
        driver.findElement(advantageonlineshoppingPage.InputCardNumber).sendKeys("5148 8147 2871 0027");
        driver.findElement(advantageonlineshoppingPage.InputCVVNumber).sendKeys("716");
        driver.findElement(advantageonlineshoppingPage.ComboBoxMM).click();
        driver.findElement(advantageonlineshoppingPage.ComboBoxYYY).click();
        driver.findElement(advantageonlineshoppingPage.InputCardholdername).sendKeys("Teste 1234");
    }

     public void BtoSavePreferredPaymentMethod(){
        driver.findElement(advantageonlineshoppingPage.BtoSaveMethod).click();
        assertTrue("MY ACCOUNT", driver.findElement(advantageonlineshoppingPage.TelaMyaccount).isDisplayed());
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