package tests;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class RealizarCompraTest {
   @Test
   public void realizarCompra(){
        System.setProperty("chromedriver","C:\\Users\\gusta\\OneDrive\\Desktop\\Automação\\chromedriver-win64.exe");
        // Cria uma instância do ChromeDriver
        WebDriver navegador = new ChromeDriver();
        // Acessa o site
        navegador.get("https://www.advantageonlineshopping.com/#/");
        // Criamos o WebDriverWait para esperar até 10 segundos
        WebDriverWait wait = new WebDriverWait(navegador, Duration.ofSeconds(60));
        // Espera até que o ícone de login esteja visível e então clica nele
        WebElement loginAcesso = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("menuUser")));
        loginAcesso.click();
        // Espera até que o campo de nome de usuário esteja visível e envia o nome de usuário
        WebElement campoUsuario = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@name='username' and @type='text']")));
        campoUsuario.sendKeys("Gustavo_Rocha");
        // Espera até que o campo de senha esteja visível e envia a senha
        WebElement campoSenha = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='login ng-scope']//input[@name='password']")));
        campoSenha.sendKeys("Abc@2020");
        // Espera até que o botão de login esteja visível e então clica nele
        WebElement botaoLogin = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//login-modal//div//div//sec-form//sec-sender//button[@id='sign_in_btn']")));
        botaoLogin.click();
        //Clicar em Popular itens e selecionar a opção View Details
        WebElement linkPopular = navegador.findElement(By.name("POPULAR ITEMS"));
        linkPopular.click();
        navegador.findElement(By.id("details_16")).click();
        //escolher a cor do produto e adicionar ao carrinho
        navegador.findElement(By.id("rabbit")).click();
        navegador.findElement(By.xpath("//div[@class='fixedBtn']//button[@name='save_to_cart']")).click();
        // Clicar em checkout e seguinda em next
        navegador.findElement(By.xpath("//header//ul[@class='roboto-light desktop-handler']//button[@id='checkOutPopUp']")).click();
        navegador.findElement(By.xpath("//div[@class='uiview ng-scope']//section//div[@id='orderPayment']//button[@id='next_btn' and @class='a-button nextBtn marginTop75 ng-scope']")).click();
        // clicar em pay now  sistema apresenta a tela order payment com a mensagem "Thank you for buying with Advantage"
        navegador.findElement(By.id("pay_now_btn_MasterCredit")).click();
    }
}
