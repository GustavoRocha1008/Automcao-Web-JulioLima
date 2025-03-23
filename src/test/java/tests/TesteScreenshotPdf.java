package tests;
import Runners.WebRunner;
import org.openqa.selenium.WebDriver;
import utils.ScreenshotHelper;
import utils.PdfHelper;

import java.io.File;
public class TesteScreenshotPdf {
    public static void main(String[] args) {
        WebDriver driver = WebRunner.getDriver();

        driver.get("https://www.google.com");

        // Tira um screenshot e salva na pasta
        File screenshot = ScreenshotHelper.captureScreenshot(driver, "teste_print");

        // Converte para PDF
        PdfHelper.salvarScreenshotEmPdf(screenshot, "screenshots/print_teste.pdf");

        // Fecha o navegador
        WebRunner.fecharNavegador();

        System.out.println("Screenshot salvo como PDF em screenshots/print_teste.pdf!");
    }
}
