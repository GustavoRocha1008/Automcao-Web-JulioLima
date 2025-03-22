package tests;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;

public class InformacoesUsuarioTest {
    @Test
    public void LoginUsuário() {
        // Define o caminho do chromedriver
        System.setProperty("chromedriver", "C:\\Users\\gusta\\OneDrive\\Desktop\\Automação\\chromedriver-win64.exe");
        // Cria uma instância do ChromeDriver
        WebDriver navegador = new ChromeDriver();
        // Acessa o site
        navegador.get("https://www.advantageonlineshopping.com/#/");
        // Criamos o WebDriverWait para esperar até 10 segundos
        WebDriverWait wait = new WebDriverWait(navegador, Duration.ofSeconds(30));
        // Espera até que o ícone de login esteja visível e então clica nele
        WebElement loginAcesso = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("menuUserSVGPath")));
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
        navegador.quit();
    }


    public void 





}
