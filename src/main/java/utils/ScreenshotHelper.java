package utils;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import java.io.File;
import java.io.IOException;

public class ScreenshotHelper {
    public static File captureScreenshot(WebDriver driver, String nomeArquivo) {
        try {
            // Tira o screenshot
            File srcFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);

            // Cria a pasta se não existir
            File pastaScreenshots = new File("screenshots/");
            if (!pastaScreenshots.exists()) {
                pastaScreenshots.mkdir();
            }

            // Salva a imagem
            File destino = new File(pastaScreenshots, nomeArquivo + ".png");
            FileUtils.copyFile(srcFile, destino);

            return destino;
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }
}
