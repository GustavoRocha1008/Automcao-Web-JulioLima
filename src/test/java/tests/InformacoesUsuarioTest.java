package tests;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class InformacoesUsuarioTest {
    @Test
    public void testAdcionarUmaInformacaoDoUsuario (){
        System.setProperty("chromedriver","C:\\Users\\gusta\\OneDrive\\Desktop\\Automação\\chromedriver-win64.exe");
        WebDriver navegador = new ChromeDriver();
        navegador.get("http://www.juliodelima.com.br/taskit/");

    }
}
